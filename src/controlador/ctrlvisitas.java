/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.chrono.ThaiBuddhistEra;
import modelo.visitas;
import vista.frmvisitas;

/**
 *
 * @author Estudiante
 */
public class ctrlvisitas implements MouseListener{
    
    private visitas modelo;
    private frmvisitas vistas;
    
    public ctrlvisitas(visitas modelo, frmvisitas vista) {
       this.modelo = modelo;
    this.vistas = vista;
    
    vista.btnagregar.addMouseListener(this);
    
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== vistas.btnagregar) {
            modelo.setNombre(vistas.txtnombre.getText());
            modelo.setEdad(Integer.parseInt(vistas.txtedad.getText()));
            modelo.setEspecialidad(vistas.txtnombre.getText());
            
            modelo.Guardar();
            
            
        } 
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
         
}
