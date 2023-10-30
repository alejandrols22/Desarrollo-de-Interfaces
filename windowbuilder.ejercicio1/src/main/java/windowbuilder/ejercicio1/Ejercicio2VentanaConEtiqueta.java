package windowbuilder.ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio2VentanaConEtiqueta {

	public static void main(String[] args) {
	
		  try {
	            VentanaConEtiqueta ventana = new VentanaConEtiqueta();
	            ventana.setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}