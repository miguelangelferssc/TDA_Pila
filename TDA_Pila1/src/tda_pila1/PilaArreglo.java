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

public class PilaArreglo <E> implements Pila<E>{
    E [] p;
    int cantidad ;

   
    
    public PilaArreglo(){
        Object[] p1 = new Object[10];
        p = (E[]) p1;
        cantidad = -1;
    }

    
    
    @Override
    public boolean isEmpty() {
        
           return (cantidad == -1);
    }

    @Override
    public void push(E elemet) {
        if (cantidad + 1 == p.length) {
            Object[] tmp = new Object[p.length + 10];
            System.arraycopy(p, 0, tmp, 0, p.length);
            p = (E[]) tmp;
        }
        p[++cantidad] = elemet;
}

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E top() {
      return p[cantidad];  
    }
    
    
    
}
