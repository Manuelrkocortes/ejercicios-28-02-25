import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                while (true) {
                    int num1 = random.nextInt(100) + 1;
                    int num2 = random.nextInt(100) + 1;
                    System.out.println("Número 1: " + num1);
                    System.out.println("Número 2: " + num2);
                    System.out.println("Ingrese un signo aritmético (suma: +, resta: -, multiplicacion: *, division: /, ^, %): ");
                    System.out.println("Para ver todas las operaciones, escriba 'all'");

                    String signo = scanner.next();
                    double resultado = 0;
                    switch (signo) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            resultado = (double) num1 / num2;
                            break;
                        case "^":
                            resultado = Math.pow(num1, num2);
                            break;
                        case "%":
                            resultado = num1 % num2;
                            break;
                        case "all":
                            System.out.println("Suma: " + (num1 + num2));
                            System.out.println("Resta: " + (num1 - num2));
                            System.out.println("Multiplicación: " + (num1 * num2));
                            System.out.println("División: " + ((double) num1 / num2));
                            System.out.println("Potencia: " + Math.pow(num1, num2));
                            System.out.println("Módulo: " + (num1 % num2));
                            break;
                        default:
                            System.out.println("Signo aritmético no válido.");
                            continue;
                    }
                    System.out.println("Resultado: " + resultado);

                    System.out.println("¿Desea realizar otra operación? (s/n): ");
                    String continuar = scanner.next();
                    if (!continuar.equalsIgnoreCase("s")) {
                        break;
                    }
                }
                scanner.close();
            }
}