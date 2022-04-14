package tutorial.builder;

import tutorial.builder.builders.CarBuilder;
import tutorial.builder.builders.CarManualBuilder;
import tutorial.builder.cars.Car;
import tutorial.builder.cars.Manual;
import tutorial.builder.director.Director;

public class main {
    public static void main(String[] args) {
        Director  director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n"+car.getCarType());
        CarManualBuilder manualBuilder= new CarManualBuilder();

        director.constructSportCar(manualBuilder);
        Manual carManual = manualBuilder.getResul();
        System.out.println("\nCar manual built:\n"+carManual.print());
    }
}
