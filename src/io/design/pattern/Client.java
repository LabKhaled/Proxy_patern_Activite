package io.design.pattern;

public class Client {

    private proxyEmploye ListEmploye;

    public void listeContact (boolean listé){

        ListEmploye.lister(listé);
    }

    public void setListEmpl(proxyEmploye p )
       {
            this.ListEmploye=p;
       }
    
}