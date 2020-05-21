import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ModePanel01 extends JPanel {

    ButtonPanel buttonPanel;
    JTextArea jTextArea;//result area

    public ModePanel01(ArrayList<Planets> planets_list, ArrayList<Stars> stars_list, ArrayList<Messier> messier_list){

        setLayout(new GridLayout(1,1));
        buttonPanel = new ButtonPanel(jTextArea);
        add(buttonPanel);
        jTextArea = new JTextArea(20,30);
        JScrollPane scroll = new JScrollPane(jTextArea);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scroll);
        //clear result
        buttonPanel.resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextArea.setText("");

            }
        });
        buttonPanel.queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String querySentence = buttonPanel.sqlArea.getText();
                ArrayList<ArrayList<String>> answers = new ArrayList<>();
                QueryRunner qr = new QueryRunner();
                Query newQuery = (Query) qr.run(querySentence);
                newQuery.setStars_list(stars_list);
                newQuery.setMessier_list(messier_list);
                newQuery.setPlanets_list(planets_list);
                answers.add(newQuery.getIDs());

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
        });

    }
    private static class ButtonPanel extends JPanel{

        JTextArea sqlArea;//sql area
        JTextField dataField;//data input area
        JButton queryButton;//query button
        JButton resultButton;//clear result button
        int count = 0;
        String sql = "";
        public ButtonPanel(JTextArea jTextArea){

            setBorder(BorderFactory.createTitledBorder("Query Planets"));
            setLayout(new GridLayout(7,1));
            JLabel label=new JLabel("Attribute:");
            add(label);
            String[] attributeStrings = { "name", "ra", "decl", "magn", "distance","albedo" };
            JComboBox<String> attributeList = new JComboBox<String>(attributeStrings);
            attributeList.setSelectedIndex(0);
            add(attributeList);
            JPanel bodyPanel = new JPanel();
            bodyPanel.setLayout(new GridLayout(2,2));
            JLabel label2=new JLabel("Condition:");
            bodyPanel.add(label2);
            JLabel label4=new JLabel("Value");
            bodyPanel.add(label4);
            String[] conditionStrings = { ">", ">=", "<", "<=", "=","!=" };
            JComboBox<String> conditionList = new JComboBox<String>(conditionStrings);
            conditionList.setSelectedIndex(0);
            bodyPanel.add(conditionList);
            dataField = new JTextField();
            bodyPanel.add(dataField);
            add(bodyPanel);
            JButton addButton = new JButton("Add Condition");
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String attribute = attributeList.getSelectedItem().toString();
                    String condition = conditionList.getSelectedItem().toString();
                    String value = dataField.getText();
                    if (count == 0){

                        sql = "select planets where "+ attribute + " "+condition+ " "+value;

                    }else {

                        sql = sql + " and " + attribute + " "+condition+ " "+value;

                    }
                    count++;
                    sqlArea.setText("");//clean sqlArea
                    sqlArea.append(sql);

                }
            });
            add(addButton);
            JLabel label3=new JLabel("Query sentence");
            add(label3);
            sqlArea = new JTextArea(18,5);
            //user cannot type the string straight
            sqlArea.setEditable(false);
            JScrollPane jScrollPane = new JScrollPane(sqlArea);
            jScrollPane.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            jScrollPane.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            add(jScrollPane);
            JPanel footerPanel = new JPanel();
            footerPanel.setLayout(new GridLayout(1,1));
            JButton clearButton = new JButton("Clear Query");
            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count = 0;//reset count and sqlArea
                    sqlArea.setText("");

                }
            });
            footerPanel.add(clearButton);
            queryButton = new JButton("Query");
            footerPanel.add(queryButton);
            resultButton = new JButton("Clear Result");
            footerPanel.add(resultButton);
            add(footerPanel);




        }

    }

}
