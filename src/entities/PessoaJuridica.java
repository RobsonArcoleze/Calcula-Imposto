package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}


	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	@Override
	public double imposto() {
		if(numeroDeFuncionarios > 10) {
			return rendaAnual * 0.14;
		}
		return rendaAnual * 0.16;
	}

}
