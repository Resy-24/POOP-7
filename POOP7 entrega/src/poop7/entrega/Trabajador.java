package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Trabajador extends Persona{
    int numTrabajador;
    int sueldo;
    int horas;

    public Trabajador() {
    }
    /**
     * Constructor que crea el objeto persona
     * @param numTrabajador Es de tipo int y contiene el numero de trabajador
     * @param sueldo Es de tipo int y contiene el sueldo que gana semanalmente
     * @param horas Es de tipo int y contiene as horas totales de trabajo por dia
     * @param Nombre Es de tipo String y contiene el nombed el trabajador
     * @param Apellido Es de tipo String y contiene el apellido del trabajador
     * @param Curp Es de tipo String y contiene el curp del trabajador
     * @param edad Es de tipo int y contiene la edad del trabajador
     * @param genero Es de tipo String y contiene el genero del trabajador
     * @param fNacimiento Es una fecha proporcionada por la clase fecha 
     */
    public Trabajador(int numTrabajador, int sueldo, int horas, String Nombre, String Apellido, String Curp, int edad, String genero, fecha fNacimiento) {
        super(Nombre, Apellido, Curp, edad, genero, fNacimiento);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
        this.horas = horas;
    }
    /**
     * Metodo getNumTrabajador
     * @return retorna el valor del atributo numTrabajador, el cual es el numero de trabajor que tiene
     */
    public int getNumTrabajador() {
        return numTrabajador;
    }
    /**
     * Metodo setNumTrabajador
     * @param numTrabajador asigna el valor al atributo numTrabajador
     */
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
    /**
     * Metodo getSueldo
     * @return retorna el valor del atributo seldo, el cual es la ganacia semanal
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Metodo setSueldo
     * @param sueldo asigan el valor al atributo sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * Metodo getHoras
     * @return retorna el valor del atributo horas, el cual es el numerod de horas que trabaja al dia 
     */
    public int getHoras() {
        return horas;
    }
    /**
     * Metodo setHoras
     * @param horas asigna el valor a parametro horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * Metodo toString
     * @return Imprime en pantalla el valor de los atributos del trabajador
     */
    @Override
    public String toString() {
        return super.toString()+"Trabajador{" + "numTrabajador=" + numTrabajador + ", sueldo=" + sueldo + ", horas=" + horas + '}';
    }
}
