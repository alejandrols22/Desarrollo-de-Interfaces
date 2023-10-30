package clase30_octubre_desarrollo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana5ConMetodos extends JFrame {
	private JPanel panel;

	private void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);

	}

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton botonBienvenido = new JButton(nombreBoton);
		botonBienvenido.setBounds(x, y, 100, 50);
		panel.add(botonBienvenido);
	}

	public static void main(String[] args) {
		Ventana5ConMetodos ventana = new Ventana5ConMetodos();
		ventana.inicializarVentana();

		String[] nombresBotones = { "boton1", "boton2", "boton3" };
		for (int i = 0; i < nombresBotones.length; i++) {
			ventana.agregarBoton(nombresBotones[i], 50, 50 * i + 60);
		}

	}
}
