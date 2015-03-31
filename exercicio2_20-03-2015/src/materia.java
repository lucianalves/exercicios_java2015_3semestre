
public class materia {
	
	
	private String nome;
	private int faltas;
	private double notas[] = new double[3];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	//sobrecarga;
	
	public materia(String nome) {
		super();
		this.nome = nome;
	}
	
	public materia(String nome, int faltas, double[] notas) {
		super();
		this.nome = nome;
		this.faltas = faltas;
		this.notas = notas;
	}
	
	public double obter_media(){
		
		double somar_notas = notas[0] + notas[1] + notas[2];
		double media_notas = somar_notas/3;
		return media_notas;
	}
}

