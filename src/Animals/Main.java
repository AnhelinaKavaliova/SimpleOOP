package Animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kubonya", 13);
        Dog dog = new Dog("Julia", 5);

        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's age: " + dog.getAge());
        dog.sleep();

        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Cat's age: " + cat.getAge());
        cat.jump();
    }
}
