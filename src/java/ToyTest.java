/**
 * Created by yelianghuo on 2018/7/10.
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy() {}
    Toy(int i) {

    }

    @Override
    public String toString() {
        return "toy";
    }
    public void say() {
        System.out.println("i am toy");
    }
}


class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy() {
        super(1);
    }
    @Override
    public String toString() {
        return "fancy toy";
    }
    public void say() {
        System.out.println("i am fancy toy");
    }
}

public class ToyTest {
    public static void main(String[] args) throws Exception{
        Class c = null;
        c = FancyToy.class;

        Object fancyToy = c.newInstance();
        System.out.println(fancyToy);
        Class up = c.getSuperclass();
        System.out.println(up.getSimpleName());
        Object toy = up.newInstance();
        System.out.println(toy);
//        if(up.getSimpleName().equals("Toy")){
//            Toy tt = (Toy)toy;
//            tt.say();
//        }
        if(toy instanceof Toy) {
            ((Toy) toy).say();
        }
    }
}
