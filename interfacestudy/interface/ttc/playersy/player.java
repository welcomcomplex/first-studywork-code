package playersy;

public abstract class player extends person {


    public player() {
        super();
    }

    public player(String name,int age) {
        super(name, age);
    }

    public abstract void study();
}
