import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class MainFrame extends JFrame{

    JDesktopPane jDesktopPane;
    JFileChooser jFileChooser;

    //three private attributes of Astronomical Objects type arraylist
    //for storing the data read from the file
    private ArrayList<Planets> planets_list;
    private ArrayList<Stars> stars_list;
    private ArrayList<Messier> messier_list;

    public MainFrame(ArrayList<Planets> planets_list,ArrayList<Stars> stars_list,ArrayList<Messier> messier_list){

        this.planets_list = planets_list;
        this.stars_list = stars_list;
        this.messier_list = messier_list;

        //set window attribute
        setTitle("Indexing_Web_Browser");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        setSize(dim.width / 2, dim.height / 2);
        setLocation(new Point(dim.width / 4, dim.height / 4));
        //initialise desktopPane
        jDesktopPane = new JDesktopPane();
        setContentPane(jDesktopPane);

        //add menu
        JMenuBar mb = new JMenuBar(); // new menu bar
        setJMenuBar(mb); // attach to frame
        JMenu startMenu = new JMenu("Start"); // new menu
        mb.add(startMenu); // attach to menu bar
        JMenuItem mode01 = new JMenuItem("Query Planets Page"); // new menu item
        JMenuItem mode02 = new JMenuItem("Query Stars Page"); // new menu item
        JMenuItem mode03 = new JMenuItem("Query Messier Page"); // new menu item
        JMenuItem mode2 = new JMenuItem("Query with Query Files"); // new menu item

        mode01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModeFrame1 mf = new ModeFrame1(jDesktopPane);
                ModePanel01 mp = new ModePanel01(planets_list, stars_list, messier_list);
                mf.add(mp);
                jDesktopPane.add(mf);

            }
        });

        mode02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModeFrame1 mf = new ModeFrame1(jDesktopPane);
                ModePanel02 mp = new ModePanel02(planets_list, stars_list, messier_list);
                mf.add(mp);
                jDesktopPane.add(mf);

            }
        });

        mode03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModeFrame1 mf = new ModeFrame1(jDesktopPane);
                ModePanel03 mp = new ModePanel03(planets_list, stars_list, messier_list);
                mf.add(mp);
                jDesktopPane.add(mf);

            }
        });

        mode2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFileChooser.setCurrentDirectory(new File("."));
                int result = jFileChooser.showOpenDialog(MainFrame.this);
                if (result == JFileChooser.APPROVE_OPTION)
                {
                    String name = jFileChooser.getSelectedFile().getPath();
                    ModeFrame2 mf = new ModeFrame2(jDesktopPane, name,planets_list,stars_list,messier_list);
                    jDesktopPane.add(mf);
                }

            }
        });

        startMenu.add(mode01);
        startMenu.add(mode02);
        startMenu.add(mode03);
        startMenu.add(mode2);

        jFileChooser = new JFileChooser();
        jFileChooser.setFileFilter(new FileNameExtensionFilter("txt files","txt"));





    }

    public static void main(String[] args){

        //MainFrame mf = new MainFrame();
        //mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mf.setVisible(true);

    }


}
