package thinkinjava.typeinfo;

/**
 * Created by yelianghuo on 2018/7/12.
 */
public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle) {
        this.title = jobTitle;
        person = Person.NULL;
    }

    public Position(String jobTile, Person employee) {
        title = jobTile;
        person = employee;
        if(person == null)
            person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPerson(Person person) {
        this.person = person;
        if(person == null) {
            this.person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
