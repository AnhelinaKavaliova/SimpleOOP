package Animals;

public class Cat extends Animal implements Jumpable{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void purr(){
        System.out.println("prr-prr");
    }

    @Override
    public void jump() {
        System.out.println("It jumps");
    }
}
