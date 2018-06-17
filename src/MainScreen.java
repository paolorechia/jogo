import java.io.*;

public class MainScreen extends Screen{
  public void display(){
    System.out.print("\033\143");
    System.out.println("==================================================");
    System.out.println("                      MENU PRINCIPAL              ");
    System.out.println("==================================================");
    System.out.println("Por favor, escolha alguma das opcoes abaixo:");
    System.out.println("==================================================");
    System.out.println("cadastrar   -  cadastra um novo problema");
    System.out.println("selecionar  -  seleciona um problema para resolver");
    System.out.println("sair        -  seleciona um problema para resolver");
  }
}
