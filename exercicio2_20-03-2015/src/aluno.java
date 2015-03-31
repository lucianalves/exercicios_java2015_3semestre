public abstract class aluno {

	private String nome;
	private String serie;
	private int num_de_matricula;
	
	private materia portugues = new materia("portugues");
	private materia matematica = new materia("matemática");
	private materia geografia = new materia("geografia");
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getNum_de_matricula() {
		return num_de_matricula;
	}
	public void setNum_de_matricula(int num_de_matricula) {
		this.num_de_matricula = num_de_matricula;
	}
	public materia getPortugues() {
		return portugues;
	}
	public void setPortugues(materia portugues) {
		this.portugues = portugues;
	}
	public materia getMatematica() {
		return matematica;
	}
	public void setMatematica(materia matematica) {
		this.matematica = matematica;
	}
	public materia getGeografia() {
		return geografia;
	}
	public void setGeografia(materia geografia) {
		this.geografia = geografia;
	}
	
	public void estudar(){
		System.out.println("eu tenho 3 materias para estudar");
	}
	
}