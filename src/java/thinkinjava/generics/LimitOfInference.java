package thinkinjava.generics;

import thinkinjava.typeinfo.Person;

import java.util.*;

/**
 * Created by yelianghuo on 2018/7/29.
 */
public class LimitOfInference {
    static void f(Map<Person, List<? extends Pet>> personListMap) {}

    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> personPetMap = New.map();
        f(New.<Person, List<? extends Pet>>map());
    }
}
