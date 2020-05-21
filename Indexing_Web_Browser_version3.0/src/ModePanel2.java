import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ModePanel2 extends JPanel {

    public ModePanel2(ArrayList<ArrayList<String>> answers) {

        JTextArea jTextArea = new JTextArea(20,55);
        JScrollPane scroll = new JScrollPane(jTextArea);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scroll);

        for (int i = 0; i < answers.size(); i++) {

            int queryId = i + 1;
            jTextArea.append("Answer" + queryId + ":\n");
            //System.out.println("Answer" + queryId + ":");

            if (answers.get(i).size() == 0) {

                jTextArea.append("Query mistake!");
                //System.out.print("Query mistake!");
                //can not handle the situation that query result = 0

            } else {

                for (int j = 0; j < answers.get(i).size(); j++) {

                    jTextArea.append(answers.get(i).get(j) + "  ");
                    //System.out.print(answers.get(i).get(j) + "  ");

                }
                //System.out.println("Number of matching results: " + answers.get(i).size());
                jTextArea.append("\nNumber of matching results: " + answers.get(i).size());

            }
            jTextArea.append("\n");
            //System.out.println("");


        }
    }

}
