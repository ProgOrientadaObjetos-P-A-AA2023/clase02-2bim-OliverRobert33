/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        
        String nombre = "Oliver";
        String apellido = "Saraguro";
        String identificacion = "123456";
        int edad = 18;
        
        EstudiantePresencial estudiantePre = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estudiantePre.establecerNumeroCreditos(15);
        estudiantePre.establecerCostoCredito(200);
        estudiantePre.calcularMatriculaPresencial();
        
        System.out.println(estudiantePre);
    }
}
