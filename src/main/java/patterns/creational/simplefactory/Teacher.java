package patterns.creational.simplefactory;

public class Teacher implements Person {

    @Override
    public void role() {
        System.out.println("Simple Factory: Teacher role");
    }
}
