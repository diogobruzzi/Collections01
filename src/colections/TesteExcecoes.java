package colections;

import javax.swing.JOptionPane;

public class TesteExcecoes {
    public static void main(String[] args) {
    	try {
    	String idade = JOptionPane.showInputDialog("Qual a sua idade? ");
    	int valorIdade = Integer.parseInt(idade);
    	System.out.print("Sua idade é " + valorIdade);
    	} 
    	catch (NumberFormatException e) {
    		JOptionPane.showMessageDialog(null,e.getMessage());
    		//System.out.println(e.getMessage());
    	} 
    }  
}
