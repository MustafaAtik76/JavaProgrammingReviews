package week15_12_17_2022.method_overriding.Task3;

public class Manager extends Employee{

    @Override
    public int salary() {
        // I am getting the base salary from Parent Class
         return super.salary()+20000;
    }
}
