import javax.swing.JOptionPane;

class helloworld {
    public static void main(String[] args) {
        TimeService timeService = new TimeService();
        while(true){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Pick one of the options. 0 or 1. O to convert from Days to Hour, 1 to convert from week to Hours"));
            if (input == 0) {
                timeService.getDaysToHours();
            }
            else if (input == 1) {
                timeService.getWeeksToHours();
            }
            System.out.println("Hello world trial");
            System.out.println("Hello world trial for git hub");
            System.out.println(4*8);
        }

    }
 }