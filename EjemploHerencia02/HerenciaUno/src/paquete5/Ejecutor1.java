
package paquete5;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        
                
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
    }
}
