import java.io.*;

public class MainScreen extends Screen{
  public MainScreen(){
    setTitulo("MAIN MENU");
    this.setOp("cadastrar", "cadastra um novo problema");
    this.setOp("selecionar","seleciona um problema para resolver");
    this.setOp("sair", "sai do programa");
  }
}
