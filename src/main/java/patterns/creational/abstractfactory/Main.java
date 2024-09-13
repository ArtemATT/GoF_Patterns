package patterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {

        EducationFactory schoolFactory = new SchoolFactory();
        Student schoolStudent = schoolFactory.createStudent();
        Teacher schoolTeacher = schoolFactory.createTeacher();
        schoolStudent.study();
        schoolTeacher.teach();

        UniversityFactory universityFactory = new UniversityFactory();
        Student universityStudent = universityFactory.createStudent();
        Teacher universityTeacher = universityFactory.createTeacher();
        universityStudent.study();
        universityTeacher.teach();
    }
}
