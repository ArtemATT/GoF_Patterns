package solid.ocp.followingrule;

import solid.srp.followingrule.Teacher;

public class AnnualFinanceService implements FinanceService {

    @Override
    public int calculateBonus(Teacher teacher) {
        return 100 * teacher.getAge() * teacher.getGrade();
    }
}
