package colections;

import javax.swing.JOptionPane;

public class TesteExcecoes02 {

		public static double calcularArea(double base, double altura) throws Exception {
			/* 
			 * consideramos que n�o seja possivel retangulos com
			 * lados negativos
			 * 
			 */
			if (base <= 0 || altura <= 0 ) {
				throw new Exception("Os lados do ret�ngulo devem ser positivos!");
				
			}
			return base * altura;
		}
		public static void main(String[] args) {
			//System.out.println("�rea = " + calcularArea(-10,5));
			try {
				System.out.println("�rea = " + calcularArea(-10,5));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
}
