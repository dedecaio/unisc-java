import entities.Car;
import entities.Employee;
import entities.Fridge;

public class Exercise1 {
    public static void main(String[] args) {

        Car car1 = new Car(null,null,null,0);
        car1.setId(1L);
        car1.setName("Creta");
        car1.setPrice(112402D);
        System.out.println(car1);
        car1.abastecer(5);
        System.out.println(car1);
        car1.turnOn();
        car1.turnOn();
        System.out.println();
        Employee employee1 = new Employee(1L,null,1000.0);
        employee1.setId(2L);
        employee1.setName("Luis Fernando");
        System.out.println(employee1);
        employee1.increaseSalary(25);
        System.out.println(employee1);
        employee1.decreaseSalary(10);
        System.out.println(employee1);
        System.out.println();
        Fridge fridge = new Fridge();
        fridge.setId(2L);
        fridge.setDepth(2D);
        fridge.setWidth(1.5);
        fridge.setHeight(2.3);
        System.out.println(fridge);
        System.out.printf("Volume: %.2fm³\n",fridge.getSize());
        fridge.turnOnLight();
        fridge.turnOnLight();

    }
}