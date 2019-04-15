package thinkinjava.innerclass;

/**
 * Created by yelianghuo on 2018/7/15.
 */
public class Factories {

    public static void serviceComsumer(ServiceFactory factory) {
        Services services = factory.getService();
        services.method1();
        services.method2();
    }

    public static void main(String[] args) {
        serviceComsumer(Implementation1.factory);
        serviceComsumer(Implementation2.factory);
    }
}
