package patterns.creational.factorymethod;

public class TeacherFactory implements PersonFactory {

    @Override
    public Person createPerson() {
        return new Teacher();
    }
}
