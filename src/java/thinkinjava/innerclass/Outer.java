package thinkinjava.innerclass;

/**
 * Created by yelianghuo on 2018/7/15.
 */
public class Outer {

    void outerMethod(){
        final  String localVar = "abc";

		/*定义在方法中的内部类*/
        class Inner{
            void innerMethod(){
                String a = localVar;
            }
        }
        class A{}
    }
}

