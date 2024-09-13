package patterns.creational.simplefactory;

public class PersonFactory {

    public Person createPerson(Role role) {

        return switch (role) {
            case Role.STUDENT -> new Student();
            case Role.TEACHER -> new Teacher();
        };
    }
}
