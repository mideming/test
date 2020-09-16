package pc.factory.v1;

public class MouseFactory {
    public static Mouse getMouse(String type) {
        if ("Dell".equals(type)) {
            return new DellMouse();
        } else if ("HP".equals(type)) {
            return new HPMouse();
        }else {
            return null;
        }
    }
}
