/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 * Una clase para definir los datos de cada empleado.
 * @author ED06
 * @Version 1.0
 */


public class Empleado {
    private String dni;        //Atributo DNI
    private String nombre;     //Atributo Nombre
    private String direccion;  //Atributo Direccion
    private String cargo;      //Atributo Cargo 
    private int numHijos;      //Atributo Numero de hijos
    
 /**
  * Metodo constructor al cual se le pasan dos argumentos.
  * @param dni     //Dni del empleado
  * @param nombre  //Nombre del empleado
  */   
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     *
     * @param base Metodo que calcula el sueldo dependiendo del cargo que desepeña
     * @return Devuelve un valor 
     */
    public int calcula_sueldo(int base){
        int total=base;
        
        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }

    /**
     * Metodo get que nos devuelve el dni del empleado.
     * @return Devuelve el DNI.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Metodo get que nos devuelve el nombre del empleado.
     * @return Devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set que nos muestra la direccion del empleado.
     * @param direccion Muestra la direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get que nos devuelve el cargo.
     * @return Devuelve el cargo.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Metodo get que nos devuelve el numero de hijos.
     * @return Devuelve el numero de hijos.
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * Metodo set que nos muetra el numero de hijos.
     * @param numHijos Muestra el numero de hijos.
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    
    
}
