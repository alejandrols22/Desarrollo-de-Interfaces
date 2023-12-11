
package desarrollo_interfaces_6_11_23;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class EjercicioCon3Contenedores extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenido;

	public EjercicioCon3Contenedores() {
		setTitle("Ejemplo con tres Contenedores"); //
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelBienvenido = new JPanel();

		etiquetaBienvenido = new JLabel("Bienvenido");
		panelBienvenido.add(etiquetaBienvenido); // añadir el bienvendio al panel

		// Creando los mensajes
		etiquetaMensaje = new JLabel("Mensaje: ");
		panelMensaje.add(etiquetaMensaje); // añadir el mensaje al panel

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
				}
			});
			panelBotones.add(boton); //
		}

		// fija el layout y los paneles al frame
		setLayout(new BorderLayout());
		add(panelBienvenido, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		add(panelMensaje, BorderLayout.SOUTH);

		pack(); // ajusta el tamaño del frame
		setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EjercicioCon3Contenedores();
			}
		});
	}
}
