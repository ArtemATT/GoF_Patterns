package patterns.creational.builder.director;

public class UserDTO {

    private final String name;

    private final int age;

    private UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name=%s, Age=%s".formatted(name, age);
    }

    public static class UserDTOBuilder implements UserBuilder {

        private String name;

        private int age;

        @Override
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        @Override
        public UserDTO build() {
            return new UserDTO(name, age);
        }
    }
}
