package az.rock.lesson.cryptography;

public enum Constant {
    ALPHABET(" ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    private String value;
    Constant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
