package curso.java.executavel;
import java.util.Date;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		
		String idade = JOptionPane.showInputDialog("Informe a sua idade");
		String moto = JOptionPane.showInputDialog("Informe a Sua moto");
		double transorfmando = Double.parseDouble(moto);
		double transorfmando2 = Double.parseDouble(idade);

		double soma = (transorfmando + transorfmando2);
		System.out.println("Sua idade é :" + soma);
}
}








