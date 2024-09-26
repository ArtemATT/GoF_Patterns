package solid.lsp.breakingrule;

public class Student implements Person {

    @Override
    public void getInfo() {
        System.out.println("Students info ...");
    }

    @Override
    public void teach() {
        throw new UnsupportedOperationException();
    }
}
