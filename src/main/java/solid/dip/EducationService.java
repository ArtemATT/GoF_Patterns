package solid.dip;

public class EducationService {

    private final EducationEstablishment educationEstablishment;

    public EducationService(EducationEstablishment educationEstablishment) {
        this.educationEstablishment = educationEstablishment;
    }

    public void registerPerson(Person person) {
        educationEstablishment.registerPerson(person);
    }
}
