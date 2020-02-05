/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9.pkg6;

/**
 * Excepcion que controla que el rango de las notas introducidas es correcto
 * @author enriq
 */
class RangoException extends Exception {
/**
 * Constructor de la excepcion
 * @param mensaje mensaje que se mostrara cuando se lance la excepcion
 */
    public RangoException(String mensaje) {
        super(mensaje);
    }
}
