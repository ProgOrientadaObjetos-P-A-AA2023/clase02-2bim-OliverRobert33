
package paquete3;

public class Ejecutor {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre, 
                apellido, identificacion, edad);
        
        System.out.println(estDistancia);
        
        
        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(
                "OLiver", "Saraguro", "1010101", 18);
        System.out.println(estudiantePresencial);
        
    }
}
