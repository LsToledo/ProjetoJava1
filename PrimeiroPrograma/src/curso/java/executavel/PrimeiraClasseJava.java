package curso.java.executavel;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();/* Instanciado alhno na classe principal. */
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String cpf = JOptionPane.showInputDialog("Qual o cpf");
		String endereço = JOptionPane.showInputDialog("Qual o endereço");
		String cadastro = JOptionPane.showInputDialog("Qual o cadastro");
		String dataNacimento = JOptionPane.showInputDialog("Qual a data nascimento");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai");
		String registroNacional = JOptionPane.showInputDialog("Qual o registro nacional");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola");
		String serieMatricula = JOptionPane.showInputDialog("Qual a serie");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1");
		String nota2 = JOptionPane.showInputDialog("Qual nota 2");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3");
		String nota4 = JOptionPane.showInputDialog("Qual nota 4");/* Buscando informaçao pelo teclado */

		aluno1.setNome(nome);/* Capturando informaçao para variavel */
		aluno1.setCadastro(Double.parseDouble(nota1));
		aluno1.setCpf(cpf);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setDataNacimento(dataNacimento);
		aluno1.setEndereço(endereço);
		aluno1.setEscola(escola);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println(aluno1.getNome());/* retornando e mostrando na tela */
		System.out.println(aluno1.getCadastro());
		System.out.println(aluno1.getCpf());
		System.out.println(aluno1.getDataMatricula());
		System.out.println(aluno1.getDataNacimento());
		System.out.println(aluno1.getEndereço());
		System.out.println(aluno1.getEscola());
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.getNomeMae());
		System.out.println(aluno1.getNomePai());
		System.out.println(aluno1.getMedia());
		
		

	}

}
