// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// programa imprime nome na tela 
// autor: Ranieri jesuino
// data: 07/04/2022
public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world! Welcome to Java");

    //variaveis do tipo boolean
   // boolean media = true;
   // boolean frequencia = true;
    //boolean aprovado = media && frequencia;
    boolean cafe= false;
    boolean agua=true;
    boolean clienteServido = cafe || agua;

    // System.out.println("cliente Servido?" + clienteServido+"\n");
    //  System.out.println("cliente Servido?" + clienteServido);
    //System.out.print("Aprovacao é:"+aprovado)

    //variaveis do tipo inteiro
    //int idade = 20;

    //variaeis do tipo double
    //double salario = 2000.00;
    //float temperatura = 25.5f;

    //variaveis do tipo string
    String nome = "Ranieri";
    String sobrenome = "Jesuino";
    String cpf = "77845789625";
    System.out.println("Nome: " + nome + " " + sobrenome + "\nCPF: " + cpf);
  }

 
}