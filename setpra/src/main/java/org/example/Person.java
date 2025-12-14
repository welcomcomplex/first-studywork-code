package org.example;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int yuwenscore;
    private int mathscore;
    private int englishscore;


    public Person() {
    }

    public Person(String name, int age, int yuwenscore, int mathscore, int englishscore) {
        this.name = name;
        this.age = age;
        this.yuwenscore = yuwenscore;
        this.mathscore = mathscore;
        this.englishscore = englishscore;
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

    /**
     * 获取
     * @return yuwenscore
     */
    public int getYuwenscore() {
        return yuwenscore;
    }

    /**
     * 设置
     * @param yuwenscore
     */
    public void setYuwenscore(int yuwenscore) {
        this.yuwenscore = yuwenscore;
    }

    /**
     * 获取
     * @return mathscore
     */
    public int getMathscore() {
        return mathscore;
    }

    /**
     * 设置
     * @param mathscore
     */
    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    /**
     * 获取
     * @return englishscore
     */
    public int getEnglishscore() {
        return englishscore;
    }

    /**
     * 设置
     * @param englishscore
     */
    public void setEnglishscore(int englishscore) {
        this.englishscore = englishscore;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", yuwenscore = " + yuwenscore + ", mathscore = " + mathscore + ", englishscore = " + englishscore + "}";
    }

    @Override
    public int compareTo(Person o) {
       if(this.getEnglishscore()+this.getMathscore()+this.getYuwenscore()-o.getEnglishscore()+o.getMathscore()+o.getYuwenscore() != 0){
           return this.getEnglishscore()+this.getMathscore()+this.getYuwenscore()-o.getEnglishscore()+o.getMathscore()+o.getYuwenscore();
       }
       if(this.getMathscore() - o.getMathscore() != 0){
           return this.getMathscore() - o.getMathscore() ;
       }
       if(this.getEnglishscore() - o.getEnglishscore() != 0){
           return this.getEnglishscore() - o.getEnglishscore();
       }
       if (this.getAge() - o.getAge() != 0){
           return this.getAge() - o.getAge();
       }
       return this.getName().compareTo(o.getName());
    }
}
