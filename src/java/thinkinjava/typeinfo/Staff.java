package thinkinjava.typeinfo;

import java.util.ArrayList;

/**
 * Created by yelianghuo on 2018/7/12.
 */
public class Staff extends ArrayList<Position> {

    public Staff(String... titles) {
        add(titles);
    }

    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public void fillPosition(String title, Person hire) {
        for (Position p : this) {
            if (p.getTitle().equals(title) && p.getPerson() == Person.NULL) {
                p.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not availble");
    }

    public boolean positionAvailble(String title) {
        for (Position p : this) {
            if (p.getTitle().equals(title) && p.getPerson() == Person.NULL)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO", "Product Manager");
        staff.fillPosition("President", new Person("me", "Last", "the hop"));
        if(staff.positionAvailble("CTO")) {
            staff.fillPosition("CTO", new Person("xiao", "zhen", "huangshi"));
        }

        for(Position p : staff){
            System.out.println(p);
        }
        Person p = new Person();
        Person.testtt tt = p.new testtt();
        tt.say();
        //System.out.println(staff);
    }
}
