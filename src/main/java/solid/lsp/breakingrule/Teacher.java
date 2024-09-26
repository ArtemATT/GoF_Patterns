package solid.lsp.breakingrule;

public class Teacher implements Person {

    @Override
    public void getInfo() {
        System.out.println("Teacher info...");
    }

    @Override
    public void teach() {
        System.out.println("Teaching...");
    }
}
