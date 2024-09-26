package solid.ocp.followingrule;

import solid.srp.followingrule.Teacher;

public class ExtraFinanceService implements FinanceService {

    @Override
    public int calculateBonus(Teacher teacher) {
        return teacher.getAge() * teacher.getGrade();
    }
}
