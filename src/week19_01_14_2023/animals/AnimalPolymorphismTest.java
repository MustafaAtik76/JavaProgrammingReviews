package week19_01_14_2023.animals;

public class AnimalPolymorphismTest {

    public static void main(String[] args) {
        // implement polymorphism
        // ParentClass (Reference Type) reference = new SubClassConstructor();

        Animal animal = new Bird();
        animal.move();
        animal = new Cow();
        animal.move();
        animal = new Fish();
        animal.move();

        System.out.println("----------------------------------------------.");

        Animal animal1 = new Bird();

        // Reference type is deciding which methods are accessible.
        // Object is deciding which methods are implemented

        ((Bird)animal1).hunt();





    }
}
