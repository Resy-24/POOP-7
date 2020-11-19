package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class POOP7Entrega {
    public static void main(String[] args) {
        //Creando al alumno
        Alumno alumno = new Alumno(317071809, "Pepe", "Morales", "eurdv947261kmd", 20, "Trans", new fecha(20, 11, 1999));
        System.out.println("Datos del alumno:\n"+alumno);
        //Creando al profesor
        Profesor profesor = new Profesor(123, "POO", 6, 543, 10000, 8, "Antonio", "Ayala", "kdgyf01123jnk", 28, "Masculino", new fecha(5, 8, 1995));
        System.out.println("Datos del profesor:\n"+profesor);
        
        //Creando al director
        Director director = new Director(789, "Facultad de Ingenieria", 5, 999, 30000, 12, "Franklin", "Schneider", "oiffb23579fsjh", 60, "Helicoptero apache", new fecha(3, 6, 1950));
        System.out.println("Datos del director:\n"+director);
    }
    
}
