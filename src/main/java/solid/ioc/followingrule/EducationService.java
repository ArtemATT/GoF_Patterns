package solid.ioc.followingrule;

import solid.ioc.EducationEstablishment;

public class EducationService {

    private final EducationEstablishment educationEstablishment;

    public EducationService(EducationEstablishment educationEstablishment) {
        this.educationEstablishment = educationEstablishment;
    }

    public void printInfo() {
        System.out.printf("Service is established for %s%n", educationEstablishment.name());
    }
}
