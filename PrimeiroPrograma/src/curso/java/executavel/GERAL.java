package curso.java.executavel;

public class GERAL {

	public static void main(String[] args) {
		double nota1 = 70;
		double nota2 = 60;
		double nota3 = 20;
		double nota4 = 80;
		double notaMedia = ((nota1 + nota2 + nota3 + nota4) / 4);
		String name = "Luis";
/*
		if (notaMedia >= 70) {
			System.out.println("Aprovado :" + notaMedia + " " + nome);
		} else {
			System.out.println("Reprovado:" + notaMedia + " " + nome);
		} */
		String saidaResultado = notaMedia >= 70 ? "Aprovado" : (notaMedia >=40 && notaMedia<=60)? "Recuperaçao" : "Reprovado";
		System.out.println(saidaResultado + " " + notaMedia +" "+ "Aluno: "+" " +name);
	}
		
}
