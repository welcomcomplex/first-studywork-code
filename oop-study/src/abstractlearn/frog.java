package abstractlearn;

public class frog extends Animal{
    public frog(){
        super();
    }

    public frog(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("frog eat chong");
    }
}
