package curso.java.executavel;
import java.util.Date;
public class PrimeiraClasseJava {

	private String nome;
	private String sobrenome;
	private int idade;
	private Date dataNacimento;
	
	public int getIdade() {
		return idade;
	}

    public Date getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(Date dataNacimento) {
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
