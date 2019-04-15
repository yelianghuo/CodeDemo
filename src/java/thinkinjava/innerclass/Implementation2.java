package thinkinjava.innerclass;

/**
 * Created by yelianghuo on 2018/7/15.
 */
public class Implementation2 implements Services {
    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Services getService() {
            return new Implementation2();
        }
    };
}
