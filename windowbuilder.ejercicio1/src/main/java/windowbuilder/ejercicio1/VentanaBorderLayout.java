package windowbuilder.ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaBorderLayout extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBorderLayout frame = new VentanaBorderLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaBorderLayout() {
		setTitle("Ventana BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);  // Centra la ventana

        setLayout(new BorderLayout());

        add(new JButton("Botón1"), BorderLayout.NORTH);
        add(new JButton("Botón2"), BorderLayout.CENTER);
        add(new JButton("Botón3"), BorderLayout.SOUTH);
	}

}
