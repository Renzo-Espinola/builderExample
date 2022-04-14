package tutorial.builder.builders;

import tutorial.builder.cars.Car;
import tutorial.builder.cars.CarType;
import tutorial.builder.components.Engine;
import tutorial.builder.components.GPSNavigator;
import tutorial.builder.components.Transmission;
import tutorial.builder.components.TripComputer;

public class CarBuilder implements Builder {
private CarType type;
private int seats;
private Engine engine;
private Transmission transmission;
private GPSNavigator gpsNavigator;
private TripComputer tripComputer;

    @Override
    public void setCarType(CarType type) {
        this.type=type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void setEngine(Engine engine) {
    this.engine=engine;
    }

    @Override
    public void setTransimission(Transmission transimission) {
    this.transmission=transimission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer=tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator=gpsNavigator;
    }

    public Car getResult(){
        return new Car (type,seats,engine,tripComputer,transmission,gpsNavigator);
    }
}
