package pc.factory.v2;

/**
 * 具体工厂
 */
public class HPMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }
}
