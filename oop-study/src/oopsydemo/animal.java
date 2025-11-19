package oopsydemo;

public class animal {
    private int age;
    private String colour;


    public animal() {
    }

    public animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * 设置
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "animal{age = " + age + ", colour = " + colour + "}";
    }

    public String eat(String something){
        return something;
    }
}
