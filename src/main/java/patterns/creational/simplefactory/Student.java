package patterns.creational.simplefactory;

public class Student implements Person {

    @Override
    public void role() {
        System.out.println("Simple Factory: Student role");
    }
}
