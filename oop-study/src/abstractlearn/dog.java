package abstractlearn;

public class dog extends Animal{
    public dog(){
        super();
    }

    public dog(String name,int age){
        super(name,age);
    }


    public void eat(){
        System.out.println("dog eat bood");
    }
}
