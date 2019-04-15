package worktest;


import com.sun.istack.internal.NotNull;

public class NullTest extends NullUtil{

    @NotNull
    private String name;

    @NotNull
    private Integer age;
    private Boolean gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getGender() {
        return gender;
    }

    public static void main(String[] args) throws Exception{
        NullTest n = new NullTest();

        n.nullFieldValidate();
    }
}
