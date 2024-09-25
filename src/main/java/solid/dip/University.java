package solid.dip;

public class University implements EducationEstablishment {

    @Override
    public void registerPerson(Person person) {
        System.out.printf("Wow,[%s] entered university!%n", person.name());
    }
}
