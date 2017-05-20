
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado Empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        imprimir_emp(Empleado1);
    }

    public static void imprimir_emp(Empleado Empleado1) {
        Empleado1.setDireccion("C/del Pez,6");
        Empleado1.setNumHijos(3);
        System.out.println("DNI: "+Empleado1.getDni());
        System.out.println("Nombre: "+Empleado1.getNombre());
        System.out.println("Cargo: "+Empleado1.getCargo());
        System.out.println("Número de hijos: "+Empleado1.getNumHijos());
        System.out.println("Sueldo: "+Empleado1.calcula_sueldo(1200));
    }
    
}
