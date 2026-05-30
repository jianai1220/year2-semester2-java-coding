public enum Color {
    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");
    private String hexCode;
    private Color(String hexCode) {
    this.hexCode = hexCode;
    }
    public String getHexCode() {
    return hexCode;
    }
    public static void main(String [] a) {
    for (Color color : Color.values())
    System.out.println((color.ordinal() + 1) + ") " + color + " has code " + color.getHexCode());
    if (Color.GREEN.equals(Color.RED))
        System.out.println("GREEN and RED are two different colors.");
    else
        System.out.println("GREEN and RED are the same color.");
}
}