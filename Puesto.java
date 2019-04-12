import javax.swing.*;
/**
 * Write a description of class Cliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puesto extends JButton
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String telefono;
    private String direccion;

    /**
     * Constructor for objects of class Cliente
     */
    public Puesto()
    {

    }
    
    public Puesto(String numero)
    {
        super(numero);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
