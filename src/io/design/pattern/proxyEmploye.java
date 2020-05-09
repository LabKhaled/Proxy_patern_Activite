package io.design.pattern;

public class proxyEmploye implements interfaceEmploye {

    private employeSocite Emp;  

    public void lister(boolean listé){

        System.out.println("\nchargement ....");

        Emp=new employeSocite();
        System.out.println("Fin de chargement! \n");

        if(!listé){
            System.out.println("Fin d'exécution ! \n");
        }
        else{
            System.out.println("\nla liste de contact est le suivant:");
            Emp.lister(listé);
        }
        

    }
    
}