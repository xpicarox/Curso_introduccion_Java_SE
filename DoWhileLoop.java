import java.util.Scanner;
public class DoWhileLoop {
    public static void main(){
        int response = 0;
        do {
            System.out.println("Slecciona el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona la opcion correcta");
                    break;
            }

            
        }while (response != 0);

        System.out.println("Se termino el programa");

    }

}
