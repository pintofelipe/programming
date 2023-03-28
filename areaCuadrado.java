import java.util.Scanner;
public class areaCuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float area,perimetro,lado;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = input.nextFloat();
        area = lado*lado;
        System.out.print("El area del triangulo es de "+area+" cm^2");
        perimetro = lado*4;
        System.out.print("El perimetro del triangulo es de: "+perimetro+" cm");    
    }
    
}
