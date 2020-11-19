package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Profesor extends Trabajador{
    int numProfesor;
    String Materia;
    int grupos;

    public Profesor() {
    }
    /**
     * Constructor que crea el objeto Profesor
     * @param numProfesor Es de tipo int y contiene el numero de profesor
     * @param Materia Es de tipo String y contiene el nobre de la materia en la que es profesor
     * @param grupos Es de tipo int y tiene el numero de grupos que tiene que revisar
     * @param numTrabajador Es de tipo int y contiene el numero de trabajador del plantel
     * @param sueldo Es de tipo int y contiene el sueldo que gana semanalmente
     * @param horas Es de tipo int y contiene as horas totales de trabajo por dia
     * @param Nombre Es de tipo String y contiene el nombed el profesor
     * @param Apellido Es de tipo String y contiene el apellido del profesor
     * @param Curp Es de tipo String y contiene el curp del profesor
     * @param edad Es de tipo int y contiene la edad del profesor
     * @param genero Es de tipo String y contiene el genero del profesor
     * @param fNacimiento Es una fecha proporcionada por la clase fecha
     */
    public Profesor(int numProfesor, String Materia, int grupos, int numTrabajador, int sueldo, int horas, String Nombre, String Apellido, String Curp, int edad, String genero, fecha fNacimiento) {
        super(numTrabajador, sueldo, horas, Nombre, Apellido, Curp, edad, genero, fNacimiento);
        this.numProfesor = numProfesor;
        this.Materia = Materia;
        this.grupos = grupos;
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
     * Metodo getMateria
     * @return retorna el valor del atributo materia, el cual es el nombre de la materia que imparte
     */
    public String getMateria() {
        return Materia;
    }
    /**
     * Metodo setMateria
     * @param Materia asigna el valor al atributo materia
     */
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    /**
     * Metodo getGrupos
     * @return retonrna el valor del atributo grupos, el cual es el numero de grupos del que es profesor
     */
    public int getGrupos() {
        return grupos;
    }
    /**
     * Metodo setGrupos
     * @param grupos asigna el valor al atributo grupos
     */
    public void setGrupos(int grupos) {
        this.grupos = grupos;
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
     * @return retorna el valor del atributo seldo, el cual es la ganacia semanal del profesor
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
     * @return retorna el valor del atributo horas, el cual es el numerod de horas que trabaja al dia el profesor
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
     * @return Imprime en pantalla el valor de los atributos del profesor
     */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numProfesor=" + numProfesor + ", Materia=" + Materia + ", grupos=" + grupos + '}';
    }
}
