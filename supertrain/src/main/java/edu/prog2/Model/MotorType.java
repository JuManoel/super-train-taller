package edu.prog2.Model;

public enum MotorType {
    STEAM("SETAM"),
    DIESEL("DIESEL"),
    ELETRIC("ELECTRIC");
    private String value;
    private MotorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static MotorType getEnum(String value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (MotorType v : values()) {
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
