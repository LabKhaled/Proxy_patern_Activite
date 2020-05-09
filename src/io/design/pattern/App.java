package io.design.pattern;

/**
 * @author Khaled Chalouati
 */

public class App {
    public static void main(String args[]) {

        Client Cl=new Client();

        Cl.setListEmpl(new proxyEmploye());

        System.out.println("**************************************************** ");
        System.out.println("chargement de ContactList en mémoire sans affichage: ");
        System.out.println("**************************************************** ");

        Cl.listeContact(false);

        System.out.println("**************************************************** ");
        System.out.println("chargement de ContactList en mémoire avec affichage: ");
        System.out.println("**************************************************** ");

        Cl.listeContact(true);
 
    }
    
}


