import javax.swing.*;

public class ModeFrame1 extends JInternalFrame {

    public ModeFrame1(JDesktopPane jDesktopPane){

        setTitle("Query Page");
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        int width = jDesktopPane.getWidth();
        int height = jDesktopPane.getHeight();
        setSize(width,height);
        setVisible(true);

    }

}
