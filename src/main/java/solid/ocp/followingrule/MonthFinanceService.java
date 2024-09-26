package solid.ocp.followingrule;

import solid.srp.followingrule.Teacher;

public class MonthFinanceService implements FinanceService {

    @Override
    public int calculateBonus(Teacher teacher) {
        return 10 * teacher.getAge() * teacher.getGrade();
    }
}
