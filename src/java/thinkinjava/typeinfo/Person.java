package thinkinjava.typeinfo;

/**
 * Created by yelianghuo on 2018/7/12.
 */
public class Person {
    private  String first;
    private  String last;
    private  String address;
    public Person() {}
    public Person(String first, String last, String address) {
        this.address = address;
        this.first = first;
        this.last = last;
    }
    public class testtt{
        public void say(){
            System.out.println("hello world");
        }
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
