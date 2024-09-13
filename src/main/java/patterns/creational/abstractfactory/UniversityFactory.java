package patterns.creational.abstractfactory;

public class UniversityFactory implements EducationFactory {

    @Override
    public Teacher createTeacher() {
        return new UniversityTeacher();
    }

    @Override
    public Student createStudent() {
        return new UniversityStudent();
    }
}
