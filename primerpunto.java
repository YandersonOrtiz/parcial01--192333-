import java.util.Scanner;
public class primerpunto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura a la que desa calcularle el area (Triangulo, Cuadrado, Rectangulo): ");
        String nombre =scanner.nextLine().toLowerCase();

        switch (nombre) {
            case "triangulo":
                
                System.out.print("ingrese el valor de la base: ");
                double base1=scanner.nextDouble();
                System.out.print("ingrese el valor de la altura: ");
                double altura1=scanner.nextDouble();
                double area1=(base1*altura1)/2;
                System.out.println("El area del triangulo es: "+area1);
                break;
            case "cuadrado":
                System.out.print("ingrse el valor del lado: ");
                double lado=scanner.nextDouble();
                double area2=lado*lado;
                System.out.println("El area del cuadrado es: "+area2);

            case "rectangulo":
            System.out.print("ingrese el valor de la base: ");
            double base3=scanner.nextDouble();
            System.out.print("ingrese el valor de la altura: ");
            double altura3=scanner.nextDouble();
            double area3=base3*altura3;
            System.out.println("El valor del area del rectangulo es: "+area3);
            default:
            System.out.println("El nombre ingresado no podemos calcularlo");
                break;
        }
        scanner.close();
    }
    


    
}