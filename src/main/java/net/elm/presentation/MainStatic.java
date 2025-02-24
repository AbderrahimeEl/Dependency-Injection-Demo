package net.elm.presentation;

import net.elm.Dao.DaoImpl;
import net.elm.metier.MetierImpl;

public class MainStatic {
    public static void main(String[] args){
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // injection with constructor
        System.out.println("res = "+metier.calcule());
    }
}
