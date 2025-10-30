public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000); // Car for the class car for initial in this main class

        car.setColor("Blue"); // if use car.color = "Blue" u get error "Color has private access in car"
        car.setPrice(5000);   // u re using this code cause u used getter and setter in Car Class 


        /* if u using this code u will error "Color has private access in car"
            System.out.println(car.color + " " + car.model + " " + car.price);
        */
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}