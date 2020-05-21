import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ModeFrame2 extends JInternalFrame {

    public ModeFrame2(JDesktopPane jDesktopPane, String path, ArrayList<Planets> planets_list, ArrayList<Stars> stars_list, ArrayList<Messier> messier_list){


        BufferedReader query_file = null;
        ArrayList<String> queries = new ArrayList<>();
        ArrayList<ArrayList<String>> answers = new ArrayList<>();
        AOB aob = new AOB();

        try {

            query_file = aob.readDataFromFile(path);
            queries = aob.storeQueriesIntoList(query_file);


        } catch (IOException ioe){

            System.out.println("Please enter the correct filename on the command line to continue querying!");
            JOptionPane.showMessageDialog(null,"Please choose the correct file to continue querying!","",JOptionPane.WARNING_MESSAGE);
            System.exit(1);
            //Once there is a IOException with the file reading process, system exits

        }catch (ArrayIndexOutOfBoundsException ae){

            System.out.println("Please choose just one query file to continue querying!");
            JOptionPane.showMessageDialog(this,"Please choose just one query file to continue querying!","",JOptionPane.WARNING_MESSAGE);
            System.exit(1);

        }
        for (int i = 0; i < queries.size(); i++){

            QueryRunner qr = new QueryRunner();
            //System.out.println(queries.get(i));
            Query newQuery = (Query) qr.run(queries.get(i));
            //System.out.println(newQuery.getAOs_type());
            newQuery.setStars_list(stars_list);
            newQuery.setMessier_list(messier_list);
            newQuery.setPlanets_list(planets_list);
            answers.add(newQuery.getIDs());

        }
        setTitle("Result Page");
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        int width = jDesktopPane.getWidth();
        int height = jDesktopPane.getHeight();
        setSize(width,height);
        add(new ModePanel2(answers));
        setVisible(true);




    }

}
