public class funcionario {

	private String nome;
	private String departamnto_onde_trabalha;
	private double salario;
	private String data_entrada;
	private String rg;
	private boolean funcionario_ativo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamnto_onde_trabalha() {
		return departamnto_onde_trabalha;
	}

	public void setDepartamnto_onde_trabalha(String departamnto_onde_trabalha) {
		this.departamnto_onde_trabalha = departamnto_onde_trabalha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void bonifica(double valor) {
		double salario_atual = this.getSalario();
		double novo_salario = salario_atual + valor;

		this.setSalario(novo_salario);
	}

	public void verifica_demicao() {
		if (funcionario_ativo == true) {
			System.out.println(" o funcionario n�o foi demitido");
		} else {
			System.out.println("o funcionario n�o trabalha mais na empresa");
		}

	}

}
