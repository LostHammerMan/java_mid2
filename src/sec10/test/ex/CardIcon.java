package sec10.test.ex;

public enum CardIcon {

    SPADE("\u2660"), HEART("\u2665"), DIAMOND("\u2666"), CLOVER("\u2663");

    private final String icon;

    CardIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
