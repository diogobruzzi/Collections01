/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colections;

import javax.swing.JOptionPane;

public class Colections {
    public static void main(String[] args) {
    	String idade = JOptionPane.showInputDialog("Qual a sua idade? ");
    	int valorIdade = Integer.parseInt(idade);
    	System.out.print("Sua idade é " + valorIdade);
    
    }
    
}
