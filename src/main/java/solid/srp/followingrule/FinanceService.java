package solid.srp.followingrule;

public class FinanceService {

    static int calculateBonus(Teacher teacher) {
        return 100 * teacher.getAge() * teacher.getGrade();
    }
}
