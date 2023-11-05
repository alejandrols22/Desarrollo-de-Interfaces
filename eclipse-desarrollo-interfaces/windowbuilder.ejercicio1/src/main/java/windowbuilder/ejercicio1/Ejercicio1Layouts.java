package windowbuilder.ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ejercicio1Layouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame ventana = new JFrame("mi primera ventana");
		ventana.setSize(400,400);
		ventana.setVisible(true);
		
		JFrame ventana2 = new JFrame("primera ventana");
		ventana.setSize(400,400);
		ventana.setVisible(true);
		*/
		
	
		
		        EventQueue.invokeLater(() -> {
		            JFrame[] ventanas = {
		                new VentanaAbsoluteLayout(),
		                new VentanaFlowLayout(),
		                new VentanaBorderLayout(),
		                new VentanaGridLayout(),
		                new VentanaBoxLayout()
		            };

		            for (JFrame ventana : ventanas) {
		                ventana.setVisible(true);
		            }
		        });
		    }
		}

	
