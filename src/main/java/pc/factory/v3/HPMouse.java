package pc.factory.v3;

/**
 * 具体产品
 */
public class HPMouse implements Mouse {
    @Override
    public void run() {
        System.out.println("HPMouse");
    }
}
