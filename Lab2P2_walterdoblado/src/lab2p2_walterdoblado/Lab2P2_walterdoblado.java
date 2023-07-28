package lab2p2_walterdoblado;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_walterdoblado {

    public static void main(String[] args) {
        ArrayList ch = new ArrayList();
        ArrayList ch1 = new ArrayList();
        ArrayList ch2 = new ArrayList();
        ArrayList ch3 = new ArrayList();
        Scanner lea = new Scanner(System.in);
        int opc = 0;
        int acum = 0;
        String usuario;
        String contra;
        int mat = 0;
        int ves = 0;

        String verUsuario = "gerente";
        String verContra = "g3r$nt0";
        int contChef = 0;
        int contMese = 0;

        System.out.println("ingrese el nombre de usuario");
        usuario = lea.next();
        System.out.println("ingrese la contraseña");
        contra = lea.next();

        if (contra.equals(verContra) && usuario.equals(verUsuario)) {

            while (opc != 5) {
                menu();
                System.out.print("ingrese la opcion: ");
                opc = lea.nextInt();

                if (opc == 1) {//////chef
                    int op = 0;
                    while (op != 5) {
                        System.out.println(" bienvenido a la opcion -->Chefs"
                                + "\n\n1. crear chef"
                                + "\n\n2. modificar chef"
                                + "\n\n3. eliminar"
                                + "\n\n4. listar chef"
                                + "\n\n5. volver");

                        op = lea.nextInt();
                        if (op == 1) {
                            String nomChef;
                            int edadChef;
                            String turno = "";

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
                                System.out.println("ingrese el turno del chef");
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
                    }
                } else if (opc == 2) {////meseros
                    int op = 0;
                    while (op != 5) {
                        System.out.println(" bienvenido a la opcion -->Mesero"
                                + "\n\n1. crear Mesero"
                                + "\n\n2. modificar Mesero"
                                + "\n\n3. eliminar Mesero"
                                + "\n\n4. listar Mesero"
                                + "\n\n5. volver");

                        op = lea.nextInt();
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

                            if (contMese < 9) {

                                ch1.add(new Meseros(nomMese, edadMese, turno, sueldoMese, propMese));

                                System.out.println("mesero agregado");
                                contChef++;
                            } else if (contMese > 8) {

                                System.out.println("el numero de mesero paso el limite");
                            }

                        } else if (op == 2) {
                            String nomMese;
                            int edadMese;
                            String turno;

                            double sueldoMese;
                            double propMese;

                            int p2;
                            System.out.println(ch1);
                            System.out.println("ingrese la posicion");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch1.size()) {
                                System.out.println("ingrese el nombre del mesero");
                                nomMese = lea.next();
                                ((Meseros) ch1.get(p2)).setNomMese(nomMese);
                                System.out.println("ingrese la edad del mesero");
                                edadMese = lea.nextInt();
                                ((Meseros) ch1.get(p2)).setEdadMes(edadMese);
                                System.out.println("ingrese el turno del mesero");
                                turno = lea.next();
                                ((Meseros) ch1.get(p2)).setTurno(turno);

                                System.out.println("ingrese el sueldo del mesero");
                                sueldoMese = lea.nextDouble();
                                ((Meseros) ch1.get(p2)).setSueldomese(sueldoMese);
                                System.out.println("ingrese la propina del mesero");
                                propMese = lea.nextDouble();
                                ((Meseros) ch1.get(p2)).setPropmese(propMese);

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 3) {
                            int p2;
                            String selc = "";
                            System.out.println(ch1);
                            System.out.println("ingrese la posicion a eliminar");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch1.size()) {
                                System.out.println("estas seguro?");
                                if (selc == "si") {
                                    ch.remove(p2);
                                    System.out.println("Mesero eliminado con exito");
                                } else if (selc == "no") {
                                    System.out.println("volviendo");
                                }

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 4) {
                            System.out.println("lista de los meseros:");
                            System.out.println(ch1);
                        } else if (op == 5) {
                            System.out.println("volviendo al inicio");
                        } else {
                            System.out.println("error, numero no valido");
                        }
                    }
                } else if (opc == 3) { ////barttenders
                    int op = 0;
                    while (op != 5) {
                        System.out.println(" bienvenido a la opcion -->Bartender"
                                + "\n\n1. crear Bartender"
                                + "\n\n2. modificar Bartender"
                                + "\n\n3. eliminar  Bartender"
                                + "\n\n4. listar Bartender"
                                + "\n\n5. volver");

                        op = lea.nextInt();
                        if (op == 1) {
                            String nomBart;
                            int edadBart;
                            String turno;

                            double sueldoBart;
                            int numLic;

                            System.out.println("ingrese el nombre del Bartender");
                            nomBart = lea.next();

                            System.out.println("ingrese la edad del Bartender");
                            edadBart = lea.nextInt();
                            System.out.println("ingrese el turno del Bartender");
                            turno = lea.next();

                            System.out.println("ingrese el sueldo del Bartender");
                            sueldoBart = lea.nextDouble();
                            System.out.println("ingrese numero de licores disponible");
                            numLic = lea.nextInt();

                            if (contMese < 5) {

                                ch2.add(new Bartenders(nomBart, edadBart, turno, sueldoBart, numLic));

                                System.out.println("Bartender agregado");
                                contChef++;
                            } else if (contMese > 4) {

                                System.out.println("el numero de Bartender paso el limite");
                            }

                        } else if (op == 2) {
                            String nomBart;
                            int edadBart;
                            String turno;

                            double sueldoBart;
                            int numLic;

                            int p2;
                            System.out.println(ch2);
                            System.out.println("ingrese la posicion");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch2.size()) {
                                System.out.println("ingrese el nombre del Bartender");
                                nomBart = lea.next();
                                ((Meseros) ch2.get(p2)).setNomMese(nomBart);
                                System.out.println("ingrese la edad del Bartender");
                                edadBart = lea.nextInt();
                                ((Meseros) ch2.get(p2)).setEdadMes(edadBart);
                                System.out.println("ingrese el turno del Bartender");
                                turno = lea.next();
                                ((Meseros) ch2.get(p2)).setTurno(turno);

                                System.out.println("ingrese el sueldo del Bartender");
                                sueldoBart = lea.nextDouble();
                                ((Meseros) ch2.get(p2)).setSueldomese(sueldoBart);
                                System.out.println("ingrese el numero de licores disponible");
                                numLic = lea.nextInt();
                                ((Meseros) ch2.get(p2)).setPropmese(numLic);

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 3) {
                            int p2;
                            String selc = "";
                            System.out.println(ch2);
                            System.out.println("ingrese la posicion a eliminar");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch2.size()) {
                                System.out.println("estas seguro?");
                                if (selc == "si") {
                                    ch.remove(p2);
                                    System.out.println("Bartender eliminado con exito");
                                } else if (selc == "no") {
                                    System.out.println("volviendo");
                                }

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 4) {
                            System.out.println("lista de los Bartenders:");
                            System.out.println(ch2);
                        } else if (op == 5) {
                            System.out.println("volviendo al inicio");
                        } else {
                            System.out.println("error, numero no valido");
                        }
                    }
                } else if (opc == 4) { /// mesas
                    int op = 0;
                    int numPlat1;
                    int numUtil1;
                    int precio1 = 0;
                    while (op != 5) {
                        System.out.println(" bienvenido a la opcion -->Mesas"
                                + "\n\n1. crear mesa"
                                + "\n\n2. modificar mesa"
                                + "\n\n3. eliminar mesa"
                                + "\n\n4. listar mesa"
                                + "\n\n5. volver");

                        op = lea.nextInt();
                        if (op == 1) {

                            System.out.println("ingrese el numero de platos de la mesa");
                            numPlat1 = lea.nextInt();

                            System.out.println("ingrese el numero de utensilios de la mesa");
                            numUtil1 = lea.nextInt();
                            System.out.println("ingrese el precio de la mesa");
                            precio1 = lea.nextInt();
                            acum += precio1;

                            if (contMese < 11) {

                                ch3.add(new Mesas(numPlat1, numUtil1, precio1));

                                System.out.println("Bartender agregado");
                                contChef++;
                            } else if (contMese > 10) {

                                System.out.println("el numero de Bartender paso el limite");
                            }

                        } else if (op == 2) {
                            int numPlat;
                            int numUtil;
                            int precio;

                            int p2;
                            System.out.println(ch3);
                            System.out.println("ingrese la posicion");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch3.size()) {
                                System.out.println("ingrese el numero de platos de la mesa");
                                numPlat = lea.nextInt();

                                ((Mesas) ch3.get(p2)).setNumPlat(numPlat);
                                System.out.println("ingrese el numero de utensilios de la mesa");
                                numUtil = lea.nextInt();
                                ((Mesas) ch3.get(p2)).setNumUtil(numUtil);
                                acum = acum - precio1;
                                System.out.println("ingrese el precio de la mesa");
                                precio = lea.nextInt();
                                acum += precio;
                                ((Mesas) ch3.get(p2)).setPrecio(precio);

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 3) {
                            int p2;
                            String selc = "";
                            System.out.println(ch3);
                            System.out.println("ingrese la posicion a eliminar");
                            p2 = lea.nextInt();
                            if (p2 >= 0 && p2 < ch3.size()) {
                                System.out.println("estas seguro?");
                                if (selc == "si") {
                                    ch.remove(p2);
                                    System.out.println("Bartender eliminado con exito");
                                } else if (selc == "no") {
                                    System.out.println("volviendo");
                                }

                            } else {
                                System.out.println("posicion fuera de rango");
                            }

                        } else if (op == 4) {
                            System.out.println("lista de las mesas");
                            System.out.println(ch3);
                            System.out.println("total:" + acum);
                        } else if (op == 5) {
                            System.out.println("volviendo al inicio");
                        } else {
                            System.out.println("error, numero no valido");
                        }
                    }
                } else if (opc == 5) {
                    System.out.println("salio del codigo ");
                } else {

                }

            }
        } else {

            System.out.println("el nombre del usuario o contraseña es incorrecta");
        }

    }

    static void menu() {

        System.out.println("Bienvenido a registro del restaurante\n\n"
                + "1. Registro de Chefs\n\n"
                + "2. Registro Meseros\n\n"
                + "3. Registro Bartenders\n\n"
                + "4. Registro Mesas\n\n"
                + "5. salir del programa");

    }

}
