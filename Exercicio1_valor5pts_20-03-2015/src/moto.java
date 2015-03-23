
public class moto extends veiculo {
	
	private String capacete;
	private String somente_duas_rodas;
	private int cilindradas;
	public String getCapacete() {
		return capacete;
	}
	public void setCapacete(String capacete) {
		this.capacete = capacete;
	}
	public String getSomente_duas_rodas() {
		return somente_duas_rodas;
	}
	public void setSomente_duas_rodas(String somente_duas_rodas) {
		this.somente_duas_rodas = somente_duas_rodas;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public void verifica_se_moto_potente(){
		
		if(this.getCilindradas() > 125){
			
			System.out.println("Sua moto é potente");
		}else{
			System.out.println("Sua moto não é potente");
		}
	}

	
	
	
}
