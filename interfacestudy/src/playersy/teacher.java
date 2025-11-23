package playersy;

public abstract class teacher extends person {


    public teacher() {
        super();
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
