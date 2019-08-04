package legacycode.decouple.voidcall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AccountDetailFrame extends Frame implements ActionListener, WindowListener {
    private static final long serialVersioinUID = 1L;
    private TextField display = new TextField(10);

    //how to seperate DetailFrame?
    public void actionPerformed(ActionEvent e) {
        String source = e.getActionCommand();
        if (source.equals("project activity")) {
            DetailFrame detailDisplay = new DetailFrame();
            detailDisplay.setDescription(getDetailText() + " " + getProjectText());
            detailDisplay.show();
            String accountDescription = detailDisplay.getAccountSymbol();
            accountDescription += ":";
            display.setText(accountDescription);
        }

    }

    private String getProjectText() {
        return "";
    }

    private String getDetailText() {
        return "";
    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }
}
