package solid.ocp.breakingrule;

import solid.srp.followingrule.Teacher;

public class FinanceService {

    static int calculateBonus(Teacher teacher, BonusType bonusType) {
        int base = teacher.getAge() * teacher.getGrade();
        return switch (bonusType) {
            case MONTH -> 10 * base;
            case ANNUAL -> 100 * base;
            case EXTRA -> base;
        };
    }
}
