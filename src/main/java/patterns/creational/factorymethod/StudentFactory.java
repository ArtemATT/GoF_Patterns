package patterns.creational.factorymethod;

public class StudentFactory implements PersonFactory {

    @Override
    public Person createPerson() {
        return new Student();
    }
}
