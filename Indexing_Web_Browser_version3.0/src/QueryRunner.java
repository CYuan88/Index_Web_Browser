import java.util.ArrayList;

public class QueryRunner {

    public QueryResults run(String q){

        //find the position of annotation
        if (q.indexOf("//")>=0){

            int position = q.indexOf("//");
            q = q.substring(0,position);
            //System.out.println(q);

        }
        //split large string to string array
        String[] queryObject = q.split("\\s+");
        /*for (String s : queryObject) {

            System.out.println(s);

        }*/
        ArrayList<String> queryList = new ArrayList<>();
        for (int i = 0; i<queryObject.length;i++){

            queryList.add(queryObject[i]);

        }
        //determine the situation that using wrong key word select
        if (!queryList.get(0).equals("select")){

            //System.out.println("nimasile");
            return new Query();//if not, return a empty object

        }

        ArrayList<Condition> conditions = new ArrayList<>();


        //construct query array and return
        for (int i = 2; i < queryList.size(); i = i+4){

            //situation that query has no and
            if (queryList.size()<6){

                Condition newCondition = new Condition(queryList.get(i+1),queryList.get(i+2),queryList.get(i+3));
                conditions.add(newCondition);
                return new Query(queryObject[1],conditions);

            }else{
                //situation that the query get more than one condition
                //track the position of keyword and
                if (queryList.get(i).equals("where") || queryList.get(i).equals("and")){

                    if (queryList.get(i+1).equals("name")||queryList.get(i+1).equals("constellation")||queryList.get(i+1).equals("type")||queryList.get(i+1).equals("description")){



                    }else {

                        for(int j = 0;j<queryList.get(i+3).length();j++){

                            //consider two conditions that the character is a digit or a point
                            if (j == 0){

                                if (!(Character.isDigit(queryList.get(i+3).charAt(j)) || queryList.get(i+3).charAt(j) == '.'||queryList.get(i+3).charAt(j) == '-'||queryList.get(i+3).charAt(j) == '+')){

                                    //System.out.println("gunnimade");
                                    return new Query();//if not, return a empty object

                                }

                            }else{

                                if (!(Character.isDigit(queryList.get(i+3).charAt(j)) || queryList.get(i+3).charAt(j) == '.')){

                                    //System.out.println("gunnimade");
                                    return new Query();//if not, return a empty object

                                }

                            }


                        }

                    }

                    Condition newCondition = new Condition(queryList.get(i+1),queryList.get(i+2),queryList.get(i+3));
                    //System.out.println(queryList.get(i+3));
                    conditions.add(newCondition);

                }else {

                    //System.out.println("nidayede");
                    return new Query();//if not, return a empty object

                }



            }

        }


        return new Query(queryObject[1],conditions);

    }

}
