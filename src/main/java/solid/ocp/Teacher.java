package solid.ocp;

import lombok.Getter;

@Getter
public class Teacher {

    private final String name;
    private final int age;
    private final int grade;

    public Teacher(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}