package lab2p2_walterdoblado;

import java.util.Scanner;

public class Lab2P2_walterdoblado {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opc = 0;

        String usuario;
        String contra;
        String verUsuario = "gerente";
        String verContra = "g3r$nt0";

        System.out.println("ingrese el nombre de usuario");
        usuario = lea.next();
        System.out.println("ingrese la contraseña");
        contra = lea.next();

        if (contra.equals(verContra) && usuario.equals(verUsuario)) {

            while (opc != 2) {
                menu();
                opc = lea.nextInt();

                if (opc == 1) {

                } else if (opc == 2) {

                } else {

                }

            }
        } else {

            System.out.println("el nombre del usuario o contraseña es incorrecta");
        }

    }

    static void menu() {

        System.out.println("Bienvenido a registro del restaurante\n"
                + " ingrese la opcion que desea\n"
                + "1. Registro de Chefs\n"
                + "2. Registro Meseros\n"
                + "3. Registro Bartenders\n"
                + "5. Registro Mesas\n"
                + "6. salir del programa");

    }

}
