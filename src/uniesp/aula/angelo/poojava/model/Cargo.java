package uniesp.aula.angelo.poojava.model;

public class Cargo {
	
	private String cargo;

	public Cargo(String cargo) {
		
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Cargo [cargo=" + cargo + "]";
	}

	
}
