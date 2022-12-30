package curso.java.executavel;
import java.util.Date;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		
		String ano = JOptionPane.showInputDialog("Informe ano atual");
		String anonasc = JOptionPane.showInputDialog("Informe o ano de nascimento!");
		double transorfmando = Double.parseDouble(anonasc);
		double transorfmando2 = Double.parseDouble(ano);

		double op = (transorfmando2 - transorfmando);
		JOptionPane.showMessageDialog(null, "Sua idade é :" + op);
		int resposta =JOptionPane.showConfirmDialog(null," A idade esta correta ?");
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "Ok recebemos sua idade confirmada!");
		}
		
		
		
}
}








