package windowbuilder.ejercicio1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaBoxLayout extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBoxLayout frame = new VentanaBoxLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaBoxLayout() {
		setTitle("Ventana BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);  // Centra la ventana

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        setContentPane(panel);

        panel.add(new JButton("Botón1"));
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Agrega un pequeño espacio entre botones
        panel.add(new JButton("Botón2"));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(new JButton("Botón3"));
	}

}
