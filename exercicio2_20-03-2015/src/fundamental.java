
public class fundamental extends aluno {
	
	private materia educacao_artitisca = new materia("educa��o_artitisca");
	private materia ciencias = new materia("ciencias");
	public materia getEducacao_artitisca() {
		return educacao_artitisca;
	}
	public void setEducacao_artitisca(materia educacao_artitisca) {
		this.educacao_artitisca = educacao_artitisca;
	}
	public materia getCiencias() {
		return ciencias;
	}
	public void setCiencias(materia ciencias) {
		this.ciencias = ciencias;
	}
	@Override
	
	public void estudar(){
		System.out.println("preciso estudar para a prova de matematica na segunda feira");
	}
	
}
