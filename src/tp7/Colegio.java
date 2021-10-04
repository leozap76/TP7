/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author Leonardo
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia m1=new Materia(15,"Ingles",1);
        Materia m2=new Materia(11,"Matematicas",1);
        Materia m3=new Materia(12,"Laboratorio",1);
        
        Alumno a1=new Alumno(1001,"Lopez","Martin");
        Alumno a2=new Alumno(1002,"Martinez","Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        System.out.println("El Alumno "+a1.getApellido()+ " se inscribio a " +a1.cantidadMaterias()+ " materias");
        
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
       
        
        
        System.out.println("El Alumno "+a2.getApellido()+ " se inscribio a " +a1.cantidadMaterias()+ " materias");
        
        
    }
    
}
