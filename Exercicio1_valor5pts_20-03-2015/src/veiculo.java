
public class veiculo {
	
	private String motor;
	private double preco;
	private String marca;
	private String nome_do_cliente;
	private int quilometros_por_litro;
	private double potencia_veiculo;
	
	
	
	public String getMotor() {
		return motor;
	}



	public void setMotor(String motor) {
		this.motor = motor;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getNome_do_cliente() {
		return nome_do_cliente;
	}



	public void setNome_do_cliente(String nome_do_cliente) {
		this.nome_do_cliente = nome_do_cliente;
	}



	public int getQuilometros_por_litro() {
		return quilometros_por_litro;
	}



	public void setQuilometros_por_litro(int quilometros_por_litro) {
		this.quilometros_por_litro = quilometros_por_litro;
	}



	public void verifica_se_carro_economico(){
		
		if (this.getQuilometros_por_litro() > 10){
			System.out.println("seu veiculo � econ�mico");
			
		}else{
		
			System.out.println(" seu veiculo n�o � economico");
			}
	}

	
		public void verificar_Potencia_veiculo(){
			
		if(this.potencia_veiculo>200){
		
				
		System.out.println("O seu veiculo � potente");
		
		}else{
				
				System.out.println("O seu veiculo n�o � potente");
		}
			
			
	}
}


