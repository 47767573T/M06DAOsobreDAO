import java.util.Scanner;
import DAO.*;


/**
 * Created by Moises on 14/04/2016.
 */
public class Menu {

    private static final String IP = "172.31.101.225";
    private static final String PORT = "8080";
    private static String adminUsername = "admin";
    private static String adminPassword = "dionis";
    private static String yourCollection = "uriDAO";
    private static DAO1 dao;



    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);

        dao = new DAO1(IP, PORT);
        prepararDB(dao);

        boolean enMenu = true;
        String menuOpcion;

        while (enMenu){
            System.out.println("\n");
            System.out.println("MENU:");

            System.out.println("----------------------------------------------------");

            System.out.println("1--> Introducir nuevo empleado");
            System.out.println("2--> Introducir nuevo cliente");
            System.out.println("3--> Eliminar empleado");
            System.out.println("4--> Eliminar cliente");
            System.out.println("5--> Consultar empleado por edad");
            System.out.println("6--> Consultar empleado por sueldo");
            System.out.println("7--> Consultar empleado por años trabajados");
            System.out.println("8--> Buscar facturas en una franja concreta");
            System.out.println("9--> Consultar facturas de un cliente");


            System.out.println("0--> Salir del programa");
            System.out.println(" ");
            menuOpcion = scn.nextLine();

            switch (menuOpcion) {

                case "1":
                    dao.

                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":

                    break;

                case "8":

                    break;

                case "9":

                    break;

            }


        }

    }

    private static void prepararDB(DAO1 dataAcces) {


    }


    public String leerTexto(String pregunta) {
        Scanner in = new Scanner(System.in);
        String res = null;
        while (res == null) {
            System.out.print(pregunta + ": ");
            res = in.next();
            if ("".equals(res))
                res = null;
            in.nextLine();
        }
        return res;
    }

    public int leerEntero(String pregunta) {
        Scanner in = new Scanner(System.in);
        int res = -1;
        while (res == -1) {
            System.out.print(pregunta + ": ");
            try {
                res = in.nextInt();
            } catch (Exception ex) {
                System.out.println("Entrada invàlida.");
            }
            in.nextLine();
        }
        return res;
    }

}
