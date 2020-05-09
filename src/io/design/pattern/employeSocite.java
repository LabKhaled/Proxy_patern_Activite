package io.design.pattern;
import java.util.*;
public class employeSocite implements interfaceEmploye {

     
      
    public void lister(boolean listé) {

      //ici on fait l'accée a la base de donnée pour récupérer la liste de Contatct 
      // ensuite on fait l'affichage ici
      //le client va recevoir le résultat par l'appel de le methode Emp.lister(listé) du classe proxyEmploye.java
      //on suppose que la liste récupérer sous forme liste , au dessous le traitement 

      List <String> liste = new ArrayList<String>();  
      liste.add("Khaled chalouati");
      liste.add("sami chouiref");
      liste.add("naim bougamraa");
      liste.add("hanen bjaoui");
              System.out.println("contact= "+liste);
    
}
}