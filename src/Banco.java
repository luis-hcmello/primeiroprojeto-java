import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Luís Henrique";
        String tipoConta = "corrente";
        double valor = 1000.00;

        System.out.println("\n*******************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome:            " + nome);
        System.out.println("tipo conta:      " + tipoConta);
        System.out.println("Saldo Incial:    R$ " + valor);
        System.out.println("\n*******************************");

        String menu = """
                     1- consultar saldos
                     2- receber valor
                     3- transferir valor
                     4- sair
                    """;
        System.out.println(menu);
        Scanner resposta = new Scanner(System.in);
        int respostaDoUsuario = resposta.nextInt();

        while (respostaDoUsuario != 4) {
            if(respostaDoUsuario == 1) {
                System.out.println("O seu saldo atual é: R$ " + valor);
            }
            else if (respostaDoUsuario == 2) {
                System.out.println("insira o valor recebido abaixo: ");
                double valorRecebido = resposta.nextDouble();
                valor += valorRecebido;
                System.out.println("seu saldo atual é: R$ " + valor);
            }
            else if (respostaDoUsuario == 3) {
                System.out.println("insira o valor que deseja transferir abaixo: ");
                double valorEnviado = resposta.nextDouble();
                 if (valorEnviado > valor) {
                    System.out.println("Erro, Saldo insuficiente");
                    return;
                 } else {
                    valor -= valorEnviado;
                    System.out.println("seu saldo atual é: R$ " + valor);
                 }
            } else if (respostaDoUsuario != 4) {
                System.out.println("opção invalida");
            }
            System.out.println(menu);
            respostaDoUsuario = resposta.nextInt();
        }
    }
}