package solid.srp.breakingrule;

public class Teacher {

    private final String name;
    private final int age;
    private final int grade;

    public Teacher(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getTeacherInfo() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nGrade: " + this.grade;
    }

    public int calculateBonus() {
        return 100 * this.age * this.grade;
    }
}
