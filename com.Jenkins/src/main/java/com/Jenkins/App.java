package com.Jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // permet de g�rer les op�rations sur les employ�s: cr�er, modifier, supprimer,...
        GestionEmploye ge = new GestionEmploye();
        ge.menu();
    }
}
