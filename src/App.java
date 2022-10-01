import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        double numero = 0;

        System.out.print("Digite um número: ");
        numero = console.nextDouble();

        System.out.println("O número informado foi " + numero);
        console.close();
    }
}
