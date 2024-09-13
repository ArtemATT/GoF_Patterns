package patterns.creational.builder.chain;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        UserDTO userDTO = UserDTO.getBuilder()
                .setName(faker.funnyName().name())
                .setAge(faker.number().numberBetween(1, 80))
                .build();
        System.out.printf("Initial user: %s%n", userDTO);

        UserDTO updatedUserDTO = userDTO.toBuilder().setName(faker.funnyName().name())
                .setAge(faker.number().numberBetween(1, 80))
                .build();
        System.out.printf("Updated user: %s%n", updatedUserDTO);
    }
}
