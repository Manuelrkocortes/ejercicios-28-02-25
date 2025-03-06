import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                System.out.println("Bienvenido a la calculadora de operaciones aritméticas");
                System.out.println("Para realizar una operación, ingrese dos números y un signo aritmético");
                System.out.println("Si desea ver todas las operaciones posibles, escriba 'all'");
                while (true) {
                    System.out.println("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Número 1: " + num1);
                    System.out.println("Número 2: " + num2);
                    System.out.println("Ingrese un signo aritmético (suma: +, resta: -, multiplicacion: *, division: /, ^, %): ");
                    System.out.println("Para ver todas las operaciones, escriba 'all'");

                    String signo = scanner.next();
                    double resultado = 0;
                    if (signo.equals("+")) {
                        resultado = num1 + num2;
                    } else if (signo.equals("-")) {
                        resultado = num1 - num2;
                    } else if (signo.equals("*")) {
                        resultado = num1 * num2;
                    } else if (signo.equals("/")) {
                        resultado = (double) num1 / num2;
                    } else if (signo.equals("^")) {
                        resultado = Math.pow(num1, num2);
                    } else if (signo.equals("%")) {
                        resultado = num1 % num2;
                    } else if (signo.equals("all")) {
                        System.out.println("Suma: " + (num1 + num2));
                        System.out.println("Resta: " + (num1 - num2));
                        System.out.println("Multiplicación: " + (num1 * num2));
                        System.out.println("División: " + ((double) num1 / num2));
                        System.out.println("Potencia: " + Math.pow(num1, num2));
                        System.out.println("Porcentaje:" + (num1 % num2));
                        continue;
                    } else {
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