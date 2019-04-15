package thinkinjava.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        Predicate<Object> integerPredicate =  i -> i != null;
        Integer i = 1;
        System.out.println(integerPredicate.test(i));

        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.stream().filter(integerPredicate).count();
        List<Integer> list1 = Stream.of(1, 2, 3).map(item -> item+1).collect(Collectors.toList());
        System.out.println(list1);

        List<String> strings = Stream.of("1asdsad", "avx", "arc","3rtyd").filter(item -> isNum(item.charAt(0))).collect(Collectors.toList());

        List<String> sortStr = strings.stream().sorted(Comparator.comparing(item -> item.length())).collect(Collectors.toList());
        System.out.println(sortStr);

        List<Person> personList = Arrays.asList(new Person("A", 28, 56), new Person("B", 22, 60), new Person("C", 23, 50));
        System.out.println(personList);

        // sort
        List<Person> sortPersons = personList.stream().sorted(Comparator.comparing(item -> item.getWeigt())).collect(Collectors.toList());
        System.out.println(sortPersons);

        // min
        Person low = personList.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get();
        System.out.println(low);

        /**
         * 能否在stram中更改item，并且生成一个新的list？？？
         */
        personList.stream().forEach(item -> item.setName("aaa"));
        System.out.println(personList);

        List<String> stringList = null;
        for (String s : stringList) {
            System.out.println("hellp");
        }


    }

    static boolean isNum(char c) {
        return Character.isDigit(c);
    }
}

class Person {
    String name;

    int age;

    double weigt;

    public Person() {
    }

    public Person(String name, int age, double weigt) {
        this.name = name;
        this.age = age;
        this.weigt = weigt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigt() {
        return weigt;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigt=" + weigt +
                '}';
    }
}
