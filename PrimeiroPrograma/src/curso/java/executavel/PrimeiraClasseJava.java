package curso.java.executavel;
import java.util.Date;
public class PrimeiraClasseJava {

	private String nome;
	private String sobrenome;
	private int idade;
	private Data dataNacimento;
	
	public int getIdade() {
		return idade;
	}

    public Data getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(Data dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
