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
                            + "\n\n1. crear chef"
                            + "\n\n2. modificar chef"
                            + "\n\n3. eliminar"
                            + "\n\n4. listar chef"
                            + "\n\n5. volver");
                    int op = 0;

                    if (op == 1) {
                        String nomChef;
                        int edadChef;
                        String turno;

                        int numMichelin;
                        double sueldoChef;

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
                        sueldoChef = lea.nextDouble();

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
                        double sueldoChef;

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
                            sueldoChef = lea.nextDouble();
                            ((Chefs) ch.get(p2)).setSueldoChef(sueldoChef);
                        } else {
                            System.out.println("posicion fuera de rango");
                        }

                    } else if (op == 3) {
                        int p2;
                        String selc = "";
                        System.out.println(ch);
                        System.out.println("ingrese la posicion a eliminar");
                        p2 = lea.nextInt();
                        if (p2 >= 0 && p2 < ch.size()) {
                            System.out.println("estas seguro?");
                            if (selc == "si") {
                                ch.remove(p2);
                                System.out.println("chef eliminado con exito");
                            } else if (selc == "no") {
                                System.out.println("volviendo");
                            }

                        } else {
                            System.out.println("posicion fuera de rango");
                        }

                    } else if (op == 4) {
                        System.out.println("lista de los chef:");
                        System.out.println(ch);
                    } else if (op == 5) {
                        System.out.println("volviendo al inicio");
                    } else {
                        System.out.println("error, numero no valido");
                    }

                } else if (opc == 2) {
                    System.out.println(" bienvenido a la opcion -->Mesero"
                            + "\n\n1. crear Mesero"
                            + "\n\n2. modificar Mesero"
                            + "\n\n3. eliminar Mesero"
                            + "\n\n4. listar Mesero"
                            + "\n\n5. volver");
                    int op = 0;

                    if (op == 1) {
                        String nomMese;
                        int edadMese;
                        String turno;

                        double sueldoMese;
                        double propMese;

                        System.out.println("ingrese el nombre del mesero");
                        nomMese = lea.next();

                        System.out.println("ingrese la edad del mesero");
                        edadMese = lea.nextInt();
                        System.out.println("ingrese el turno del mesero");
                        turno = lea.next();

                        System.out.println("ingrese el sueldo del mesero");
                        sueldoMese = lea.nextDouble();
                        System.out.println("ingrese la propina del mesero");
                        propMese = lea.nextDouble();

                        if (contChef < 9) {

                            ch.add(new Meseros(nomMese, edadMese, turno, sueldoMese, propMese));

                            System.out.println("mesero agregado");
                            contChef++;
                        } else if (contChef > 8) {

                            System.out.println("el numero de mesero paso el limite");
                        }

                    } else if (op == 2) {
                        String nomChef;
                        int edadChef;
                        String turno;

                        int numMichelin;
                        double sueldoChef;

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
                            sueldoChef = lea.nextDouble();
                            ((Chefs) ch.get(p2)).setSueldoChef(sueldoChef);
                        } else {
                            System.out.println("posicion fuera de rango");
                        }

                    } else if (op == 3) {
                        int p2;
                        String selc = "";
                        System.out.println(ch);
                        System.out.println("ingrese la posicion a eliminar");
                        p2 = lea.nextInt();
                        if (p2 >= 0 && p2 < ch.size()) {
                            System.out.println("estas seguro?");
                            if (selc == "si") {
                                ch.remove(p2);
                                System.out.println("chef eliminado con exito");
                            } else if (selc == "no") {
                                System.out.println("volviendo");
                            }

                        } else {
                            System.out.println("posicion fuera de rango");
                        }

                    } else if (op == 4) {
                        System.out.println("lista de los chef:");
                        System.out.println(ch);
                    } else if (op == 5) {
                        System.out.println("volviendo al inicio");
                    } else {
                        System.out.println("error, numero no valido");
                    }

                } else if (opc == 3) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n\n1. crear chef"
                            + "\n\n2. modificar chef"
                            + "\n\n3. eliminar"
                            + "\n\n4. listar chef"
                            + "\n\n5. volver");

                } else if (opc == 4) {
                    System.out.println(" bienvenido a la opcion -->Chefs"
                            + "\n\n1. crear chef"
                            + "\n\n2. modificar chef"
                            + "\n\n3. eliminar"
                            + "\n\n4. listar chef"
                            + "\n\n5. volver");

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
                + " ingrese la opcion que desea\n\n"
                + "1. Registro de Chefs\n\n"
                + "2. Registro Meseros\n\n"
                + "3. Registro Bartenders\n\n"
                + "4. Registro Mesas\n\n"
                + "5. salir del programa");

    }

}
