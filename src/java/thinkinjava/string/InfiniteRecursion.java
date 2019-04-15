package thinkinjava.string;

import java.util.ArrayList;

public class InfiniteRecursion {
    @Override
    public String toString() {
//        return super.toString();
//        return " InfiniteRecursion address: " + super.toString() + "\n";
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        java.util.List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
