import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Query implements QueryResults{

    private ArrayList<Planets> planets_list;
    private ArrayList<Stars> stars_list;
    private ArrayList<Messier> messier_list;
    private String AOs_type;
    private ArrayList<Condition> conditions;

    public Query(){

        AOs_type = "";
        conditions = new ArrayList<>();
        planets_list = new ArrayList<>();
        stars_list = new ArrayList<>();
        messier_list = new ArrayList<>();

    }

    //two parameters constructor
    //for construction on QueryRunner
    public Query(String AOs_type, ArrayList<Condition> conditions){

        this.AOs_type = AOs_type;
        this.conditions = conditions;
        planets_list = new ArrayList<>();
        stars_list = new ArrayList<>();
        messier_list = new ArrayList<>();

    }

    public Query(ArrayList<Planets> planets_list, ArrayList<Stars> stars_list, ArrayList<Messier> messier_list, String AOs_type, ArrayList<Condition> conditions) {
        this.planets_list = planets_list;
        this.stars_list = stars_list;
        this.messier_list = messier_list;
        this.AOs_type = AOs_type;
        this.conditions = conditions;
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

    public String getAOs_type() {
        return AOs_type;
    }

    public void setAOs_type(String AOs_type) {
        this.AOs_type = AOs_type;
    }

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    //different query type
    public ArrayList<String> getIDs() {

        if (AOs_type.equals("stars")){

            return QueryStars();

        }
        if (AOs_type.equals("messiers")){

            return QueryMessier();

        }
        if (AOs_type.equals("planets")){

            return QueryPlanets();

        }
        if (AOs_type.equals("")){

            System.out.println("The result list has no value");
            return new ArrayList<>();

        }
        //System.out.println("Something wrong");
        return null;


    }

    //main query processes
    private ArrayList<String> QueryStars(){

        ArrayList<String> resultListAll = new ArrayList<>();
        ArrayList<String> resultList1 = null;
        ArrayList<String> resultList2 = null;
        ArrayList<String> resultList3 = null;
        ArrayList<String> resultList4 = null;
        ArrayList<String> resultList5 = null;
        ArrayList<String> resultList6 = null;

        ArrayList<String> resultList7 = null;
        ArrayList<String> resultList8 = null;
        ArrayList<String> resultList9 = null;
        ArrayList<String> resultList10 = null;
        ArrayList<String> resultList11 = null;
        ArrayList<String> resultList12 = null;
        ArrayList<String> resultList13 = null;
        ArrayList<String> resultList14 = null;
        ArrayList<String> resultList15 = null;
        ArrayList<String> resultList16 = null;
        ArrayList<String> resultList17 = null;
        ArrayList<String> resultList18 = null;
        ArrayList<String> resultList19 = null;
        ArrayList<String> resultList20 = null;
        ArrayList<String> resultList21 = null;
        ArrayList<String> resultList22 = null;
        ArrayList<String> resultList23 = null;
        ArrayList<String> resultList24 = null;
        ArrayList<String> resultList25 = null;
        ArrayList<String> resultList26 = null;
        ArrayList<String> resultList27 = null;
        ArrayList<String> resultList28 = null;
        ArrayList<String> resultList29 = null;
        ArrayList<String> resultList30 = null;
        ArrayList<String> resultList31 = null;
        ArrayList<String> resultList32 = null;
        ArrayList<String> resultList33 = null;
        ArrayList<String> resultList34 = null;
        ArrayList<String> resultList35 = null;
        ArrayList<String> resultList36 = null;
        ArrayList<String> resultList37 = null;
        ArrayList<String> resultList38 = null;
        ArrayList<String> resultList39 = null;
        ArrayList<String> resultList40 = null;
        ArrayList<String> resultList41 = null;
        ArrayList<String> resultList42 = null;

        if (conditions.size() == 0){

            ArrayList<String> stars = new ArrayList<>();
            for (int i = 0; i<stars_list.size();i++){

                stars.add("S"+String.valueOf(stars_list.get(i).getCata_number()));

            }
            return stars;

        }
        for (int i = 0; i<conditions.size(); i++){

            if(conditions.get(i).getAttribute().equals("number")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList1 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number()>Double.parseDouble(conditions.get(i).getData())){

                            resultList1.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList1);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList2 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number()< Double.parseDouble(conditions.get(i).getData())){

                            resultList2.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList2);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList3 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList3.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList3);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList4 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList4.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList4);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList5 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number() == Double.parseDouble(conditions.get(i).getData())){

                            resultList5.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList5);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList6 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getCata_number()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList6.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList6);

                }

            }

            if(conditions.get(i).getAttribute().equals("ra")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList7 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA()>Double.parseDouble(conditions.get(i).getData())){

                            resultList7.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList7);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList8 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA()<Double.parseDouble(conditions.get(i).getData())){

                            resultList8.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList8);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList9 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList9.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList9);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList10 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList10.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList10);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList11 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA() == Double.parseDouble(conditions.get(i).getData())){

                            resultList11.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList11);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList12 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getRA()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList12.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList12);

                }

            }

            if(conditions.get(i).getAttribute().equals("decl")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList13 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination()>Double.parseDouble(conditions.get(i).getData())){

                            resultList13.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList13);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList14 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination()<Double.parseDouble(conditions.get(i).getData())){

                            resultList14.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList14);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList15 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList15.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList15);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList16 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList16.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList16);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList17 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination() == Double.parseDouble(conditions.get(i).getData())){

                            resultList17.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList17);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList18 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDeclination()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList18.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList18);

                }

            }

            if(conditions.get(i).getAttribute().equals("magn")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList19 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude()>Double.parseDouble(conditions.get(i).getData())){

                            resultList19.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList19);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList20 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude()<Double.parseDouble(conditions.get(i).getData())){

                            resultList20.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList20);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList21 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList21.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList21);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList22 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList22.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList22);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList23 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude() == Double.parseDouble(conditions.get(i).getData())){

                            resultList23.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList23);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList24 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getMagnitude()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList24.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList24);

                }

            }

            if(conditions.get(i).getAttribute().equals("distance")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList25 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance()>Double.parseDouble(conditions.get(i).getData())){

                            resultList25.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList25);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList26 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance()<Double.parseDouble(conditions.get(i).getData())){

                            resultList26.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList26);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList27 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList27.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList27);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList28 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList28.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList28);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList29 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance() == Double.parseDouble(conditions.get(i).getData())){

                            resultList29.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList29);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList30 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getDistance()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList30.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList30);

                }

            }
            if(conditions.get(i).getAttribute().equals("type")){

                if (conditions.get(i).getOperator().equals("=")){

                    resultList31 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getStar_type().equals(conditions.get(i).getData())){

                            resultList31.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList31);

                }



            }
            if(conditions.get(i).getAttribute().equals("constellation")){

                if (conditions.get(i).getOperator().equals("=")){

                    resultList32 = new ArrayList<>();

                    for (int j = 0; j<stars_list.size();j++){

                        if (stars_list.get(j).getConstellation().equals(conditions.get(i).getData())){

                            resultList32.add("S"+String.valueOf(stars_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList32);

                }



            }

        }

        if (resultList1 != null){

            resultListAll.retainAll(resultList1);
            //System.out.println("1");

        }
        if (resultList2  != null){

            resultListAll.retainAll(resultList2);
            //System.out.println("2");

        }
        if (resultList3 != null){

            resultListAll.retainAll(resultList3);
            //System.out.println("3");

        }
        if (resultList4 != null){

            resultListAll.retainAll(resultList4);
            //System.out.println("4");

        }
        if (resultList5 != null){

            resultListAll.retainAll(resultList5);
            //System.out.println("5");

        }
        if (resultList6 != null){

            resultListAll.retainAll(resultList6);
            //System.out.println("6");

        }

        if (resultList7 != null){

            resultListAll.retainAll(resultList7);
            //System.out.println("7");

        }
        if (resultList8 != null){

            resultListAll.retainAll(resultList8);
            //System.out.println("8");

        }
        if (resultList9 != null){

            resultListAll.retainAll(resultList9);
            //System.out.println("9");

        }
        if (resultList10 != null){

            resultListAll.retainAll(resultList10);
            //System.out.println("10");

        }
        if (resultList11 != null){

            resultListAll.retainAll(resultList11);
            //System.out.println("11");

        }
        if (resultList12 != null){

            resultListAll.retainAll(resultList12);
            //System.out.println("12");

        }
        if (resultList13 != null){

            resultListAll.retainAll(resultList13);
            //System.out.println("13");

        }
        if (resultList14 != null){

            resultListAll.retainAll(resultList14);
            //System.out.println("14");

        }
        if (resultList15 != null){

            resultListAll.retainAll(resultList15);
            //System.out.println("15");

        }
        if (resultList16 != null){

            resultListAll.retainAll(resultList16);
           // System.out.println("16");

        }
        if (resultList17 != null){

            resultListAll.retainAll(resultList17);
            //System.out.println("17");

        }
        if (resultList18 != null){

            resultListAll.retainAll(resultList18);
            //System.out.println("18");

        }
        if (resultList19 != null){

            resultListAll.retainAll(resultList19);
            //System.out.println("19");

        }
        if (resultList20 != null){

            resultListAll.retainAll(resultList20);
            //System.out.println("20");

        }
        if (resultList21 != null){

            resultListAll.retainAll(resultList21);
            //System.out.println("21");

        }
        if (resultList22 != null){

            resultListAll.retainAll(resultList22);
            //System.out.println("22");

        }
        if (resultList23 != null){

            resultListAll.retainAll(resultList23);
            //System.out.println("23");

        }
        if (resultList24 != null){

            resultListAll.retainAll(resultList24);
            //System.out.println("24");

        }
        if (resultList25 != null){

            resultListAll.retainAll(resultList25);
            //System.out.println("25");

        }
        if (resultList26 != null){

            resultListAll.retainAll(resultList26);
            //System.out.println("26");

        }
        if (resultList27 != null){

            resultListAll.retainAll(resultList27);
            //System.out.println("27");

        }
        if (resultList28 != null){

            resultListAll.retainAll(resultList28);
           // System.out.println("28");

        }
        if (resultList29 != null){

            resultListAll.retainAll(resultList29);
            //System.out.println("29");

        }
        if (resultList30 != null){

            resultListAll.retainAll(resultList30);
           // System.out.println("30");

        }
        if (resultList31 != null){

            resultListAll.retainAll(resultList31);
            // System.out.println("31");

        }
        if (resultList32 != null){

            resultListAll.retainAll(resultList32);
            // System.out.println("32");

        }

        //use HashSet to deduplication
        HashSet<String> set = new HashSet<String>(resultListAll.size());
        ArrayList<String> result = new ArrayList<String>(resultListAll.size());
        for (String str : resultListAll) {
            if (set.add(str)) {
                result.add(str);
            }
        }


        return result;

    }


    private ArrayList<String> QueryMessier(){

        ArrayList<String> resultListAll = new ArrayList<>();
        ArrayList<String> resultList1 = null;
        ArrayList<String> resultList2 = null;
        ArrayList<String> resultList3 = null;
        ArrayList<String> resultList4 = null;
        ArrayList<String> resultList5 = null;
        ArrayList<String> resultList6 = null;

        ArrayList<String> resultList7 = null;
        ArrayList<String> resultList8 = null;
        ArrayList<String> resultList9 = null;
        ArrayList<String> resultList10 = null;
        ArrayList<String> resultList11 = null;
        ArrayList<String> resultList12 = null;
        ArrayList<String> resultList13 = null;
        ArrayList<String> resultList14 = null;
        ArrayList<String> resultList15 = null;
        ArrayList<String> resultList16 = null;
        ArrayList<String> resultList17 = null;
        ArrayList<String> resultList18 = null;
        ArrayList<String> resultList19 = null;
        ArrayList<String> resultList20 = null;
        ArrayList<String> resultList21 = null;
        ArrayList<String> resultList22 = null;
        ArrayList<String> resultList23 = null;
        ArrayList<String> resultList24 = null;
        ArrayList<String> resultList25 = null;
        ArrayList<String> resultList26 = null;
        ArrayList<String> resultList27 = null;
        ArrayList<String> resultList28 = null;
        ArrayList<String> resultList29 = null;
        ArrayList<String> resultList30 = null;
        ArrayList<String> resultList31 = null;
        ArrayList<String> resultList32 = null;
        ArrayList<String> resultList33 = null;
        ArrayList<String> resultList34 = null;
        ArrayList<String> resultList35 = null;
        ArrayList<String> resultList36 = null;
        ArrayList<String> resultList37 = null;
        ArrayList<String> resultList38 = null;
        ArrayList<String> resultList39 = null;
        ArrayList<String> resultList40 = null;
        ArrayList<String> resultList41 = null;
        ArrayList<String> resultList42 = null;

        if (conditions.size() == 0){

            ArrayList<String> messier = new ArrayList<>();
            for (int i = 0; i<messier_list.size();i++){

                messier.add("M"+String.valueOf(messier_list.get(i).getCata_number()));

            }
            return messier;

        }

        for (int i = 0; i<conditions.size(); i++){

            if(conditions.get(i).getAttribute().equals("number")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList1 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number()>Double.parseDouble(conditions.get(i).getData())){

                            resultList1.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList1);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList2 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number()<Double.parseDouble(conditions.get(i).getData())){

                            resultList2.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList2);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList3 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList3.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList3);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList4 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList4.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList4);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList5 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number() == Double.parseDouble(conditions.get(i).getData())){

                            resultList5.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList5);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList6 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getCata_number()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList6.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList6);

                }

            }

            if(conditions.get(i).getAttribute().equals("ra")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList7 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA()>Double.parseDouble(conditions.get(i).getData())){

                            resultList7.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList7);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList8 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA()<Double.parseDouble(conditions.get(i).getData())){

                            resultList8.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList8);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList9 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList9.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList9);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList10 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList10.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList10);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList11 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA() == Double.parseDouble(conditions.get(i).getData())){

                            resultList11.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList11);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList12 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getRA()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList12.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList12);

                }

            }

            if(conditions.get(i).getAttribute().equals("decl")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList13 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination()>Double.parseDouble(conditions.get(i).getData())){

                            resultList13.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList13);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList14 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination()<Double.parseDouble(conditions.get(i).getData())){

                            resultList14.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList14);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList15 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList15.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList15);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList16 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList16.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList16);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList17 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination() == Double.parseDouble(conditions.get(i).getData())){

                            resultList17.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList17);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList18 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDeclination()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList18.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList18);

                }

            }

            if(conditions.get(i).getAttribute().equals("magn")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList19 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude()>Double.parseDouble(conditions.get(i).getData())){

                            resultList19.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList19);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList20 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude()<Double.parseDouble(conditions.get(i).getData())){

                            resultList20.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList20);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList21 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList21.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList21);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList22 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList22.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList22);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList23 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude() == Double.parseDouble(conditions.get(i).getData())){

                            resultList23.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList23);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList24 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getMagnitude()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList24.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList24);

                }

            }

            if(conditions.get(i).getAttribute().equals("distance")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList25 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance()>Double.parseDouble(conditions.get(i).getData())){

                            resultList25.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList25);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList26 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance()<Double.parseDouble(conditions.get(i).getData())){

                            resultList26.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList26);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList27 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList27.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList27);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList28 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList28.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList28);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList29 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance() == Double.parseDouble(conditions.get(i).getData())){

                            resultList29.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList29);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList30 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getDistance()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList30.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList30);

                }

            }
            if(conditions.get(i).getAttribute().equals("description")){

                if (conditions.get(i).getOperator().equals("=")){

                    resultList31 = new ArrayList<>();

                    for (int j = 0; j<messier_list.size();j++){

                        if (messier_list.get(j).getConstellation().equals(conditions.get(i).getData())){

                            resultList31.add("M"+String.valueOf(messier_list.get(j).getCata_number()));

                        }

                    }
                    resultListAll.addAll(resultList31);

                }



            }

        }

        if (resultList1 != null){

            resultListAll.retainAll(resultList1);
            //System.out.println("1");

        }
        if (resultList2  != null){

            resultListAll.retainAll(resultList2);
            //System.out.println("2");

        }
        if (resultList3 != null){

            resultListAll.retainAll(resultList3);
            //System.out.println("3");

        }
        if (resultList4 != null){

            resultListAll.retainAll(resultList4);
            //System.out.println("4");

        }
        if (resultList5 != null){

            resultListAll.retainAll(resultList5);
            //System.out.println("5");

        }
        if (resultList6 != null){

            resultListAll.retainAll(resultList6);
            //System.out.println("6");

        }

        if (resultList7 != null){

            resultListAll.retainAll(resultList7);
            //System.out.println("7");

        }
        if (resultList8 != null){

            resultListAll.retainAll(resultList8);
            //System.out.println("8");

        }
        if (resultList9 != null){

            resultListAll.retainAll(resultList9);
           // System.out.println("9");

        }
        if (resultList10 != null){

            resultListAll.retainAll(resultList10);
            //System.out.println("10");

        }
        if (resultList11 != null){

            resultListAll.retainAll(resultList11);
            //System.out.println("11");

        }
        if (resultList12 != null){

            resultListAll.retainAll(resultList12);
            //System.out.println("12");

        }
        if (resultList13 != null){

            resultListAll.retainAll(resultList13);
           // System.out.println("13");

        }
        if (resultList14 != null){

            resultListAll.retainAll(resultList14);
            //System.out.println("14");

        }
        if (resultList15 != null){

            resultListAll.retainAll(resultList15);
            //System.out.println("15");

        }
        if (resultList16 != null){

            resultListAll.retainAll(resultList16);
            //System.out.println("16");

        }
        if (resultList17 != null){

            resultListAll.retainAll(resultList17);
            //System.out.println("17");

        }
        if (resultList18 != null){

            resultListAll.retainAll(resultList18);
            //System.out.println("18");

        }
        if (resultList19 != null){

            resultListAll.retainAll(resultList19);
            //System.out.println("19");

        }
        if (resultList20 != null){

            resultListAll.retainAll(resultList20);
            //System.out.println("20");

        }
        if (resultList21 != null){

            resultListAll.retainAll(resultList21);
            //System.out.println("21");

        }
        if (resultList22 != null){

            resultListAll.retainAll(resultList22);
            //System.out.println("22");

        }
        if (resultList23 != null){

            resultListAll.retainAll(resultList23);
            //System.out.println("23");

        }
        if (resultList24 != null){

            resultListAll.retainAll(resultList24);
            //System.out.println("24");

        }
        if (resultList25 != null){

            resultListAll.retainAll(resultList25);
            //System.out.println("25");

        }
        if (resultList26 != null){

            resultListAll.retainAll(resultList26);
           // System.out.println("26");

        }
        if (resultList27 != null){

            resultListAll.retainAll(resultList27);
            //System.out.println("27");

        }
        if (resultList28 != null){

            resultListAll.retainAll(resultList28);
           // System.out.println("28");

        }
        if (resultList29 != null){

            resultListAll.retainAll(resultList29);
           // System.out.println("29");

        }
        if (resultList30 != null){

            resultListAll.retainAll(resultList30);
            //System.out.println("30");

        }

        //use HashSet to deduplication
        HashSet<String> set = new HashSet<String>(resultListAll.size());
        ArrayList<String> result = new ArrayList<String>(resultListAll.size());
        for (String str : resultListAll) {
            if (set.add(str)) {
                result.add(str);
            }
        }


        return result;

    }

    private ArrayList<String> QueryPlanets(){

        ArrayList<String> resultListAll = new ArrayList<>();
        ArrayList<String> resultList1 = null;
        ArrayList<String> resultList2 = null;
        ArrayList<String> resultList3 = null;
        ArrayList<String> resultList4 = null;
        ArrayList<String> resultList5 = null;
        ArrayList<String> resultList6 = null;

        ArrayList<String> resultList7 = null;
        ArrayList<String> resultList8 = null;
        ArrayList<String> resultList9 = null;
        ArrayList<String> resultList10 = null;
        ArrayList<String> resultList11 = null;
        ArrayList<String> resultList12 = null;
        ArrayList<String> resultList13 = null;
        ArrayList<String> resultList14 = null;
        ArrayList<String> resultList15 = null;
        ArrayList<String> resultList16 = null;
        ArrayList<String> resultList17 = null;
        ArrayList<String> resultList18 = null;
        ArrayList<String> resultList19 = null;
        ArrayList<String> resultList20 = null;
        ArrayList<String> resultList21 = null;
        ArrayList<String> resultList22 = null;
        ArrayList<String> resultList23 = null;
        ArrayList<String> resultList24 = null;
        ArrayList<String> resultList25 = null;
        ArrayList<String> resultList26 = null;
        ArrayList<String> resultList27 = null;
        ArrayList<String> resultList28 = null;
        ArrayList<String> resultList29 = null;
        ArrayList<String> resultList30 = null;
        ArrayList<String> resultList31 = null;
        ArrayList<String> resultList32 = null;
        ArrayList<String> resultList33 = null;
        ArrayList<String> resultList34 = null;
        ArrayList<String> resultList35 = null;
        ArrayList<String> resultList36 = null;
        ArrayList<String> resultList37 = null;
        ArrayList<String> resultList38 = null;
        ArrayList<String> resultList39 = null;
        ArrayList<String> resultList40 = null;
        ArrayList<String> resultList41 = null;
        ArrayList<String> resultList42 = null;

        if (conditions.size() == 0){

            ArrayList<String> planets = new ArrayList<>();
            for (int i = 0; i<planets_list.size();i++){

                planets.add(planets_list.get(i).getName());

            }
            return planets;

        }

        for (int i = 0; i<conditions.size(); i++){

            if(conditions.get(i).getAttribute().equals("albedo")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList1 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo()>Double.parseDouble(conditions.get(i).getData())){

                            resultList1.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList1);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList2 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo()<Double.parseDouble(conditions.get(i).getData())){

                            resultList2.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList2);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList3 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList3.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList3);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList4 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList4.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList4);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList5 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo() == Double.parseDouble(conditions.get(i).getData())){

                            resultList5.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList5);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList6 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getAlbedo()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList6.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList6);

                }

            }

            if(conditions.get(i).getAttribute().equals("ra")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList7 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA()>Double.parseDouble(conditions.get(i).getData())){

                            resultList7.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList7);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList8 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA()<Double.parseDouble(conditions.get(i).getData())){

                            resultList8.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList8);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList9 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList9.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList9);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList10 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList10.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList10);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList11 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA() == Double.parseDouble(conditions.get(i).getData())){

                            resultList11.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList11);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList12 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getRA()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList12.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList12);

                }

            }

            if(conditions.get(i).getAttribute().equals("decl")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList13 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination()>Double.parseDouble(conditions.get(i).getData())){

                            resultList13.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList13);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList14 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination()<Double.parseDouble(conditions.get(i).getData())){

                            resultList14.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList14);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList15 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList15.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList15);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList16 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList16.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList16);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList17 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination() == Double.parseDouble(conditions.get(i).getData())){

                            resultList17.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList17);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList18 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDeclination()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList18.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList18);

                }

            }

            if(conditions.get(i).getAttribute().equals("magn")){

                if (conditions.get(i).getOperator().equals(">")){

                    resultList19 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude()>Double.parseDouble(conditions.get(i).getData())){

                            resultList19.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList19);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList20 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude()<Double.parseDouble(conditions.get(i).getData())){

                            resultList20.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList20);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList21 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList21.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList21);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList22 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList22.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList22);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList23 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude() == Double.parseDouble(conditions.get(i).getData())){

                            resultList23.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList23);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList24 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getMagnitude()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList24.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList24);

                }

            }

            if(conditions.get(i).getAttribute().equals("distance")){


                if (conditions.get(i).getOperator().equals(">")){

                    resultList25 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance()>Double.parseDouble(conditions.get(i).getData())){

                            resultList25.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList25);

                }

                if (conditions.get(i).getOperator().equals("<")){

                    resultList26 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance()<Double.parseDouble(conditions.get(i).getData())){

                            resultList26.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList26);

                }

                if (conditions.get(i).getOperator().equals(">=")){

                    resultList27 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance()>=Double.parseDouble(conditions.get(i).getData())){

                            resultList27.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList27);

                }

                if (conditions.get(i).getOperator().equals("<=")){

                    resultList28 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance()<=Double.parseDouble(conditions.get(i).getData())){

                            resultList28.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList28);

                }

                if (conditions.get(i).getOperator().equals("=")){

                    resultList29 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance() == Double.parseDouble(conditions.get(i).getData())){

                            resultList29.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList29);

                }

                if (conditions.get(i).getOperator().equals("!=")){

                    resultList30 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getDistance()!=Double.parseDouble(conditions.get(i).getData())){

                            resultList30.add(String.valueOf(planets_list.get(j).getName()));

                        }

                    }
                    resultListAll.addAll(resultList30);

                }

            }

            if(conditions.get(i).getAttribute().equals("name")){
                System.out.println("axiba");
                if (conditions.get(i).getOperator().equals("=")){


                    resultList31 = new ArrayList<>();

                    for (int j = 0; j<planets_list.size();j++){

                        if (planets_list.get(j).getName().equals(conditions.get(i).getData())){

                            resultList31.add(planets_list.get(j).getName());

                        }

                    }
                    resultListAll.addAll(resultList31);

                }



            }

        }

        if (resultList1 != null){

            resultListAll.retainAll(resultList1);
            //System.out.println("1");

        }
        if (resultList2  != null){

            resultListAll.retainAll(resultList2);
            //System.out.println("2");

        }
        if (resultList3 != null){

            resultListAll.retainAll(resultList3);
            //System.out.println("3");

        }
        if (resultList4 != null){

            resultListAll.retainAll(resultList4);
            //System.out.println("4");

        }
        if (resultList5 != null){

            resultListAll.retainAll(resultList5);
            //System.out.println("5");

        }
        if (resultList6 != null){

            resultListAll.retainAll(resultList6);
            //System.out.println("6");

        }

        if (resultList7 != null){

            resultListAll.retainAll(resultList7);
            //System.out.println("7");

        }
        if (resultList8 != null){

            resultListAll.retainAll(resultList8);
            //System.out.println("8");

        }
        if (resultList9 != null){

            resultListAll.retainAll(resultList9);
            //System.out.println("9");

        }
        if (resultList10 != null){

            resultListAll.retainAll(resultList10);
            //System.out.println("10");

        }
        if (resultList11 != null){

            resultListAll.retainAll(resultList11);
            //System.out.println("11");

        }
        if (resultList12 != null){

            resultListAll.retainAll(resultList12);
            //System.out.println("12");

        }
        if (resultList13 != null){

            resultListAll.retainAll(resultList13);
            //System.out.println("13");

        }
        if (resultList14 != null){

            resultListAll.retainAll(resultList14);
            //System.out.println("14");

        }
        if (resultList15 != null){

            resultListAll.retainAll(resultList15);
            //System.out.println("15");

        }
        if (resultList16 != null){

            resultListAll.retainAll(resultList16);
            //System.out.println("16");

        }
        if (resultList17 != null){

            resultListAll.retainAll(resultList17);
            //System.out.println("17");

        }
        if (resultList18 != null){

            resultListAll.retainAll(resultList18);
            //System.out.println("18");

        }
        if (resultList19 != null){

            resultListAll.retainAll(resultList19);
            //System.out.println("19");

        }
        if (resultList20 != null){

            resultListAll.retainAll(resultList20);
            //System.out.println("20");

        }
        if (resultList21 != null){

            resultListAll.retainAll(resultList21);
            //System.out.println("21");

        }
        if (resultList22 != null){

            resultListAll.retainAll(resultList22);
           // System.out.println("22");

        }
        if (resultList23 != null){

            resultListAll.retainAll(resultList23);
            //System.out.println("23");

        }
        if (resultList24 != null){

            resultListAll.retainAll(resultList24);
            //System.out.println("24");

        }
        if (resultList25 != null){

            resultListAll.retainAll(resultList25);
            //System.out.println("25");

        }
        if (resultList26 != null){

            resultListAll.retainAll(resultList26);
            //System.out.println("26");

        }
        if (resultList27 != null){

            resultListAll.retainAll(resultList27);
            //System.out.println("27");

        }
        if (resultList28 != null){

            resultListAll.retainAll(resultList28);
            //System.out.println("28");

        }
        if (resultList29 != null){

            resultListAll.retainAll(resultList29);
            //System.out.println("29");

        }
        if (resultList30 != null){

            resultListAll.retainAll(resultList30);
            //System.out.println("30");

        }
        if (resultList31 != null){

            resultListAll.retainAll(resultList31);
            //System.out.println("31");

        }

        //use HashSet to deduplication
        HashSet<String> set = new HashSet<String>(resultListAll.size());
        ArrayList<String> result = new ArrayList<String>(resultListAll.size());
        for (String str : resultListAll) {
            if (set.add(str)) {
                result.add(str);
            }
        }


        return result;

    }

}
