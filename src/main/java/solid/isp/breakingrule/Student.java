package solid.isp.breakingrule;

public class Student implements Person {

    @Override
    public void teach() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void learn() {
        System.out.println("Students are learning ...");
    }
}
