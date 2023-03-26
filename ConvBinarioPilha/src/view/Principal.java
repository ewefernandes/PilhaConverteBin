package view;
import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) throws Exception {
		int num = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Valor de 0 a 1000"));
		} while (num < 0 || num > 1000);
		
		ConverteController conversao = new ConverteController();
		String binary = conversao.decToBin(num);
		System.out.println("Binario = " +binary);
	}

}
