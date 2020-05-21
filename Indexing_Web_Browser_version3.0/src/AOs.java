import java.util.ArrayList;

public abstract class AOs{

    private double RA;
    private double declination;
    private double magnitude;
    private double distance;

    public AOs(){

        RA = 0.0;
        declination = 0.0;
        magnitude = 0.0;
        distance = 0.0;

    }

    public AOs(String[] aos){

        RA = Double.parseDouble(aos[0]);
        declination = Double.parseDouble(aos[1]);
        magnitude = Double.parseDouble(aos[2]);
        distance = Double.parseDouble(aos[3]);

    }

    public AOs(ArrayList<String> aos){

        RA = Double.parseDouble(aos.get(0));
        declination = Double.parseDouble(aos.get(1));
        magnitude = Double.parseDouble(aos.get(2));
        distance = Double.parseDouble(aos.get(3));

    }

    public double getRA() {
        return RA;
    }

    public void setRA(double RA) {
        this.RA = RA;
    }

    public double getDeclination() {
        return declination;
    }

    public void setDeclination(double declination) {
        this.declination = declination;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }



}
