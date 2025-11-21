package oopsydemo;

public class Person {
private String name;
private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
    public void keeppet(animal al,String something){
        System.out.println("年龄为"+age +"岁"+name+""+al.getColour()+""+al.getAge()+"");
        System.out.println(al.getColour()+""+al.getAge()+""+al.eat(something)+"");
        if(al instanceof dog dg){
            dg.lookhome();
        } else if (al instanceof cat ct ) {
             ct.catmouse();
        }
    }


}
