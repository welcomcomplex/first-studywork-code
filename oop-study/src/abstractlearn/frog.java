package abstractlearn;

public class frog extends Animal{
    public frog(){
        super();
    }

    public frog(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("1");
    }


}
