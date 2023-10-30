package windowbuilder.ejercicio1;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaFlowLayout extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFlowLayout frame = new VentanaFlowLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaFlowLayout() {
		 setTitle("Ventana FlowLayout");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(450, 300);
	        setLocationRelativeTo(null);  // Centra la ventana

	        setLayout(new FlowLayout());

	        add(new JButton("Botón1"));
	        add(new JButton("Botón2"));
	        add(new JButton("Botón3"));
	}

}
