/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.chrono.ThaiBuddhistEra;
import modelo.visitas;
import vista.frmvisitas;

/**
 *
 * @author Estudiante
 */
public class ctrlvisitas implements MouseListener, KeyListener{
    
    private visitas modelo;
    private frmvisitas vistas;
    
    public ctrlvisitas(visitas modelo, frmvisitas vista) {
       this.modelo = modelo;
    this.vistas = vista;
    
    vista.btnagregar.addMouseListener(this);
    modelo.Mostrar(vista.jtbpacientes);
    vista.btneliminar.addMouseListener(this);
    vista.jtbpacientes.addMouseListener(this);
    vista.btneditar.addMouseListener(this);
    vista.btnlimpiar.addMouseListener(this);
    vista.btnbuscar.addKeyListener(this);
    vista.txtbuscar.addKeyListener(this);
    
    
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== vistas.btnagregar) {
            modelo.setNombre(vistas.txtnombre.getText());
            modelo.setEdad(Integer.parseInt(vistas.txtedad.getText()));
            modelo.setEspecialidad(vistas.txtnombre.getText());
            
            modelo.Guardar();
            modelo.Mostrar(vistas.jtbpacientes);
        
            
            
        } 
        
        if (e.getSource()==vistas.btneliminar) {
              modelo.Eliminar(vistas.jtbpacientes);
            modelo.Mostrar(vistas.jtbpacientes); 
                                 
         }     
          
        if (e.getSource()==vistas.jtbpacientes){
        modelo.cargarDatosTabla(vistas);
      
        }
        
             if (e.getSource()==vistas.btneditar){
       
                 modelo.setNombre(vistas.txtnombre.getText());
                 modelo.setEdad(Integer.parseInt(vistas.txtedad.getText()));
                 modelo.setEspecialidad(vistas.txtespecialidad.getText());
                 modelo.Actualizar(vistas.jtbpacientes);
                 modelo.Mostrar(vistas.jtbpacientes);
      
        }
             
             if (e.getSource()==vistas.btnlimpiar){
             modelo.limpiar(vistas);
        
             
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

    
    
    @Override
    public void keyTyped(KeyEvent e) {

        if (e.getSource()==vistas.txtbuscar){
             
          modelo.Buscar(vistas.jtbpacientes, vistas.txtbuscar);
       }
            }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
         
}
