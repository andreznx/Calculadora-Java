package App;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Insira o primeiro número: ");
        int num1 = scanner.nextInt(); 

        System.out.print("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da opção: ");

        int escolha = scanner.nextInt(); 

        int resultado = 0;
        switch (escolha) {
            case 1:
                resultado = Adicao.somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = Subtracao.subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = Multiplicacao.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    double resultadoDiv = Divisao.dividir(num1, num2);
                    System.out.println("Resultado: " + resultadoDiv);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}