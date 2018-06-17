public class Custo {

	private int analise;
	private int projeto;
	private int BD;
	private int programacao;
	private int teste;

  public Custo(int analise, int proj, int bd, int prog, int teste){
    this.analise = analise;
    this.projeto = proj;
    this.BD = bd;
    this.programacao = prog;
    this.teste = teste;
  }
  public String getString(){
    return String.format(
      "analise: %d\nprojeto: %d\nBD: %d\nprogramacao: %d\nteste: %d\n",
      analise, projeto, BD, programacao, teste);
  }
}
