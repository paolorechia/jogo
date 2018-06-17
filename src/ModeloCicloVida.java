
public class ModeloCicloVida {

  private String nome;
  private String desc;
  public ModeloCicloVida(String nome, String desc){
    this.nome = nome;
    this.desc = desc;
  }
  public String getNome(){
    return nome;
  }
  public String getDesc(){
    return desc;
  }
  public void exibirNome(){
    System.out.println(nome);
  }
	public void exibirDescricao() {
    System.out.println(desc);
	}

}
