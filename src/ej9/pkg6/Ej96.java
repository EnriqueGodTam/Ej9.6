package ej9.pkg6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ej96 {

    public static void main(String[] args) {
        Alumno alu = new Alumno("Pedro");
        ArrayList <Double> notas = new ArrayList<>();

        System.out.println("Introduzca las notas del alumno");
        try {
            alu.pedirNotas();
        } catch (RangoException ex) {
            System.out.println("Error, la nota esta fuera de rango" + ex.toString());
        }

        int posicion;
        double nota;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoi = new Scanner(System.in);
        System.out.println("Introduzca la posicion de la nota que desea modificar asi como la nota");
        System.out.println("Posicion");
        posicion = tecladoi.nextInt();
        System.out.println("Nota que desea introducir");
        nota = teclado.nextDouble();

        try {
            alu.modificarNota(posicion, nota);
        } catch (RangoException ex) {
            System.out.println("Error valor fuera del rango valido" + ex.toString());
        }
        alu.imprimirCalificaciones();
    }

}
