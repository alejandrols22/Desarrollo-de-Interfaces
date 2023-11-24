package examen2dam_alopez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * En este ejercicio creo una ventana que contenga 6 botones.La ventana tiene un menu en la esquina 
 * izquierda para poder acceder a los botones desde un indice del boton 1 al 6. Ademas se mostrara
 * en la ventana los seis botones divididos en dos paneles. 
 * En el panel Norte los 3 primeros y en el panel Sur los 3 ultimos.  
 *
 * He añadido una ventana anterior que pregunta al usuario un nombre y una contraseña para dejarle acceso
 * a la segunda ventana con los botones. Si el usuario se equivoca se mostrara una ventana diciendole que
 * se ha equivocado.
 * 
 */
public class Ejercicio1 extends JFrame {
	// Variable para autentificacion del usuario
	static String usuario = "a";
	static String contraseña = "1";

	public Ejercicio1() {
		// Configuración del JFrame Principal
		setTitle("Examen Práctico"); // Fijamos un titulo
		setSize(400, 300); // Fijamos el tamaño de la ventana
		setLocation(300, 300);// Fijamos la localizacion
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// El JFrame se cerrara al cerarlo

		// Diseño del Panel Principal
		JPanel botonPanel = new JPanel(new BorderLayout());
		JPanel panelNorte = new JPanel(new FlowLayout());
		JPanel panelSur = new JPanel(new FlowLayout());

		JButton[] botones = new JButton[6]; // Array de 6 botones

		// Bucle que añade el numero del boton
		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton("Botón " + (i + 1));
			configurarBoton(botones[i]);
			botones[i].addActionListener(e -> abrirNuevaVentana(e.getActionCommand()));
			// Condicional que selecciona los botones dependiendo de su numero
			// del 1 al 3 en el panelNorte y del 4 al 6 del panelSur
			if (i < 3) {
				panelNorte.add(botones[i]);
			} else {
				panelSur.add(botones[i]);
			}
		}

		botonPanel.add(panelNorte, BorderLayout.NORTH);
		botonPanel.add(panelSur, BorderLayout.SOUTH);
		add(botonPanel);

		// Creación de la Barra de Menú
		JMenuBar menuBar = new JMenuBar();
		JMenu menuBotones = new JMenu("Botones");
		menuBar.add(menuBotones);
		setJMenuBar(menuBar);

		// Bucle que añade los botones , usamos la longitud de los botones para que se
		// ordenen de menor numero a mayor numero
		for (int i = 0; i < botones.length; i++) {
			JMenuItem menuItem = new JMenuItem("Botón " + (i + 1));
			menuItem.addActionListener(e -> abrirNuevaVentana(e.getActionCommand()));
			menuBotones.add(menuItem);
		}

		setVisible(true);
	}

	// Configuracion del diseño del boton
	private void configurarBoton(JButton boton) {
		boton.setBackground(new Color(135, 206, 250));
		boton.setForeground(Color.BLACK);
	}

	// Abre una nueva ventana al pulsar en uno de los botones
	private void abrirNuevaVentana(String textoBoton) {
		JFrame ventana = new JFrame();
		ventana.setSize(200, 100);
		ventana.setLayout(new FlowLayout());
		// Añade la ventana que le muestra el boton que ha pulsado
		ventana.add(new JLabel("Se ha pulsado " + textoBoton));
		// Boton para cerrar la ventana
		JButton cerrar = new JButton("Cerrar");
		// Al pulsar el boton se ejecuta el dispose de la ventana que provoca que se
		// cierre
		cerrar.addActionListener(e -> ventana.dispose());
		ventana.add(cerrar);
		ventana.setVisible(true);
	}

	// Creacion de la venta de autenticicacion que pregunta al usuario su
	// usuario y su contraseña
	private static void mostrarVentanaAutenticacion() {
		JFrame autFrame = new JFrame("Autenticación");
		autFrame.setSize(300, 150);
		autFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		autFrame.setLayout(new FlowLayout());

		// Añadimos los campos del usuario y la contraseña y los botones de aceptar y
		// cancelar
		JTextField campoUsuario = new JTextField(20);
		JPasswordField campoContraseña = new JPasswordField(20);
		JButton botonAceptar = new JButton("Aceptar");
		JButton botonCancelar = new JButton("Cancelar");

		// Fijo los colores de los botones aceptar y cancelar
		botonAceptar.setBackground(Color.GREEN);
		botonAceptar.setForeground(Color.WHITE);
		botonCancelar.setBackground(Color.RED);
		botonCancelar.setForeground(Color.WHITE);

		// Añado los campos de usuario y contraseña con los botones de aceptar y
		// cancelar
		autFrame.add(new JLabel("Usuario:"));
		autFrame.add(campoUsuario);
		autFrame.add(new JLabel("Contraseña:"));
		autFrame.add(campoContraseña);
		autFrame.add(botonAceptar);
		autFrame.add(botonCancelar);
		// Añado una funcionalidad al boton de aceptar que iniciara un condicional, si
		// el usuario no ha puesto el usuario y la contraseña
		botonAceptar.addActionListener(e -> {
			String usuario = campoUsuario.getText();
			String contrasena = new String(campoContraseña.getPassword());
			// Condicional que se asegura de que el usuario y la contraseña sean correcto
			if (usuario.equals(usuario) && contraseña.equals(contrasena)) {
				autFrame.dispose();
				new Ejercicio1();
				// Si no son correctos mostrara otra ventana que muestra un texto que le dice
				// que la contraseña es incorrecta
			} else {
				JOptionPane.showMessageDialog(autFrame,
						"Nombre de usuario o contraseña incorrecto. Inténtelo nuevamente.");
			}
		});

		botonCancelar.addActionListener(e -> System.exit(0)); // Para salir del programa

		autFrame.setVisible(true); // lo fijamos para que sea visible
	}

	public static void main(String[] args) {
		// Invoca la Ventana de Autenticacion
		SwingUtilities.invokeLater(Ejercicio1::mostrarVentanaAutenticacion);

	}
}
