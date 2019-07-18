public class Floor {
    private Dimensions dimensions;
    private String material;
    private String finish;

    public Floor(Dimensions dimensions, String material, String finish) {
        this.dimensions = dimensions;
        this.material = material;
        this.finish = finish;
    }

    public void wasScratched(){
        System.out.println("Oh no! A scratch was found...");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getFinish() {
        return finish;
    }
}
