package patterns.creational.builder.chain;

public class UserDTO {

    private String name;

    private int age;

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name=%s, Age=%s".formatted(name, age);
    }

    public UserDTOBuilder toBuilder() {
        return new UserDTOBuilder().setName(this.getName())
                .setAge(this.getAge());
    }

    public static class UserDTOBuilder {

        private String name;

        private int age;

        private UserDTO userDTO;

        public UserDTOBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserDTOBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserDTO build() {
            userDTO = new UserDTO();
            userDTO.setName(name);
            userDTO.setAge(age);
            return userDTO;
        }
    }
}
