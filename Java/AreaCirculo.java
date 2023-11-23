// Calcular el Area de Un circulo
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double pi = 3.1416,area,radio;

        System.out.println("Ingrese el radio del circulo ");
        radio = input.nextDouble();

        area = pi * (radio*radio);
        System.out.println("El area del circulo es de "+area+" cm^2");
        input.close();

    }
}
