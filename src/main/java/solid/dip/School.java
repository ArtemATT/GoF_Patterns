package solid.dip;

public class School implements EducationEstablishment {

    @Override
    public void registerPerson(Person person) {
        System.out.printf("Wow, [%s] entered school!%n", person.name());
    }
}
