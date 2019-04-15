package thinkinjava.arrays;

import java.util.Arrays;

/**
 * Created by yelianghuo on 2018/8/28.
 */
class Person{
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:" + id +", name: " + this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CopyTest {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        Person p = new Person(1, "hqmm");

        Arrays.fill(persons, p);
        System.out.println(persons[0].toString());
        p.setName("ylh");
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());
        persons[2].setName("qqqqq");
        System.out.println(persons[0].toString());
        System.out.println(persons[1].toString());

    }
}
