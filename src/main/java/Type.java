import lombok.Data;
import lombok.Getter;

public enum Type {

    A_TYPE(1);

    private final Integer type;

    Type(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
