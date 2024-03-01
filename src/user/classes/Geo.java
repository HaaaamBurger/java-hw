package user.classes;
import user.interfaces.IGeo;

public class Geo implements IGeo {
    protected String lat;
    protected String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    @Override
    public String getValues() {
        return "Latitude: " + this.lat + "\nLongtitude: " + this.lng;
    }
}
