package edu.prog2.Model;

public enum TypeCargo {
    HOPPER("HOPPER"),
    OPEN("OPEN"),
    PLATAFORM("PLATAFORM"),
    CAGE("CAGE"),
    TANK("TANK"),
    CLOSE("CLOSE"),
    COOLED("COOLED");
    private String value;
    private TypeCargo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TypeCargo getEnum(String value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (TypeCargo v : values()) {
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
