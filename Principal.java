import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
/**
 * Write a description of class Principal here.
 *
 * @author Carlos Rene Angarita Sanguino
 * @version 0.1
 */
public class Principal extends JFrame implements ActionListener
{
    static final Integer NUMEROS = 4;
    
    public Integer vendidos = 0;
    Puesto[] btns = new Puesto[NUMEROS];
    
    /**
     * Constructor for objects of class Principal
     */
    public Principal()
    {
        // initialise instance variables
        setTitle("Nataly Sorteos - Por una buena causa");
        setSize(600,600);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2,2));
        
        
        for(Integer i = 0; i<NUMEROS; i++) {
            btns[i] = new Puesto(i.toString());
            btns[i].addActionListener(this);
            c.add(btns[i]);
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        Puesto p = (Puesto)e.getSource();
        
        if(p.getNombre()!=null){ 
            JOptionPane.showMessageDialog(this, "El numero " + 
            e.getActionCommand() + " ya esta vendido. Intenta con otro");
            return;
        }
        vendidos ++ ;
        String nombre = JOptionPane.showInputDialog(this, "Dime ti nombre:");
        String telefono = JOptionPane.showInputDialog(this, "Dime tu Telefono:");
        String direccion = JOptionPane.showInputDialog(this, "Dime tu Dirección:");

        p.setNombre(nombre);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        
        JOptionPane.showMessageDialog(this, "Compraste el numero " + 
            e.getActionCommand() + ". Gracias por participar es para una buena causa");
        p.setBackground(Color.red);
        p.setEnabled(false);
        
        if (vendidos == NUMEROS) {
            int ganador = (int)NUMEROS*(int)Math.random();
            Integer ganadorObj = new Integer(ganador);
            JOptionPane.showMessageDialog(this, "El ganador es el numero " + 
            ganadorObj.toString() + ". Felicitaciones a " + btns[ganador].getNombre());
            
            btns[ganador].setBackground(Color.green);
        }
        
        
    }

    
}
