
public class main {
	
	public static void main(String args[]){
		
		fundamental aluno1 = new fundamental();
		aluno1.setNome("z� das couve");
		
		double notas[] = new double[3];
		
		notas[0] = 17;
		notas[1] = 16;
		notas[2] = 8;
		
		aluno1.getGeografia().setNotas(notas);
		
		
		aluno1.getGeografia().setFaltas(3);
		System.out.println(" a media da disciplina geografia �  " + aluno1.getGeografia().obter_media());
	
	}
}
