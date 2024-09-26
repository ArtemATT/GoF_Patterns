package solid.isp.breakingrule;

public class Teacher implements Person {

    @Override
    public void teach() {
        System.out.println("Teaching students ...");
    }

    @Override
    public void learn() {
        throw new UnsupportedOperationException();
    }
}
