package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Metodos {

    public static int cantidadMujeres(ArrayList<Persona> personas){
        int cont=0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo()==0) cont++;
        }
        return cont;
    }

    public static int cantidadHombres(ArrayList<Persona> personas){
        int cont=0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo()==1) cont++;
        }
        return cont;
    }

    public static ArrayList<Persona> cualesMujeres(ArrayList<Persona> personas){
        ArrayList<Persona> mujeres=new ArrayList<>();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo()==0) mujeres.add(personas.get(i));

        }
        return mujeres;

    }

    public static ArrayList<Persona> cualesHombres(ArrayList<Persona> personas){
        ArrayList<Persona> hombres=new ArrayList<>();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo()==1) hombres.add(personas.get(i));

        }
        return hombres;

    }
}
