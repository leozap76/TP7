/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.Objects;

/**
 *
 * @author Leonardo
 */
public class Materia implements Comparable<Materia>{
    
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Materia() {
        
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre +" "+ anio + "año";
    }
    
  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idMateria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }
    
    

   
    

    @Override
    public int compareTo(Materia t) {
        int resultado;
            if (this.idMateria<t.idMateria) {   resultado = -1;      }
            else if (this.idMateria>t.idMateria) {    resultado = 1;      }
            else {   resultado = 0;   }
        
        return resultado;
    }

}
    
    
    
    

