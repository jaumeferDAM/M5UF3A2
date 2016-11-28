/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5uf3a2;

import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class Main {

    static Scanner lector = new Scanner(System.in);
    static Visitant visi = new Visitant();

    static Animales A = new Animales(visi);

    public static void main(String[] args) {

        A.respostaOpcioMenu();

    }

    public static String mostrarMenu() {

        System.out.println("Seleccionar operació:"
                + "\n1.Afegeix"
                + " \n2.Suprimeix"
                + "\n3.SuprimirTots"
                + "\n4.mira"
                + "\n5.Surt");
        return lector.nextLine();
    }

    void MissatjeError(String incorectoo) {
        System.err.println("Aquesta comanda no existeix");
    }

}
