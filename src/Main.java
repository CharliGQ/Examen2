import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //declaracion de Scanner
        Scanner entrada = new Scanner(System.in);

        //declaracion de variables
        String nombreCliente;
        int opcionPaquete, opcionIteraccion;
        double total;

        //declaracion de parque
        ParqueAcuatico parque = new ParqueAcuatico(50.0, 100);

        //pedimos el nombre del cliente
        System.out.println("Bienvenido!");
        System.out.print("Ingrese su nombre:\t");
        nombreCliente = entrada.next();
        parque.setNombreCliente(nombreCliente);

        parque.menuPaquetes();
        opcionPaquete = entrada.nextInt();

        switch (opcionPaquete){
            case 1:
                parque.paquete1();
                break;
            case 2:
                parque.paquete2();
                break;
            case 3:
                parque.menuIteraccion();
                opcionIteraccion = entrada.nextInt();
                parque.setOpcionIteraccion(opcionIteraccion);
                parque.paquete3();
                break;
            case 4:

                break;
        }
    }
}
