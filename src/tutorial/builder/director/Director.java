package tutorial.builder.director;

import org.jetbrains.annotations.NotNull;
import tutorial.builder.builders.Builder;
import tutorial.builder.cars.CarType;
import tutorial.builder.components.Engine;
import tutorial.builder.components.GPSNavigator;
import tutorial.builder.components.Transmission;
import tutorial.builder.components.TripComputer;

public class Director {

    public void constructSportCar(@NotNull Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransimission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransimission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransimission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
