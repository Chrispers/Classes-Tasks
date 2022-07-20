import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> catalogue = new ArrayList<>();
        String[] command;
        int cars = 0, trucks = 0, carsHorsepower = 0, trucksHorsepower = 0;
        while(true) {
            command = scanner.nextLine().split(" ");
            if (command[0].equals("End")) {
                break;
            }
            Vehicle vehicle = new Vehicle(command[0], command[1], command[2],
                    Integer.parseInt(command[3]));
            catalogue.add(vehicle);
            if (command[0].equals("car")) {
                cars++;
                carsHorsepower += Integer.parseInt(command[3]);
            } else if (command[0].equals("truck")) {
                trucks++;
                trucksHorsepower += Integer.parseInt(command[3]);
            }
        }

        while(true){
            command = scanner.nextLine().split(" ");
            if(command[0].equals("Close")){
                break;
            }
            for (Vehicle vehicle : catalogue) {
                if (command[0].equals(vehicle.getModel())) {
                    if(vehicle.getType().equals("car"))
                        System.out.println("Type: Car");
                    else
                        System.out.println("Type: Truck");
                    vehicle.printData();
                }
            }
        }
        if(cars > 0)
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsHorsepower * 1.0 / cars);
        else
            System.out.println("Cars have average horsepower of: 0.00.");
        if(trucks > 0)
            System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksHorsepower * 1.0 / trucks);
        else
            System.out.println("Trucks have average horsepower of: 0.00.");
    }


    public static class Vehicle{
        String type, color, model;
        public String getModel(){return this.model;}
        public String getType(){return this.type;}
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower){
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public void printData(){
            System.out.println("Model: " + this.model + "\n" +
                    "Color: " + this.color + "\n" +
                    "Horsepower: " + this.horsepower);
        }
    }
}
