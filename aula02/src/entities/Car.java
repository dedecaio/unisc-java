package entities;

public class Car {
    private Long id;
    private String name;
    private Double price;
    private Integer gas;
    public Car(){}
    public Car(Long id, String name, Double price, Integer gas) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gas = gas;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGas() {
        return gas;
    }

    public void abastecer(int value){
        System.out.println("Abastecendo...");
        gas+=value;
    }

    public void turnOn() {
        System.out.println("Ligando carro...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", gas=" + gas +
                '}';
    }
}
