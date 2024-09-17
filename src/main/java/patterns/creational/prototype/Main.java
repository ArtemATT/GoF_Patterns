package patterns.creational.prototype;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Student student = new Student(faker.funnyName().name(), 3);
        System.out.println(student);

        Student clonedStudent = student.clone();
        clonedStudent.setName(faker.funnyName().name());
        System.out.println(clonedStudent);
    }
}
