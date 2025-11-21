package abstractlearn;

public class sheep extends Animal{
    public sheep(){
        super();
    }

    public sheep(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("sheep eat caw");
    }
}
