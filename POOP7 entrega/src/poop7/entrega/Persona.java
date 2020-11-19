package poop7.entrega;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String Curp;
    private int edad;
    private String genero;
    private fecha fNacimiento;
    public Persona() {
    }
    /**
     * Consructor que crea el objeto persona
     * @param Nombre es de tipo String y contiene el nombre de la persona
     * @param Apellido es de tipo String y y contiene el apellido de la persona
     * @param Curp es de tipo String y contiene el curp de nuestra persona
     * @param edad es de tipo int y contiene la edad de nuestra persona
     * @param genero es de tipo String y contiene el genero de nuestra persona 
     * @param fNacimiento Es una fecha proporcionada por la clase fecha
     */
    public Persona(String Nombre, String Apellido, String Curp, int edad, String genero, fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Curp = Curp;
        this.edad = edad;
        this.genero = genero;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Metodo setNombre
     * @return retorna el valor del atributo nombre, el cual es el nombre de la persona
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Metodo getNombre
     * @param Nombre asigna el valor al atributo nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Metodo getApellido
     * @return retona el valor del atributo apellido, el cual es el apellido de la persona
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * Metodo setApellido
     * @param Apellido asigna el valor al atributo apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * Metodo getCurp
     * @return retorna el valor del atributo curp, el cual es el curp de la persona
     */
    public String getCurp() {
        return Curp;
    }
    /**
     * Metodo setCurp
     * @param Curp le asigan el valor a atributo curp
     */
    public void setCurp(String Curp) {
        this.Curp = Curp;
    }
    /**
     * Metodo getEdad
     * @return retorna el valor del atributo edad, el cual es la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo setEdad
     * @param edad asigna el valor al atributo edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo getGenero 
     * @return retorna el valor de atributo genero, el cual es el genero de nuestra persona
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Metodo setGenreo
     * @param genero asigna el valor al atributo genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Metodo getfNacimiento
     * @return retorna el valor del atributo fecha de nacimiento, el cual es obtenido de otra clase
     */
    public fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * Metodo setfNacimiento
     * @param fNacimiento asigna el vaor a nuestro metodo fNacimeinto
     */
    public void setfNacimiento(fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Metodo toStrig
     * @return retorna el valor de los atributos correspondientes a la clase persona
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Curp=" + Curp + ", edad=" + edad + ", genero=" + genero + ", fNacimiento=" + fNacimiento + '}';
    } 
}
