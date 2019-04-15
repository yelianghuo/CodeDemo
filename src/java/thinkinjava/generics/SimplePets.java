package thinkinjava.generics;

import thinkinjava.typeinfo.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by yelianghuo on 2018/7/29.
 */
public class SimplePets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> personPetMap = New.map();
    }
}
