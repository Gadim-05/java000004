public enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special Character");

    private final String value;

    InputCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
