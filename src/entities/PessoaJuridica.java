package entities;

public class PessoaJuridica extends Pessoa {

	private int numeroFuncionario;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	
	@Override
	public double imposto() {
		if (numeroFuncionario > 10) {
		return super.getRendaAnual()*0.14;	
		}else {
			return super.getRendaAnual()*0.16;	
		}
	}

}
