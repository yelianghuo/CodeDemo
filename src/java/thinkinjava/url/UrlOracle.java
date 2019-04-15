package thinkinjava.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlOracle {
    public static void main(String[] args) throws Exception{

            URL oracle = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
    }

}
