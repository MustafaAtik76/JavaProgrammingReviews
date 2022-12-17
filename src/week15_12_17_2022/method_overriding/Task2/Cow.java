package week15_12_17_2022.method_overriding.Task2;

public class Cow extends Animal{

    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName()+" is walking");
    }
}
