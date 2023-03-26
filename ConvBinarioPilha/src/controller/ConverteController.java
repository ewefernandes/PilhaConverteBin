package controller;
import br.edu.fateczl.pilhaint.*;

public class ConverteController {

	public String decToBin(int decimal) throws Exception {
		
		Pilha pilha = new Pilha();
		String binario = "";
		
		do { 
			pilha.push(decimal % 2);
			decimal = decimal / 2;
		} while (decimal != 0);
		
		do {
			binario+= pilha.pop();
		} while (pilha.isEmpty() == false);
		
		return binario;
		
	}
}
