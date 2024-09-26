package solid.isp.followingrule;

public class Teacher implements Teachable {

    @Override
    public void teach() {
        System.out.println("Teaching students ...");
    }
}
