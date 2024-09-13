package patterns.creational.builder.director;

public interface UserBuilder {

    UserBuilder setName(String name);
    UserBuilder setAge(int age);
    UserDTO build();
}
