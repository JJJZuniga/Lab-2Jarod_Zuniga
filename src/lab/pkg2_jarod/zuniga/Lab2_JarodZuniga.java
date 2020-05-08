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
                int s = 0, v = 0;

                while (s != 1) {
                    System.out.println("Ingrse su nombre de usuario");
                    String us = sc.next();
                    System.out.println("Ingrse su contraseña");
                    String cn = sc.next();
                    for (int i = 0; i < user.size(); i++) {
                        String name = ((Personas) user.get(i)).getUsuario();
                        if (us == name) {
                            String conta = ((Personas) user.get(i)).getContraseña();
                            if (cn == conta) {
                                System.out.println("Bienvenido " + us);
                                v = 1;
                                s = 1;

                            } else {
                                System.out.println("Contraseña Incorrecta");
                                s = 0;
                                System.out.println("Desea continuar? s/n");
                                char re = sc.next().charAt(0);
                                if (re != 's' && re != 'S') {
                                    s = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
