package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}


	public Double getGastosComSaude() {
		return gastosComSaude;
	}


	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}


	@Override
	public double imposto() {
		if(rendaAnual < 20000.00) {
			return rendaAnual * 0.15;
		}
		return (rendaAnual * 0.25) - (gastosComSaude * 0.5);
		
	}

	
}
