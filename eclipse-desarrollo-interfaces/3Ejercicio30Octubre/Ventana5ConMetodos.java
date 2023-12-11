package clase30_octubre_desarrollo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana5ConMetodos extends JFrame {
	protected JPanel panel;

	protected void inicializarVentana() { //inicializamos la ventana inicial
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);

	}

	private void agregarBoton(String nombreBoton, int x, int y) { // agrega botones para la ventana
		JButton botonBienvenido = new JButton(nombreBoton);
		botonBienvenido.setBounds(x, y, 100, 50);
		panel.add(botonBienvenido);
	}

	public static void main(String[] args) {
		/*
		 * Ventana5ConMetodos ventana = new Ventana5ConMetodos();
		 * ventana.inicializarVentana();
		 * 
		 * int y=50; for (int i=1; i<4; i++) { ventana.agregarBoton("Boton "+i, 50, y);
		 * y=y+50; }
		 */

		// ahora los botones van a ser 3 aceptar cancelar siguiente usando un array

		Ventana5ConMetodos ventana = new Ventana5ConMetodos();
		ventana.inicializarVentana();

		String[] botonesNombres = { "Aceptar", "Cancelar", "Siguiente" };

		short y = 50;
		for (String nombre : botonesNombres) {
			ventana.agregarBoton(nombre, 60, y);// ponemos 60 ya que es mas que 50 y lo que generara es un espacio entre
												// botones
			y += 60;
			
			
		}
	}
}
