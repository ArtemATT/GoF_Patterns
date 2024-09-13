package patterns.creational.abstractfactory;

public class SchoolStudent implements Student {

    @Override
    public void study() {
        System.out.println("School student is studying!");
    }
}
