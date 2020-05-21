import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AOB {

    //three private attributes of Astronomical Objects type arraylist
    //for storing the data read from the file
    private ArrayList<Planets> planets_list;
    private ArrayList<Stars> stars_list;
    private ArrayList<Messier> messier_list;

    private SummaryStatistics ss;

    //default constructor
    public AOB(){

        planets_list = null;
        stars_list = null;
        messier_list = null;
        ss = null;

    }

    public ArrayList<Planets> getPlanets_list() {
        return planets_list;
    }

    public void setPlanets_list(ArrayList<Planets> planets_list) {
        this.planets_list = planets_list;
    }

    public ArrayList<Stars> getStars_list() {
        return stars_list;
    }

    public void setStars_list(ArrayList<Stars> stars_list) {
        this.stars_list = stars_list;
    }

    public ArrayList<Messier> getMessier_list() {
        return messier_list;
    }

    public void setMessier_list(ArrayList<Messier> messier_list) {
        this.messier_list = messier_list;
    }

    public SummaryStatistics getSs() {
        return ss;
    }

    public void setSs(SummaryStatistics ss) {
        this.ss = ss;
    }

    //method for read the data from different files
    //return a BufferedReader type variable for the following data processing
    public BufferedReader readDataFromFile(String filename) throws IOException{

        BufferedReader infile = new BufferedReader(new FileReader(filename));
        /*//testing the data reading
        String s;
        while ((s = infile.readLine())!= null){

            System.out.println(s);

        }*/
        return infile;

    }

    //method for creating a Planets list using the data
    public ArrayList<Planets> storePlanetsIntoList(BufferedReader planets_file) throws IOException {

        String s;
        String[] planetAttribute;
        ArrayList<Planets> planetsList = new ArrayList<>();
        while ((s = planets_file.readLine())!= null){

            planetAttribute = s.split("\\s+");
            /*//testing
            System.out.println(planetAttribute[0]);*/
            Planets newPlanet = new Planets(planetAttribute);
            planetsList.add(newPlanet);

        }
        return planetsList;

    }

    //method for creating a Stars list using the data
    public ArrayList<Stars> storeStarsIntoList(BufferedReader stars_file) throws IOException{

        String s;
        String[] starAttribute;
        ArrayList<Stars> starsList = new ArrayList<>();
        while ((s = stars_file.readLine())!= null){

            starAttribute = s.split("\\|");
            //System.out.println(starAttribute[0]);
            Stars newStar = new Stars(starAttribute);
            starsList.add(newStar);

        }
        return starsList;

    }


    //method for creating a Messier list using the data
    public ArrayList<Messier> storeMessierIntoList(BufferedReader messier_file) throws IOException{

        String s;
        String[] messierAttribute;
        ArrayList<Messier> messierList = new ArrayList<>();
        while ((s = messier_file.readLine())!= null) {

            messierAttribute = s.split("\\|");
            //System.out.println(messierAttribute[0]);
            Messier newMessier = new Messier(messierAttribute);
            messierList.add(newMessier);

        }
        return messierList;

    }

    public ArrayList<String> storeQueriesIntoList(BufferedReader query_file) throws IOException{

        String s;
        ArrayList<String> queries = new ArrayList<>();
        int i = 0;
        while ((s = query_file.readLine())!= null) {

            //System.out.println(s);
            queries.add(s);
            i++;

        }
        return queries;

    }

    public SummaryStatistics getSummaryStatistics(ArrayList<Planets> planets_list, ArrayList<Stars> stars_list, ArrayList<Messier> messier_list){

        SummaryStatistics ss = new SummaryStatistics();
        ss.setQ1(Integer.toString(planets_list.size()));
        ss.setQ2(Integer.toString(messier_list.size()));
        ss.setQ3(Integer.toString(stars_list.size()));
        ss.setQ4(getNearestObj(planets_list));
        ss.setQ5(getFurthestObj(messier_list));
        ss.setQ6(getNearestStar(stars_list));
        ss.setQ7(getBrightestStar(stars_list));
        ss.setQ8(getFaintestStar(stars_list));
        ss.setQ9(Integer.toString(getConstellationNumber(stars_list,messier_list)));
        ss.setQ10(getLargestConstellation(stars_list, messier_list));
        return ss;

    }

    public String getNearestObj(ArrayList<Planets> planets_list){

        Collections.sort(planets_list, new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                double result =  o1.getDistance()-o2.getDistance();
                if(result > 0 ){

                    return 1;

                }else if (result < 0){

                    return -1;
                }else {

                    return 0;

                }
            }
        });
        StringBuilder obj = new StringBuilder();
        for(int i = 0;i<planets_list.size();i++){

            if(planets_list.get(i+1).getDistance() != planets_list.get(i).getDistance()){

                obj.append(planets_list.get(i).getName()).append(" ");
                break;

            }else {

                obj.append(planets_list.get(i).getName()).append(" ");
                //deal with the situation which many planets have the same distance

            }

        }

        return obj.toString();

    }

    public String getFurthestObj(ArrayList<Messier> messier_list){

        Collections.sort(messier_list, new Comparator<Messier>() {
            @Override
            public int compare(Messier o1, Messier o2) {
                double result =  o1.getDistance()-o2.getDistance();
                if(result > 0 ){

                    return -1;

                }else if (result < 0){

                    return 1;
                }else {

                    return 0;

                }
            }
        });
        StringBuilder obj = new StringBuilder();
        for(int i = 0;i<messier_list.size();i++){

            if(messier_list.get(i+1).getDistance() != messier_list.get(i).getDistance()){

                //clear the space
                obj.append("M"+messier_list.get(i).getCata_number()+" ");
                break;

            }else {

                obj.append("M"+messier_list.get(i).getCata_number()+" ");
                //deal with the situation which many planets have the same distance

            }

        }

        return obj.toString();

    }

    public String getNearestStar(ArrayList<Stars> stars_list){

        Collections.sort(stars_list, new Comparator<Stars>() {
            @Override
            public int compare(Stars o1, Stars o2) {
                double result =  o1.getDistance()-o2.getDistance();
                if(result > 0 ){

                    return 1;

                }else if (result < 0){

                    return -1;
                }else {

                    return 0;

                }
            }
        });
        StringBuilder obj = new StringBuilder();
        for(int i = 0;i<stars_list.size();i++){

            if(stars_list.get(i+1).getDistance() != stars_list.get(i).getDistance()){

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                break;

            }else {

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                //deal with the situation which many planets have the same distance

            }

        }

        return obj.toString();

    }

    public String getBrightestStar(ArrayList<Stars> stars_list){

        Collections.sort(stars_list, new Comparator<Stars>() {
            @Override
            public int compare(Stars o1, Stars o2) {
                double result =  o1.getMagnitude()-o2.getMagnitude();
                if(result > 0 ){

                    return 1;

                }else if (result < 0){

                    return -1;
                }else {

                    return 0;

                }
            }
        });
        StringBuilder obj = new StringBuilder();
        for(int i = 0;i<stars_list.size();i++){

            if(stars_list.get(i+1).getMagnitude() != stars_list.get(i).getMagnitude()){

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                break;

            }else {

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                //deal with the situation which many planets have the same brightness

            }

        }

        return obj.toString();

    }

    public String getFaintestStar(ArrayList<Stars> stars_list){

        Collections.sort(stars_list, new Comparator<Stars>() {
            @Override
            public int compare(Stars o1, Stars o2) {
                double result =  o1.getMagnitude()-o2.getMagnitude();
                if(result > 0 ){

                    return -1;

                }else if (result < 0){

                    return 1;
                }else {

                    return 0;

                }
            }
        });
        StringBuilder obj = new StringBuilder();
        for(int i = 0;i<stars_list.size();i++){

            if( stars_list.get(i+1).getMagnitude() != stars_list.get(i).getMagnitude()){

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                break;

            }else {

                obj.append(stars_list.get(i).getCata_number()).append(" ");
                //deal with the situation which many planets have the same brightness

            }

        }

        return obj.toString();

    }

    public int getConstellationNumber(ArrayList<Stars> stars_list, ArrayList<Messier> messier_list){

        //use hashtable to count
        //key is the constellation name, value is the constellation number
        Hashtable<String, Integer> constellationTable = new Hashtable<>();
        for (int i = 0; i<stars_list.size();i++){

            if (constellationTable.get(stars_list.get(i).getConstellation()) == null){

                constellationTable.put(stars_list.get(i).getConstellation(),1);

            }else{

                constellationTable.put(stars_list.get(i).getConstellation(),constellationTable.get(stars_list.get(i).getConstellation())+1);

            }

        }
        for (int i = 0; i<messier_list.size();i++){

            if (constellationTable.get(messier_list.get(i).getConstellation()) == null){

                constellationTable.put(messier_list.get(i).getConstellation(),1);

            }else{

                constellationTable.put(messier_list.get(i).getConstellation(),constellationTable.get(messier_list.get(i).getConstellation())+1);

            }

        }
        //System.out.println(constellationTable.toString());
        /*Enumeration<Integer> e = constellationTable.elements();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; e.hasMoreElements() ; i++){

            al.add(e.nextElement());

        }*/
        //Sort the arraylist to get the largest value (number of constellation)
        //Collections.sort(al);
        //System.out.println(al.get(al.size()-1));
        //System.out.println(al.size());
        //return al.size();
        return constellationTable.size();


    }

    public String getLargestConstellation(ArrayList<Stars> stars_list, ArrayList<Messier> messier_list){

        Hashtable<String, Integer> constellationTable = new Hashtable<>();
        for (int i = 0; i<stars_list.size();i++){

            if (constellationTable.get(stars_list.get(i).getConstellation()) == null){

                constellationTable.put(stars_list.get(i).getConstellation(),1);

            }else{

                constellationTable.put(stars_list.get(i).getConstellation(),constellationTable.get(stars_list.get(i).getConstellation())+1);

            }

        }
        for (int i = 0; i<messier_list.size();i++){

            if (constellationTable.get(messier_list.get(i).getConstellation()) == null){

                constellationTable.put(messier_list.get(i).getConstellation(),1);

            }else{

                constellationTable.put(messier_list.get(i).getConstellation(),constellationTable.get(messier_list.get(i).getConstellation())+1);

            }

        }
        Enumeration<Integer> e = constellationTable.elements();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; e.hasMoreElements() ; i++){

            al.add(e.nextElement());

        }
        //sort to find the largest number
        Collections.sort(al);
        //System.out.println(al.get(al.size()-1));
        int number = al.get(al.size()-1);
        //get the largest constellation
        List<Object> keyList = new ArrayList<>();
        for(Object key: constellationTable.keySet()){
            if(constellationTable.get(key).equals(number)){
                keyList.add(key);
            }
        }
        //System.out.println(constellationTable.toString());
        return keyList.toString();

    }


    public String toString(){

        return this.getSs().toString();

    }

    public static void main(String[] args){

        AOB aob = new AOB();
        BufferedReader planets_file = null;
        BufferedReader stars_file = null;
        BufferedReader messier_file = null;
        try {

            stars_file = aob.readDataFromFile(args[0]);
            messier_file = aob.readDataFromFile(args[1]);
            planets_file = aob.readDataFromFile(args[2]);

        }catch (IOException ioe){

            //ioe.printStackTrace();
            System.out.println("Please enter the correct filename on the command line!");
            System.exit(1);
            //Once there is a IOException with the file reading process, system exits

        }catch (ArrayIndexOutOfBoundsException ae){

            System.out.println("Please enter the correct format of Input on the command line!");
            System.out.println("java AOB fileWithStars.txt fileWithMessiers.txt fileWithPlanets.txt [Optional][filenameWithListOfQueries.txt]");
            System.exit(1);

        }
        //set the attribute value of AOB object
        try {

            aob.setPlanets_list(aob.storePlanetsIntoList(planets_file));
            //System.out.println(planets_list.get(0).getName());
            aob.setStars_list(aob.storeStarsIntoList(stars_file));
            //System.out.println(stars_list.get(0).star_type);
            aob.setMessier_list(aob.storeMessierIntoList(messier_file));
            planets_file.close();
            stars_file.close();
            messier_file.close();


        }catch (IOException ioe){

            //ioe.printStackTrace();
            System.out.println("There is something wrong with the reading files");
            System.exit(1);

        }catch (ArrayIndexOutOfBoundsException ae){

            //handle the situation that there is not three filenames on the command line
            //ae.printStackTrace();
            System.out.println("Please enter the right sequence of filenames on the command line!");
            System.exit(1);

        }catch (NumberFormatException nfe){

            //nfe.printStackTrace();
            System.out.println("Please check the files! Please make sure using correct data format!");
            System.exit(1);

        }
        MainFrame mf = new MainFrame(aob.getPlanets_list(),aob.getStars_list(),aob.getMessier_list());
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
        /*
        BufferedReader query_file = null;
        ArrayList<String> queries = new ArrayList<>();
        ArrayList<ArrayList<String>> answers = new ArrayList<>();
        try {

            query_file = aob.readDataFromFile(args[3]);
            queries = aob.storeQueriesIntoList(query_file);


        } catch (IOException ioe){

            System.out.println("Please enter the correct filename on the command line to continue querying!");
            System.exit(1);
            //Once there is a IOException with the file reading process, system exits

        }catch (ArrayIndexOutOfBoundsException ae){

            System.out.println("Please enter the correct format of Input on the command line to continue querying!");
            System.out.println("java AOB fileWithStars.txt fileWithMessiers.txt fileWithPlanets.txt [Optional][filenameWithListOfQueries.txt]");
            System.exit(1);

        }

        for (int i = 0; i < queries.size(); i++){

            QueryRunner qr = new QueryRunner();
            //System.out.println(queries.get(i));
            Query newQuery = (Query) qr.run(queries.get(i));
            newQuery.setStars_list(aob.getStars_list());
            newQuery.setMessier_list(aob.getMessier_list());
            newQuery.setPlanets_list(aob.getPlanets_list());
            answers.add(newQuery.getIDs());

        }

        for (int i = 0; i < answers.size(); i++){

            int queryId = i + 1;

            System.out.println("Answer" + queryId + ":");

            if (answers.get(i).size() == 0){

                System.out.print("Query mistake!");
                //can not handle the situation that query result = 0

            }else{

                for (int j = 0; j< answers.get(i).size();j++){

                    System.out.print(answers.get(i).get(j)+"  ");

                }
                System.out.println("Number of matching results: "+ answers.get(i).size());

            }

            System.out.println("");





        }*/

    }


}
