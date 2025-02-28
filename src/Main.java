import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double altura;
        double indice;
        System.out.println("digite su peso");
        peso = teclado.nextDouble();
        System.out.println("digite su altura");
        altura = teclado.nextDouble();
        indice = peso/(altura*altura);
        if (indice <18.5 ) {
            System.out.println("Bajo Peso");
        } else if (indice >= 18.6 && indice <24.9) {
            System.out.println("Normal");
        } else if (indice >=25  && indice <26.9 ) {
            System.out.println("Sobrepeso grado1");
        } else if (indice >=27  && indice <29.9 ) {
            System.out.println("sobrepeso grado 2");
        }else if (indice >= 30 && indice <34.9) {
                System.out.println("Obesidad tipo 1");
            } else if (indice >=35 && indice <39.9 ) {
                System.out.println("obesidad tipo 2");
            } else if (indice >=40  && indice <49.9) {
                System.out.println("obesidad tipo 3 (morbida)");
            } else if (indice >=50 ) {
                System.out.println("obesidad tipo 4 (extrema)");
        }
        }
    }
