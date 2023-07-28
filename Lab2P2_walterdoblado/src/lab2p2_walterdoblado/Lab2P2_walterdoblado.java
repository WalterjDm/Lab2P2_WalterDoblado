package lab2p2_walterdoblado;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_walterdoblado {

    public static void main(String[] args) {
        ArrayList ch = new ArrayList();
        Scanner lea = new Scanner(System.in);
        int opc = 0;

        String usuario;
        String contra;
        String verUsuario = "gerente";
        String verContra = "g3r$nt0";
        int contChef = 0;

        System.out.println("ingrese el nombre de usuario");
        usuario = lea.next();
        System.out.println("ingrese la contraseña");
        contra = lea.next();

        if (contra.equals(verContra) && usuario.equals(verUsuario)) {

            while (opc != 5) {
                menu();
                opc = lea.nextInt();

                if (opc == 1) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n1. crear chef"
                            + "\n2. modificar chef"
                            + "\n3. eliminar"
                            + "\n4. listar chef"
                            + "\n5. volver");
                    int op = 0;

                    if (op == 1) {
                        String nomChef;
                        int edadChef;
                        String turno;

                        int numMichelin;
                        int sueldoChef;

                        System.out.println("ingrese el nombre del chef");
                        nomChef = lea.next();

                        System.out.println("ingrese la edad del chef");
                        edadChef = lea.nextInt();
                        System.out.println("ingrese el turno");
                        turno = lea.next();

                        System.out.println("ingrese el N° de estrellas\n"
                                + "Michelin ");
                        numMichelin = lea.nextInt();
                        System.out.println("ingrese el sueldo del chef");
                        sueldoChef = lea.nextInt();

                        if (contChef < 15) {

                            ch.add(new Chefs(nomChef, edadChef, turno, numMichelin, sueldoChef));
                            System.out.println("chef agregado");
                            contChef++;
                        } else if (contChef > 14) {

                            System.out.println("el numero de chef paso el limite");
                        }

                    } else if (op == 2) {
                        String nomChef;
                        int edadChef;
                        String turno;

                        int numMichelin;
                        int sueldoChef;

//                        if (p2>=0&&p2<cosas.size()) {
//                        if (cosas.get(p2) instanceof televisor) {
//                            
//                            JOptionPane.showMessageDialog(null, "Televisor modificado exitosamente");
//                        } else {
//                            JOptionPane.showMessageDialog(null, "TV no encontrado");
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "La posicion esta fuera de rango");
//                    }
//                    break;
                        int p2;
                        System.out.println(ch);
                        System.out.println("ingrese la posicion");
                        p2 = lea.nextInt();
                        if (p2 >= 0 && p2 < ch.size()) {
                            System.out.println("ingrese el nombre del chef");
                            nomChef = lea.next();
                            ((Chefs) ch.get(p2)).setNomChef(nomChef);
                            System.out.println("ingrese la edad del chef");
                            edadChef = lea.nextInt();
                            ((Chefs) ch.get(p2)).setEdadChef(edadChef);
                            System.out.println("ingrese el turno");
                            turno = lea.next();
                            ((Chefs) ch.get(p2)).setTurno(turno);
                            System.out.println("ingrese el N° de estrellas\n"
                                    + "Michelin ");
                            numMichelin = lea.nextInt();
                            ((Chefs) ch.get(p2)).setNumMichelin(numMichelin);
                            System.out.println("ingrese el sueldo del chef");
                            sueldoChef = lea.nextInt();
                            ((Chefs) ch.get(p2)).setSueldoChef(sueldoChef);
                        }

                    } else if (op == 3) {

                    } else if (op == 4) {

                    } else if (op == 5) {

                    } else {

                    }

                } else if (opc == 2) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n1. crear chef"
                            + "\n2. modificar chef"
                            + "\n3. eliminar"
                            + "\n4. listar chef"
                            + "\n5. volver");

                } else if (opc == 3) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n1. crear chef"
                            + "\n2. modificar chef"
                            + "\n3. eliminar"
                            + "\n4. listar chef"
                            + "\n5. volver");

                } else if (opc == 4) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n1. crear chef"
                            + "\n2. modificar chef"
                            + "\n3. eliminar"
                            + "\n4. listar chef"
                            + "\n5. volver");

                } else if (opc == 5) {

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
                + "4. Registro Mesas\n"
                + "5. salir del programa");

    }

}
