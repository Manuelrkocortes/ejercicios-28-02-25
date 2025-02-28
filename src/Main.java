import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 duplica
        //2 pierde la mitad
        //3 pierdetodo
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        double dinero;
        int aleatorio;
        double resultado = 0;
        int opcion;
        aleatorio = ale.nextInt((3 - 1 + 1)) + 1;
        System.out.println("digite la cantidad que quiere apostar");
        dinero = teclado.nextInt();
        do {
            if (aleatorio == 3) {
                resultado = dinero * 0;
                System.out.println("ha perdido su dinero");
                System.out.println("su dinero es:" + resultado);
                break;
            } else if (aleatorio == 2) {

                resultado = dinero / 2;
                System.out.println("ha perdido la mitad de su dinero");
                System.out.println("quiere seguir jugando si=1 no=2");
                opcion = teclado.nextInt();
                if (opcion == 1) {
                     aleatorio = ale.nextInt((3 - 1 + 1)) + 1;
                    continue;
                }
                else if (opcion ==2){
                    break;
                }

                }
             else if (aleatorio == 1) {
                resultado = dinero * 2;
                System.out.println("su dinero se duplico");
                System.out.println("su ganancia es:" + resultado);
                System.out.println("quiere seguir jugando si=1 no=2");
                opcion = teclado.nextInt();
                if (opcion == 1) {
                     aleatorio = ale.nextInt((3 - 1 + 1)) + 1;
                    continue;
                }
                else if (opcion ==2){
                    break;
                }
            }
            System.out.println("su dinero se duplico");
             System.out.println("su ganancia es:" + resultado);
            System.out.println("quiere seguir jugando si=1 no=2");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                continue;
            }
            else if (opcion ==2){
                break;
            }
        }while ( aleatorio == ale.nextInt((3 - 1 + 1)) + 1);

    }
}