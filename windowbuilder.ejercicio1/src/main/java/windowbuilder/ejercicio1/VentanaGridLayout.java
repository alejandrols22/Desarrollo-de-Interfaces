package windowbuilder.ejercicio1;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaGridLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGridLayout frame = new VentanaGridLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaGridLayout() {
		   setTitle("Ventana GridLayout");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(450, 300);
	        setLocationRelativeTo(null);  // Centra la ventana

	        setLayout(new GridLayout(3, 1));

	        add(new JButton("Botón1"));
	        add(new JButton("Botón2"));
	        add(new JButton("Botón3"));
	}

}
