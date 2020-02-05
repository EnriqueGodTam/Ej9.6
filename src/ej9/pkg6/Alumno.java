package ej9.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa al alumno
 *
 * @author enriq
 */
public class Alumno {

    private static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    /**
     * Constructor por defecto de Alumno
     */
    public Alumno() {
        num_asignaturas = 5;
        nombre = "";
        notas = new ArrayList<>();
    }

    /**
     * Constructor con parametros de alumno
     *
     * @param nombre parametro que se le pasa al constructor
     */
    public Alumno(String nombre) {
        num_asignaturas = 5;
        this.nombre = nombre;
        notas = new ArrayList<>();
    }

    /**
     * Metodo que devuelve el nombre del alumno
     *
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para hacer un set al nombre del alumno
     *
     * @param nombre parametro que quedara como nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que pide al usuario las notas del alumno y las introduce en el
     * Array que contiene estas
     *
     * @throws RangoException Excepcion que controla que el rango de las notas
     * introducidas sea correcto
     */
    public void pedirNotas() throws RangoException {
        double nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las notas del alumno: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1));
            nota = teclado.nextDouble();

            if (nota < 0 || nota > 10) {
                throw new RangoException("El rango de la nota no esta permitido");
            } else {
                notas.add(nota);
            }
        }
    }
    /**
     * Metodo que cambia la nota de algun alumno
     * @param posicion posicion del Array de notas que indica que nota se quiere cambiar
     * @param nota nota que se introducira como parametro y sustituira a la que estuviese anteriormente
     * @throws RangoException Excepcion que controla que el rango de notas o posicion son correctos
     */
    public void modificarNota(int posicion, double nota) throws RangoException {

        if (posicion < 0 || posicion > 5) {
            throw new RangoException("La posicion no existe");
        } else {
            if (nota < 0 || nota > 10) {
                throw new RangoException("La nota esta fuera del rango permitido");
            } else {
                notas.set(posicion, nota);
            }
        }
    }
    /**
     * Metodo que imprime en pantalla las calificaciones del alumno
     */
    
    public void imprimirCalificaciones (){
        System.out.println("Alumno: " + this.nombre);
        System.out.println("Notas: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.indexOf(i));
        }
    }
}
