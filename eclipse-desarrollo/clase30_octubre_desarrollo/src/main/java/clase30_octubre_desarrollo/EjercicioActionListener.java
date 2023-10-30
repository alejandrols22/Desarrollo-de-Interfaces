package clase30_octubre_desarrollo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjercicioActionListener extends Ventana5ConMetodos {

	protected void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 100, 50);

		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFrame ventanaNueva = new JFrame(nombreBoton);

				ventanaNueva.setSize(200, 150);
				ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JLabel mensaje = new JLabel("Has presionado: " + nombreBoton);
				mensaje.setHorizontalAlignment(JLabel.CENTER); // Centrar el label
				ventanaNueva.add(mensaje);
				ventanaNueva.setVisible(true);
			}
		});
		super.panel.add(boton); // Aceder al panel de la supercalse
	}

	private void agregarBotonRedimensionar(int x, int y) {
		JButton botonRedimensionar = new JButton("Redimensionar");
		botonRedimensionar.setBounds(x, y, 150, 50);
		botonRedimensionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaRedimensionada = new JFrame("Redimensionada");
				ventanaRedimensionada.setSize(400, 400);
				ventanaRedimensionada.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JLabel mensajeRedimensionar = new JLabel("Has pulsado el botón Redimensionar");
				mensajeRedimensionar.setHorizontalAlignment(JLabel.CENTER);
				ventanaRedimensionada.add(mensajeRedimensionar);
				ventanaRedimensionada.setVisible(true);
			}
		});
		super.panel.add(botonRedimensionar);
	}

	public static void main(String[] args) {
		EjercicioActionListener ventana = new EjercicioActionListener();
		ventana.inicializarVentana();

		String[] botonesNombres = { "Aceptar", "Cancelar", "Siguiente", "Anterior" };

		int y = 10;
		for (String nombre : botonesNombres) {
			ventana.agregarBoton(nombre, 50, y);
			y += 60;
		}

		ventana.agregarBotonRedimensionar(50, y); // El boton aparece pero para verse mejor deberia hacer la ventana mas
													// grande
	}
}
