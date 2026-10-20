import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        //iniciar os dados do cliente
        System.out.println("*******************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome:            Luís Henrique");
        System.out.println("tipo conta:      Corrente");
        double valor = 1000.00;
        System.out.println("Saldo Incial:    R$ " + valor);
        System.out.println("*******************************");
        //menu de opções
        System.out.println("operações");
        Scanner resposta = new Scanner(System.in);
        System.out.println("1- consultar saldos");
        System.out.println("2- receber valor");
        System.out.println("3- transferir valor");
        System.out.println("4- sair");
        String respostaDoUsuario = resposta.nextLine();
        //visualização do saldo
        if(respostaDoUsuario.equals("1")) {
            System.out.println("seu saldo atual é: R$ " + valor);
        }
        //Receber valor
        else if (respostaDoUsuario.equals("2")) {
            System.out.println("insira o valor recebido abaixo: ");
            double valorRecebido = resposta.nextDouble();
            valor += valorRecebido;
            System.out.println("seu saldo atual é: R$ " + valor);
        }
        //enviar valor
        else if (respostaDoUsuario.equals("3")) {
            System.out.println("insira o valor que deseja transferir abaixo: ");
            double valorEnviado = resposta.nextDouble();
            valor -= valorEnviado;
            System.out.println("seu saldo atual é: R$ " + valor);
        } else {
            System.out.println("programa encerrado");
            resposta.close();
        }
    }
}
