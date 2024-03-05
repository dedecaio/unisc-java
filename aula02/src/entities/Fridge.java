package entities;

public class Fridge {
    private Long id;
    private Double width;
    private Double height;
    private Double depth;

    private Boolean light;

    public Fridge() {
        this.light = false;
    }

    public Fridge(Long id, Double width, Double height, Double depth, Boolean light) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.light = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getSize(){
        return depth*height*width;
    }

    public void turnOnLight() {
        if (light)
            System.out.println("Luz já está ligada");
        else {
            System.out.println("Ligando a luz...");
            light = true;
        }
    }
    @Override
    public String toString() {
        return "Fridge{" +
                "id=" + id +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", light=" + light +
                '}';
    }
}
