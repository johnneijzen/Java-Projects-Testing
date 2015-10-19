import javax.swing.JOptionPane;

public class Dulzen
{
    public static void main(String[ ] args)
    {
        int num;
        String options = JOptionPane.showInputDialog("Enter N for NORMAL or R for REVERSE");
        
        String number = JOptionPane.showInputDialog("Enter Number");
        num = Integer.parseInt(number);
        
        char option = options.charAt(0);
        if(option == 'N') {
            for(int i=num; i != 0; i--){
                for(int y=0; y < i; y++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if (option == 'R') {
            for(int i=0; i < num + 1; i++){
                for(int y=0; y < i; y++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.print("Invalid Option");
        }
    }
}
