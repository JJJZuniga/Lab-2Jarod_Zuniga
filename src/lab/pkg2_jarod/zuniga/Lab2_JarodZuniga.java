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
        int v = 0;
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
                                 dueño,
                                 estado,
                                 ingcargo;
                                boolean comprada;
                                System.out.println("Ingrese el numero de la casa");
                                num_casa=sc.nextInt();
                                System.out.println("Ingrese el numero del bloque");
                                num_bloque=sc.nextInt();
                                System.out.println("Ingrese el color de la casa");
                                color=sc.next();
                                System.out.println("Ingrese el largo de la casa");
                                largo=sc.nextInt();
                                System.out.println("ingrese e ancho de la casa");
                                ancho=sc.nextInt();
                                System.out.println("la casa esta comprada? s/n");
                                char co=sc.next().charAt(0);
                                if (co=='s'||co=='S') {
                                    comprada=true;
                                }
                                
                                System.out.println("Ingrese el nombre del dueño");
                                System.out.println("Ingree la cantidada de pisos");
                                System.out.println("Ingrese la cantidad de baños");
                                System.out.println("Ingrese la cantidad de cuartos");

                                System.out.println("LISTAS.\n" + "CONSTRUCCION\n"
                                        + "CONSTRUCCION EN ESPERA.\n"
                                        + "ESPERA DE DEMOLICION.");
                                System.out.println("Ingrese el nombre del ingeniero a cargo");

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcion ingresada invalida");
                                break;
                        }
                        break;
                    case 2:

                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa");
                        break;
                }
            }
        }
    }

}
