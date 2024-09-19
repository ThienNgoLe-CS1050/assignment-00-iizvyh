import javax.swing.JOptionPane;

public class Isaiah_Torres_Assignment02 {

    public static void main(String[] args) {
    	//Variables
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;
        
        //User Input
        firstName = JOptionPane.showInputDialog("Enter your first name: ");
        String stringMiddleInitial = JOptionPane.showInputDialog("Enter your middle name: ");
        middleInitial = stringMiddleInitial.charAt(0);
        lastName = JOptionPane.showInputDialog("Enter your last name: ");
        String stringAge = JOptionPane.showInputDialog("Enter your age: ");
        age = Integer.parseInt(stringAge);
        String stringGrossAnnualPay = JOptionPane.showInputDialog
        		("Enter your gross annual pay: ");
        grossAnnualPay = Double.parseDouble(stringGrossAnnualPay);
        String stringTaxRate = JOptionPane.showInputDialog("Enter the tax rate: ");
        taxRate = Double.parseDouble(stringTaxRate);
        
        //
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
        
        //
        System.out.printf("Hello %s %s. %s,\n", firstName, middleInitial, lastName);
        System.out.printf("You are %d years old now.\n", age);
        System.out.printf("It is amazing that you made $%.0f this year. "
        		+ "With the tax\n", grossAnnualPay);
        System.out.printf("rate of %.2f, you can take home $%.0f.", taxRate, netAnnualPay);
    }
}

