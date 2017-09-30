package com.example.android.personas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void cantidad_mujeres(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Laura", "Contreras", 0);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));

        assertEquals(4, Metodos.cantidadMujeres(pers));

    }

    @Test
    public void cantidad_mujeres_incorrecto(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Laura", "Contreras", 0);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));

        assertNotEquals(2, Metodos.cantidadMujeres(pers));

    }

    @Test
    public void cuales_mujeres(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};
        Persona mujeres[]={p1,p2,p3};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));
        ArrayList<Persona> muj = new ArrayList<>(Arrays.asList(mujeres));


        assertEquals(muj, Metodos.cualesMujeres(pers));

    }

    @Test
    public void cuales_mujeres_incorrecto(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};
        Persona mujeres[]={p1,p2};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));
        ArrayList<Persona> muj = new ArrayList<>(Arrays.asList(mujeres));


        assertNotEquals(muj, Metodos.cualesMujeres(pers));

    }




    @Test
    public void cantidad_hombres(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));

        assertEquals(4, Metodos.cantidadHombres(pers));

    }

    @Test
    public void cantidad_hombres_incorrecta(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));

        assertNotEquals(3, Metodos.cantidadHombres(pers));

    }

    @Test
    public void cuales_hombres(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};
        Persona hombres[]={p4,p5,p6,p7};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));
        ArrayList<Persona> homb = new ArrayList<>(Arrays.asList(hombres));


        assertEquals(homb, Metodos.cualesHombres(pers));

    }

    @Test
    public void cuales_hombres_incorrecto(){
        Persona p1= new Persona("1234","Elen", "Contreras", 0);
        Persona p2= new Persona("12345","Emily", "Contreras", 0);
        Persona p3= new Persona("12346","Rosibel", "Contreras", 0);
        Persona p7= new Persona("12346","Ruben", "Contreras", 1);
        Persona p4= new Persona("12347","Eduardo", "Contreras", 1);
        Persona p5= new Persona("123478","Santiago", "Contreras", 1);
        Persona p6= new Persona("123479","Hector", "Contreras", 1);

        Persona persona[]={p1,p2,p3,p4,p5,p6,p7};
        Persona hombres[]={p4,p5};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(persona));
        ArrayList<Persona> homb = new ArrayList<>(Arrays.asList(hombres));


        assertNotEquals(homb, Metodos.cualesHombres(pers));

    }




}