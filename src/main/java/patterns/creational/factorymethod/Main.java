package patterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {

        PersonFactory personFactory = new StudentFactory();
        Person student = personFactory.createPerson();
        student.role();

        PersonFactory teacherFactory = new TeacherFactory();
        Person teacher = teacherFactory.createPerson();
        teacher.role();
    }
}
