package patterns.creational.simplefactory;

public class Main {

    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        Person teacher = personFactory.createPerson(Role.TEACHER);
        teacher.role();

        Person student = personFactory.createPerson(Role.STUDENT);
        student.role();
    }
}
