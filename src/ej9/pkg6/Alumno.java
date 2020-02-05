package ej9.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriq
 */
public class Alumno {

    private static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno() {
        num_asignaturas = 5;
        nombre = "";
        notas = new ArrayList<>();
    }

    public Alumno(String nombre) {
        num_asignaturas = 5;
        this.nombre = nombre;
        notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pedirNotas () throws RangoException {
        double nota;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca las notas del alumno: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i+1));
            nota = teclado.nextDouble();
            
            if (nota < 0 || nota > 10){
                throw new RangoException ("El rango de la nota no esta permitido");
            }else{
                notas.add(nota);
            }
        }
    }
}
