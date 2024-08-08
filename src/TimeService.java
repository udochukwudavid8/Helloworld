import javax.swing.JOptionPane;

public class TimeService {

    public void getDaysToHours(){
        int days = Integer.parseInt(JOptionPane.showInputDialog("Enter Days: "));
        int hours = days * 24;
        JOptionPane.showMessageDialog(null,hours + " hours");
    }
    public void getWeeksToHours(){
        int weeks = Integer.parseInt(JOptionPane.showInputDialog("Enter Week: "));
        int hours = weeks * 7 * 24;
        JOptionPane.showMessageDialog(null,hours + " hours");
    }
}
