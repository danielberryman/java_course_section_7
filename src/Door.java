public class Door {
    private Dimensions dimensions;
    private String color;
    private int count;
    private String style;

    public Door(Dimensions dimensions, String color, int count, String style){
        this.dimensions = dimensions;
        this.color = color;
        this.count = count;
        this.style = style;
    }

    public void openDoor(){
        System.out.println(color + " door has opened.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public String getStyle() {
        return style;
    }
}
