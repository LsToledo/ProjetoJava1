package curso.java.classes;

public class Aluno {

	public String nome;
	public int idade;
	public String cpf;
	public String endereço;
	public double cadastro;
	public String dataNacimento;
	public String nomeMae;
	public String nomePai;
	public String registoNacional;
	public String escola;
	public String serieMatricula;
	public String dataMatricula;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;

	/*
	 * public Aluno() {
	 * 
	 * }
	 */
	/* Metodo set que recebe dados */



	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getRegistoNacional() {
		return registoNacional;
	}

	public void setRegistoNacional(String registoNacional) {
		this.registoNacional = registoNacional;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getCadastro() {
		return cadastro;
	}

	public void setCadastro(double cadastro) {
		this.cadastro = cadastro;
	}

	public double getMedia() {
		// TODO Auto-generated method stub
		return ( nota1 + nota2 + nota3 + nota4 ) / 4;
	}

}