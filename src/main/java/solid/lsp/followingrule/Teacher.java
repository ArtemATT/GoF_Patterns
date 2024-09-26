package solid.lsp.followingrule;

public class Teacher implements Person, Teachable {

    @Override
    public void getInfo() {
        System.out.println("Teacher info...");
    }

    @Override
    public void teach() {
        System.out.println("Teaching...");
    }
}
