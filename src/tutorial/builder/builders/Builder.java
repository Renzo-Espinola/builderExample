package tutorial.builder.builders;

import tutorial.builder.cars.CarType;
import tutorial.builder.components.Engine;
import tutorial.builder.components.GPSNavigator;
import tutorial.builder.components.Transmission;
import tutorial.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransimission(Transmission transimission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
