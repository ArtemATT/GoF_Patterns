package patterns.creational.abstractfactory;

public class UniversityTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("University teacher is teaching!");
    }
}
