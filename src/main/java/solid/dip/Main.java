package solid.dip;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {

        Faker faker = new Faker();
        EducationEstablishment school = new School();
        EducationEstablishment university = new University();
        Person person = new Person(faker.funnyName().name());
        EducationService educationService = new EducationService(school);
        educationService.registerPerson(person);
        System.out.println("*".repeat(50));
        educationService = new EducationService(university);
        educationService.registerPerson(person);
    }
}
