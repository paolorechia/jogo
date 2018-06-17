import java.io.*;

public class CriarObjetivo{
  public Objetivo criarObjetivo() throws IOException{
    Screen scr = new Screen(); 
    Objetivo o = null; 
    scr.setTitulo("Criar Objetivo - passo 0");
    scr.setOp("abortar", "retorna ao menu principal");
    scr.setOp("f","fornecer nome do objetivo");
    String input;
    String nome;
    int analise, proj, bd prog, teste;
    while (true){
      scr.display();
      input = UserInterface.getUserInput();
      if (input.toUpperCase().equals("ABORTAR")){
        return null;
      }
      else if (input.toUpperCase().equals("F"){
        System.out.println("Forneca o nome: ");
        nome = UserInterface.getUserInput();
        System.out.print("Custo analise: "); 
        analise = UserInterface.getNumeric();
        System.out.print("Custo proj: "); 
        proj = UserInterface.getNumeric();
        System.out.print("Custo bd: "); 
        bd = UserInterface.getNumeric();
        System.out.print("Custo prog: "); 
        prog = UserInterface.getNumeric();
        System.out.print("Custo teste: "); 
        teste = UserInterface.getNumeric();
        o = new Objetivo();
        o.setaNome(nome);
        o.setaCusto(analise, proj, bd, prog, teste);
        return o;
      }  
    }
  }
}