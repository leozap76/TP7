/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Alumno  {
    private int legajo;
    private String apellido;
    private String nombre;
    
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno() {
       
    }
   
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return apellido +" "+  nombre ;
    }
    
    public String agregarAlumno(Alumno alumno){
        if(Menu.getAlumnos().add(alumno)==true){
            Menu.getAlumnos().add(this);
            return "El Alumno se inscribio correctamente";
        }else{
            return "El Alumno ya se encuentra inscripto";
        }
        
    }
   
     
    public void agregarMateria(Materia m){   
      
        if ((!Menu.getMateria().equals(m))&&(!Menu.getMat().add(m)==true)){
            Menu.getMat().add(m);
            System.out.println("El alumno "+this.apellido+" "+this.nombre+" se inscribio correctamente.");
            //JOptionPane.showMessageDialog(null, "El alumno se inscribio correctamente.");
        } else
        {
           //JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto.");
           System.out.println("El alumno "+this.apellido+" "+this.nombre+" ya se encuentra inscripto en "+m);
                   
           
        }
    }
    
//    public void agregarMateria(Materia m){   
//      
//        if (Menu.getMat().add(m)==true){
//            
//            System.out.println("El alumno "+this.apellido+" "+this.nombre+" se inscribio correctamente.");
//            //JOptionPane.showMessageDialog(null, "El alumno se inscribio correctamente.");
//        } else
//        {
//           //JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto.");
//           System.out.println("El alumno "+this.apellido+" "+this.nombre+" ya se encuentra inscripto en "+m);
//                   
//           
//        }
//    }
    
        
      
    public int cantidadMaterias(){
        
        return Menu.getMat().size();
        
    }
            
}
