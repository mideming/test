package pc.factory.v3;

/**
 * 抽象工厂
 */
public interface PcFactory {
    Mouse createMouse();

    KeyBoard createKeyBoard();
}
