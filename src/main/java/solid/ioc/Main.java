package solid.ioc;

import com.github.javafaker.Faker;
import solid.ioc.followingrule.EducationService;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        EducationService educationService = new EducationService(new EducationEstablishment(faker.funnyName().name()));
        educationService.printInfo();
    }
}
