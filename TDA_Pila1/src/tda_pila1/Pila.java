/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_pila1;

/**
 *
 * @author Invitado
 */
public interface Pila <E>{
    boolean isEmpty();
    void push(E elemet);
    E pop ();
    E top ();
    
}
