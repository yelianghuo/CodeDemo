package thinkinjava.disposeFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yelianghuo on 2018/9/7.
 */
public class Main {

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
                stringBuilder.append(tempString + ", ");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        // /Users/yelianghuo/Workspaces/JavaPros/logging-log4j2/log4j-core/target/test-classes/org/apache/logging/log4j/core/appender
        readFileByLines("src/thinkinjava/");


    }
}
