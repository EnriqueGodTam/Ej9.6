package ej9.pkg6;

import java.util.ArrayList;

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
   private ArrayList <Double> notas;
   
   public Alumno (){
       num_asignaturas = 5;
       nombre = "";
       notas = new ArrayList <> ();
   }
   
   public Alumno (String nombre){
       num_asignaturas = 5;
       this.nombre = nombre;
       notas = new ArrayList <> ();
   }
   
   
}
