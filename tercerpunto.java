import java.util.Scanner;
public class tercerpunto {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrse la cantidad de datos de la lista a promediar");
        int numero=scanner.nextInt();

        double [] numeros= new double [numero];
        int longitud=numeros.length;
       

        for(int i=0;i<longitud;i++){
            System.out.print("ingrese el valor de la lista para la posicion "+i+":");
            numeros[i]=scanner.nextInt();
        }
        double acumulador=0;
        for(int i=0;i<longitud;i++){
            acumulador=acumulador+numeros[i];
        }
        double promedio=acumulador/longitud;
        System.out.println("El promedio del la lista es: "+promedio);
        scanner.close();
    }
    
    
}
