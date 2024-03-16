package edu.prog2.Model;

public enum TypeSpeedCurve {
    N("N"),
    A("A"),
    B("B"),
    D("D");
    private String value;
    private TypeSpeedCurve(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TypeSpeedCurve getEnum(String value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (TypeSpeedCurve v : values()) {
            if (value.equalsIgnoreCase(v.value)) {
                return v;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return value;
    }
}
