import java.util.Scanner;

public class calculadoraBasica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numeroUno = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numeroDos = sc.nextDouble();

        System.out.print("Ingrese la operacion (suma resta multiplicacion division): ");
        String operacion = sc.next();

        double resultado = 0;

        if (operacion.equals("suma")) {
            resultado = numeroUno + numeroDos;
        } else if (operacion.equals("resta")) {
            resultado = numeroUno - numeroDos;
        } else if (operacion.equals("multiplicacion")) {
            resultado = numeroUno * numeroDos;
        } else if (operacion.equals("division")) {
            if (numeroDos != 0) {
                resultado = numeroUno / numeroDos;
            } else {
                System.out.println("No se puede dividir entre cero");
                return;
            }
        } else {
            System.out.println("Operacion no valida");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
