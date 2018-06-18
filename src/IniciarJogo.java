import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class IniciarJogo{
  public void iniciarJogo(Problema p , Projeto proj)
                                       throws IOException{
    Jogo jogo = new Jogo(p, proj);
    jogo.iniciar();
  }
}
