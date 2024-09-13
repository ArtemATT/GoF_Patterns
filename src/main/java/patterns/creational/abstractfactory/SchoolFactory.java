package patterns.creational.abstractfactory;

public class SchoolFactory implements EducationFactory {

    @Override
    public Teacher createTeacher() {
        return new SchoolTeacher();
    }

    @Override
    public Student createStudent() {
        return new SchoolStudent();
    }
}
