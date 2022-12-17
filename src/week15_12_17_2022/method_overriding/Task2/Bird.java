package week15_12_17_2022.method_overriding.Task2;

public class Bird extends Animal{

    @Override
    public void move() {
        super.move();
        System.out.println("Bird is flying");
    }
}
