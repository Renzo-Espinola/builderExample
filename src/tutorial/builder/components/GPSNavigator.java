package tutorial.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route="Barrio guiraldes quinta 1 manzana 2 depot 01-11";

    }
    public GPSNavigator(String manualRoute){
        this.route=manualRoute;
    }
    public String getRoute(){
        return route;
    }
}
