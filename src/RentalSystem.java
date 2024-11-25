import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental, RentalHandler handler) {
        rentals.add(rental);
        handler.handle(rental);
    }

    public void printAllRentals() {
        rentals.forEach(System.out::println);
    }

    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        // Referencja do metody dla logowania wynajmu
        RentalHandler confirmationHandler = System.out::println;

        // Dodawanie wynajmów
        system.addRental(new Rental(VehicleType.CAR, 3), confirmationHandler);
        system.addRental(new Rental(VehicleType.BICYCLE, 7), confirmationHandler);

        // Wyrażenie lambda do dodatkowego logowania
        system.addRental(new Rental(VehicleType.TRUCK, 2),
                rental -> System.out.println("Total rental cost: " + rental.calculateTotalCost() + " zł"));

        // Wypisanie wszystkich wynajmów
        System.out.println("\nAll Rentals:");
        system.printAllRentals();
    }
}
