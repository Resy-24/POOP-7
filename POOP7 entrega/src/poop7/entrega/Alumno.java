package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Alumno extends Persona{
    int numCuenta;
    
    public Alumno() {
    }
    /**
     * Constructor que crea al objeto alumno.
     * @param numCuenta Es de tipo int y recibe el numero de cuenta del alumno
     * @param Nombre Es de tipo String y recibe el nombre del alumno 
     * @param Apellido  Es de tipo String y recibe el apellido del alumno 
     * @param Curp Es de tipo String y recibe el Curp del alumno 
     * @param edad Es de tipo int y recibe la edad del alumno
     * @param genero Es de tipo String y recibe el genero del alumno
     * @param fNacimiento Es una fecha proporcionada por la clase fecha
     */
    public Alumno(int numCuenta, String Nombre, String Apellido, String Curp, int edad, String genero, fecha fNacimiento) {
        super(Nombre, Apellido, Curp, edad, genero, fNacimiento);
        this.numCuenta = numCuenta;
    }
    /**
     * Metodo getNumCuenta
     * @return retorna el contenido del atibuto numCuenta, el cual es el numero de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * Metodo setNumCuenta 
     * @param numCuenta Ingresa los valores correspondientes al atributo numVuenta, el cual es el numero de cuenta del alumno
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Metodo toString
     * @return Imprime los valores de cada atributo del alumno
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "numCuenta=" + numCuenta + '}';
    }
}
