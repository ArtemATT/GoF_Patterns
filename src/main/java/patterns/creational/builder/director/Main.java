package patterns.creational.builder.director;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.funnyName().name();
        int age = faker.number().numberBetween(1, 80);

        UserBuilder userBuilder = new UserDTO.UserDTOBuilder();
        UserDirector userDirector = new UserDirector(userBuilder);
        UserDTO user = userDirector.newUser(name, age);

        System.out.println(user);
    }
}
