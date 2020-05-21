import java.util.ArrayList;
import java.util.Arrays;

public class Stars extends AOs{

    int cata_number;
    //double RA;
    //double declination;
    //double magnitude;
    //double distance;
    String star_type;
    String constellation;

    public Stars(){

        super();
        cata_number = 0;
        star_type = "";
        constellation = "";

    }

    public Stars(String[] planets){

        super(new String[]{planets[1], planets[2], planets[3], planets[4]});
        cata_number = Integer.parseInt(planets[0].replaceAll("\\s+",""));
        star_type = planets[5];
        constellation = planets[6];

    }

    public Stars(ArrayList<String> planets){

        super(new ArrayList<String>(Arrays.asList(planets.get(1),planets.get(2),planets.get(3),planets.get(4))));
        cata_number = Integer.parseInt(planets.get(0));
        star_type = planets.get(5);
        constellation = planets.get(6);

    }

    public int getCata_number() {
        return cata_number;
    }

    public void setCata_number(int cata_number) {
        this.cata_number = cata_number;
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

    public String getStar_type() {
        return star_type;
    }

    public void setStar_type(String star_type) {
        this.star_type = star_type;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }
}

