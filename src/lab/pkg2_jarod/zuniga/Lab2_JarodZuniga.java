/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_jarod.zuniga;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon Zuniga
 */
public class Lab2_JarodZuniga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList user = new ArrayList();
        ArrayList caslis = new ArrayList();
        ArrayList cascon = new ArrayList();
        ArrayList casesp = new ArrayList();
        ArrayList casdem = new ArrayList();
        int v = 0, c = 0, d = 0;
        int opcion = 0;
        user.add(new Personas("Leonardo", "leobanegas", "99"));
        int reg = 0;
        System.out.println("Bienvenido a nuestro inventario de casas");
        System.out.println("");
        while (reg != 3) {
            System.out.println("1. Registrarse");
            System.out.println("2. Ingresar");
            System.out.println("3. Salir");
            reg = sc.nextInt();
            if (reg == 1) {
                System.out.println("Ingreese su nombre");
                String nam = sc.next();
                System.out.println("Ingreese su usuario");
                String use = sc.next();
                System.out.println("Ingreese su conraseña");
                String con = sc.next();
                System.out.println("Confirme su conraseña");
                String conf = sc.next();
                while (con != conf) {
                    System.out.println("Las contraseñas no ");
                    System.out.println("Ingreese su conraseña");
                    con = sc.next();
                    System.out.println("Confirme su conraseña");
                    conf = sc.next();
                }
                user.add(new Personas(nam, use, con));
                System.out.println("Su usuario fue creado exitosamente");

            } else if (reg == 2) {

                System.out.println("Ingrse su nombre de usuario");
                String us = sc.next();
                System.out.println("Ingrse su contraseña");
                String cn = sc.next();
                for (int i = 0; i < user.size(); i++) {
                    String name = ((Personas) user.get(i)).getUsuario();
                    if (us == null ? name == null : us.equals(name)) {
                        String conta = ((Personas) user.get(i)).getContraseña();
                        if (cn == null ? conta == null : cn.equals(conta)) {
                            System.out.println("Bienvenido " + us);
                            v = 1;
                            reg = 3;

                        } else {
                            System.out.println("Contraseña Incorrecta");
                        }
                    }
                }

            }
        }
        while (opcion != 3) {
            if (v == 1) {
                System.out.println("---------------------*MENU*-----------------");
                System.out.println("1. • Registro de Casas\n"
                        + "2. • Manejo de Estados\n"
                        + "3. • Salir");
                System.out.println("--------------------------------------------");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("1. • Crear Casas\n"
                                + "2. • Listar Casas\n"
                                + "3. • Modificar Casas\n"
                                + "4. • Borrar Casas");
                        int opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                int num_casa,
                                 num_bloque,
                                 largo,
                                 ancho,
                                 num_pisos,
                                 num_baños,
                                 num_cuartos;
                                String color,
                                 dueño = "",
                                 estado = "",
                                 ingcargo;
                                boolean comprada;
                                System.out.println("Ingrese el numero de la casa");
                                num_casa = sc.nextInt();
                                System.out.println("Ingrese el numero del bloque");
                                num_bloque = sc.nextInt();
                                System.out.println("Ingrese el color de la casa");
                                color = sc.next();
                                System.out.println("Ingrese el largo de la casa");
                                largo = sc.nextInt();
                                System.out.println("ingrese e ancho de la casa");
                                ancho = sc.nextInt();
                                System.out.println("la casa esta comprada? s/n");
                                char co = sc.next().charAt(0);
                                if (co == 's' || co == 'S') {
                                    comprada = true;
                                    System.out.println("Ingrese el nombre del dueño");
                                    dueño = sc.next();
                                } else {
                                    comprada = false;
                                }
                                System.out.println("Ingree la cantidada de pisos");
                                num_pisos = sc.nextInt();
                                System.out.println("Ingrese la cantidad de baños");
                                num_baños = sc.nextInt();

                                System.out.println("Ingrese la cantidad de cuartos");
                                num_cuartos = sc.nextInt();
                                int sel = 0;
                                while (sel > 4 || sel < 1) {
                                    System.out.println("1. LISTAS.\n" + "2. CONSTRUCCION\n"
                                            + "3. CONSTRUCCION EN ESPERA.\n"
                                            + "4. ESPERA DE DEMOLICION.");
                                    sel = sc.nextInt();
                                    if (sel == 1) {
                                        estado = "Lista";
                                    } else if (sel == 2) {
                                        if (c > 5) {
                                            System.out.println("No se puede agregar mas casa en contruccion");
                                            sel = 9;
                                        } else {
                                            estado = "En contruccion";
                                            c++;
                                        }
                                    } else if (sel == 3) {
                                        estado = "construccion en espera";
                                    } else if (sel == 4) {
                                        if (d > 3) {
                                            System.out.println("No se pueden agregar mas casas a espera de demolicion");
                                        } else {
                                            estado = "Espera de demolicion";
                                            d++;
                                        }
                                    }
                                }
                                System.out.println("Ingrese el nombre del ingeniero a cargo");
                                ingcargo = sc.next();

                                if ("Lista".equals(estado)) {
                                    caslis.add(new casas(num_casa, num_bloque, color, largo, ancho, comprada, num_pisos, num_baños, num_cuartos, dueño, estado, ingcargo));
                                } else if ("En contruccion".equals(estado)) {
                                    cascon.add(new casas(num_casa, num_bloque, color, largo, ancho, comprada, num_pisos, num_baños, num_cuartos, dueño, estado, ingcargo));
                                } else if ("construccion en espera".equals(estado)) {
                                    casesp.add(new casas(num_casa, num_bloque, color, largo, ancho, comprada, num_pisos, num_baños, num_cuartos, dueño, estado, ingcargo));
                                } else if ("Espera de demolicion".equals(estado)) {
                                    casdem.add(new casas(num_casa, num_bloque, color, largo, ancho, comprada, num_pisos, num_baños, num_cuartos, dueño, estado, ingcargo));
                                }

                                break;
                            case 2:
                                System.out.println("Casas listas");
                                for (Object o : caslis) {
                                    System.out.println(o);
                                }
                                System.out.println("casas en construccion");
                                for (Object o : cascon) {
                                    System.out.println(o);
                                }
                                System.out.println("casas con construccion en espera");
                                for (Object o : casesp) {
                                    System.out.println(o);
                                }
                                System.out.println("casas en espera de demolicion");
                                for (Object o : casdem) {
                                    System.out.println(o);
                                }
                                break;
                            case 3:
                                System.out.println("Modificar casa ");
                                
                                
                                
                                
                                break;
                            case 4:
                                System.out.println("Casas listas");
                                for (Object o : caslis) {
                                    System.out.println(o);
                                }
                                System.out.println("casas en construccion");
                                for (Object o : cascon) {
                                    System.out.println(o);
                                }
                                System.out.println("casas con construccion en espera");
                                for (Object o : casesp) {
                                    System.out.println(o);
                                }
                                System.out.println("casas en espera de demolicion");
                                for (Object o : casdem) {
                                    System.out.println(o);
                                }
                                System.out.println("Ingrese que tipo de casa desea eliminar (1-4)");
                                int el = sc.nextInt();
                                int po;
                                switch (el) {
                                    case 1:
                                        System.out.println("Casas listas");
                                        for (Object o : caslis) {
                                            System.out.println(o);
                                        }
                                        System.out.println("Seleccione la poscicion que desea eliminar");
                                        po = sc.nextInt();
                                        caslis.remove(po);
                                        break;
                                    case 2:
                                        System.out.println("casas en construccion");
                                        for (Object o : cascon) {
                                            System.out.println(o);
                                        }
                                        System.out.println("Seleccione la poscicion que desea eliminar");
                                        po = sc.nextInt();
                                        cascon.remove(po);
                                        break;
                                    case 3:
                                        System.out.println("casas con construccion en espera");
                                        for (Object o : casesp) {
                                            System.out.println(o);
                                        }
                                        System.out.println("Seleccione la poscicion que desea eliminar");
                                        po = sc.nextInt();
                                        casesp.remove(po);
                                        break;
                                    case 4:
                                        System.out.println("casas en espera de demolicion");
                                        for (Object o : casdem) {
                                            System.out.println(o);
                                        }
                                        System.out.println("Seleccione la poscicion que desea eliminar");
                                        po = sc.nextInt();
                                        casdem.remove(po);
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Opcion ingresada invalida");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Manejo de estados ");
                        System.out.println("");
                        System.out.println("Casas listas");
                        for (Object o : caslis) {
                            System.out.println(o);
                        }
                        System.out.println("casas en construccion");
                        for (Object o : cascon) {
                            System.out.println(o);
                        }
                        System.out.println("casas con construccion en espera");
                        for (Object o : casesp) {
                            System.out.println(o);
                        }
                        System.out.println("casas en espera de demolicion");
                        for (Object o : casdem) {
                            System.out.println(o);
                        }
                        System.out.println("ingrese la seccion a la cual desea cambiar de estado (1-4)\n"+"1. cambiar estado de casa listas \n"+ "2.Cambiar casas en construccion \n"+ "3. Cambiar casa de contruccion en espera");
                        int cbe = sc.nextInt();
                        int pce = 0;
                        switch (cbe) {
                            case 1:
                                System.out.println("Casas listas");
                                for (Object o : caslis) {
                                    System.out.println(o);
                                }
                                System.out.println("Ingrese la posicion a cambiar de estado");
                                pce = sc.nextInt();
                                casdem.add(caslis.get(pce));
                                caslis.remove(pce);
                                System.out.println("Cambio de estado exitoso");
                                System.out.println("Casas listas");
                                for (Object o : caslis) {
                                    System.out.println(o);
                                }
                                break;
                            case 2:
                                System.out.println("casas en construccion");
                                for (Object o : cascon) {
                                    System.out.println(o);
                                }
                                System.out.println("Ingrese la posicion a cambiar de estado");
                                pce = sc.nextInt();
                                System.out.println("1. cambiar a lista\n" + "2.cambiar a espera");
                                int cab = sc.nextInt();
                                if (cab == 1) {
                                    caslis.add(cascon.get(pce));
                                    cascon.remove(pce);
                                } else if (cab == 2) {
                                    casesp.add(cascon.get(pce));
                                    cascon.remove(pce);
                                } else {
                                    System.out.println("Valir ingresado incorrecto ");
                                }
                                
                                break;
                            case 3:
                                System.out.println("casas con construccion en espera");
                                for (Object o : casesp) {
                                    System.out.println(o);
                                }
                                System.out.println("Ingrese la posicion a cambiar de estado");
                                pce = sc.nextInt();
                                cascon.add(casesp.get(pce));
                                casesp.remove(pce);
                                break;
                            case 4:
                                System.out.println("Demoler casa");
                                System.out.println("casas en espera de demolicion");
                                for (Object o : casdem) {
                                    System.out.println(o);
                                }
                                System.out.println("Ingrese la poscicion de las casas que desea demoler");
                                pce=sc.nextInt();
                                System.out.println("demoliendo casa....");
                                casdem.remove(pce);
                                break;
                            default:
                                System.out.println("La opcion no es parte de los estados");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa");
                        break;
                }
            }
        }
    }

}
