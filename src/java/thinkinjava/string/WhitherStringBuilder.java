package thinkinjava.string;

public class WhitherStringBuilder {
    public String implicit(String[] fiels) {
        String result = "";
        for (int i = 0; i < fiels.length; i++) {
            result += fiels[i];
        }
        return result;
    }

    public String explicit(String[] fiels) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fiels.length; i++) {
            result.append(fiels[i]);
        }
        return result.toString();
    }

}
