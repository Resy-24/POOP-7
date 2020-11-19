package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Director extends Trabajador{
    int numProfesor;
    String escuela;
    int solicitudes;    

    public Director() {
    }
    /**
     * Constructor que crea el objeto director
     * @param numProfesor Es de tipo int y contiene el numero de profesor
     * @param escuela Es de tipo String y contiene el nobre de la escuela en la que es director
     * @param solicitudes Es de tipo int y tiene el numero de solicitudes de trabajo que tiene que revisar
     * @param numTrabajador Es de tipo int y contiene el numero de trabajador del plantel
     * @param sueldo Es de tipo int y contiene el sueldo que gana semanalmente
     * @param horas Es de tipo int y contiene as horas totales de trabajo por dia
     * @param Nombre Es de tipo String y contiene el nombed el director
     * @param Apellido Es de tipo String y contiene el apellido del director
     * @param Curp Es de tipo String y contiene el curp del director
     * @param edad Es de tipo int y contiene la edad del director
     * @param genero Es de tipo String y contiene el genero del director
     * @param fNacimiento Es una fecha proporcionada por la clase fecha
     */
    public Director(int numProfesor, String escuela, int solicitudes, int numTrabajador, int sueldo, int horas, String Nombre, String Apellido, String Curp, int edad, String genero, fecha fNacimiento) {
        super(numTrabajador, sueldo, horas, Nombre, Apellido, Curp, edad, genero, fNacimiento);
        this.numProfesor = numProfesor;
        this.escuela = escuela;
        this.solicitudes = solicitudes;
    }
    /**
     * Metodo getNumProfesor
     * @return retorna el contenido del atributo numProfesor, el cual es el numero de profesor en el plantel
     */
    public int getNumProfesor() {
        return numProfesor;
    }
    /**
     * Metodo setNumProfesor
     * @param numProfesor asigna un valor al atributo numProfesor
     */
    public void setNumProfesor(int numProfesor) {
        this.numProfesor = numProfesor;
    }
    /**
     * Metodo getEscuela
     * @return retorna el contenido de atibuto escuel, el cual es el nombred de la esceula en la que trabaja
     */
    public String getEscuela() {
        return escuela;
    }
    /**
     * Metodo setEscuela
     * @param escuela asigna el valor al atributo escuela
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /**
     * Metodo getSoliciudes
     * @return retorna el valor del atributo solicitudes, el cual es el numero de solicitudes de trabajo por revisar
     */
    public int getSolicitudes() {
        return solicitudes;
    }
    /**
     * Metodo setSolicitudes
     * @param solicitudes asigna el valor al atributo soicitudes
     */
    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }
    /**
     * Metodo getNumTrabajador
     * @return retorna el valor del atributo numTrabajador, el cual es el numero de trabajor que tiene dentro de la escuela
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
     * @return retorna el valor del atributo seldo, el cual es la ganacia semanal del director
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
     * @return retorna el valor del atributo horas, el cual es el numerod de horas que trabaja al dia el director
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
     * @return Imprime en pantalla el valor de los atributos del director
     */
    @Override
    public String toString() {
        return super.toString()+"Director{" + "numProfesor=" + numProfesor + ", escuela=" + escuela + ", solicitudes=" + solicitudes + '}';
    }
}
