package solid.ioc.breakingrule;


import solid.ioc.EducationEstablishment;

public class EducationService {

    private final EducationEstablishment educationEstablishment;

    public EducationService() {
        this.educationEstablishment = new EducationEstablishment("EducationService");
    }
}
