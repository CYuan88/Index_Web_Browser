import java.util.ArrayList;
import java.util.Arrays;

public class Planets extends AOs{

    private String name;
    //private double RA;
    //private double declination;
    //private double magnitude;
    //private double distance;
    private double albedo;

    public Planets(){

        super();
        name = "";
        albedo = 0.0;

    }

    public Planets(String[] planets){

        super(new String[]{planets[1], planets[2], planets[3], planets[4]});
        name = planets[0];
        albedo = Double.parseDouble(planets[5]);

    }

    public Planets(ArrayList<String> planets){

        super(new ArrayList<String>(Arrays.asList(planets.get(1),planets.get(2),planets.get(3),planets.get(4))));
        name = planets.get(0);
        albedo = Double.parseDouble(planets.get(5));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRA() {
        return super.getRA();
    }

    public void setRA(double RA) {
        super.setRA(RA);
    }

    public double getDeclination() {
        return super.getDeclination();
    }

    public void setDeclination(double declination) {
        super.setDeclination(declination);
    }

    public double getMagnitude() {
        return super.getMagnitude();
    }

    public void setMagnitude(double magnitude) {
        super.setMagnitude(magnitude);
    }

    public double getDistance() {
        return super.getDistance();
    }

    public void setDistance(double distance) {
        super.setDistance(distance);
    }

    public double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }



}
