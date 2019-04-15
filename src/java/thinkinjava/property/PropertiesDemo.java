package thinkinjava.property;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        new PropertiesDemo().filepropertyTest("src/resources/properties.xml");
    }

    public void propertyTest() {
        Properties gfg = new Properties();
        Set Url;
        String str;

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        Url = gfg.keySet();
        Iterator itr = Url.iterator();

        while (itr.hasNext()) {
            str = (String)itr.next();
            System.out.println("The URL for " + str +
                    " is " + gfg.getProperty(str));
        }
    }

    public void filepropertyTest(String fileName) {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Set url = props.keySet();
        Iterator itr = url.iterator();
        while (itr.hasNext()) {
            System.out.println(props.getProperty((String) itr.next()));
        }


    }
}
