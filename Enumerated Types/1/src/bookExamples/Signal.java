package bookExamples;

public enum Signal {
    GREEN("GO"),
    YELLOW("READY"),
    RED("STOP");

    private final String description;

    private Signal(String s) {
        this.description = s;
    }

    public String getDescription() {
        return description;
    }

}
