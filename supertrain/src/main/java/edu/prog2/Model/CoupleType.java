package edu.prog2.Model;

public enum CoupleType {
    MANUAL("MANUAL"),
    SEMIPERMANENT("SEMIPERMANENT"),
    AUTOMATIC("AUTOMATIC");
    private String value;
    private CoupleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CoupleType getEnum(String value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (CoupleType v : values()) {
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
