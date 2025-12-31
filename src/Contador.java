import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroUm, parametroDois);

       } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm > parametroDois) {
           throw new ParametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            int contagem = parametroDois - parametroUm;
            for(int sequencia = 1; sequencia < contagem; sequencia++) {
                System.out.println("Imprimindo o número " + sequencia);

            }
        }
    }
}

class ParametroInvalidosException extends Exception {
    public ParametroInvalidosException(String mensagem) {
        super(mensagem);
    }
}
