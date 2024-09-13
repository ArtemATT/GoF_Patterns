package patterns.creational.builder.director;

public class UserDirector {

    private final UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public UserDTO newUser(String name, int age) {
        return userBuilder.setName(name)
                .setAge(age)
                .build();
    }
}
