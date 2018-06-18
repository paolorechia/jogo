import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class CriarCronograma{
  public static Cronograma criarCronograma(
                         ArrayList<Etapa> e_list)
                         throws IOException{
    Screen scr = new Screen(); 
    int dur;
    scr.setTitulo("Criacao do Cronograma");
    scr.setPrompt("Entre com a duracao esperada em dias para a etapa: ");
    scr.addMsg(String.format("%d etapas para definir", e_list.size()));
    scr.display();
    for (Etapa e: e_list){
      scr.zeraMsg();
      scr.addMsg(String.format("Etapa atual: %s", e.getNome()));
      scr.display();
      dur = UserInterface.getNumeric();
      e.definirDuracaoEsperada(dur);
    }
    Cronograma cron = new Cronograma(e_list);
    scr.addMsg("Cronograma criado!");
    scr.setPrompt("Aperte enter para continuar");
    scr.display();
    String input = UserInterface.getUserInput();
    return cron;
  }
}
