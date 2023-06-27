package gr.aueb.cf.ch16.abstractclass;

public class Cat extends Animal{
    // Εννοείται ότι καλείται
//    public Cat() {
//        super();
//    }

    @Override
    public void speak() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" ... ate all her food!");
    }

    @Override
    public String toString() {
        return getName() + ", " +getName();
    }
}
