public class Wall {
    private Dimensions dimensions;
    private String color;
    private int count;

    public Wall(Dimensions dimensions, String color, int count){
        this.dimensions = dimensions;
        this.color = color;
        this.count = count;
    }

    public void wasPainted(String newColor){
        System.out.println("The walls were " + color + ". But now they've been painted " + newColor + ".");
        color = newColor;
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
}
