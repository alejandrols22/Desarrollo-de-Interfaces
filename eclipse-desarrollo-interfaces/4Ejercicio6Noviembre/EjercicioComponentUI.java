package desarrollo_interfaces_6_11_23;
import javax.swing.*;
import java.awt.Color;

public class EjercicioComponentUI {
public static void main(String[] args) {
	JFrame frame = new JFrame("Boton Personalizado");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	panel.setLayout(null);
	frame.getContentPane().add(panel);
	
	JButton button = new JButton("Boton Personalizado");
	button.setBackground(Color.BLACK);
	button.setForeground(Color.WHITE);
	
	//Establecer el tamaño y la ubicacion del boton
	button.setBounds(50, 50, 200, 30); // (x, y, ancho, alto)
	
	frame.setLocation(300, 300);
	frame.setSize(300, 200);
	
	panel.add(button);
	frame.setVisible(true);
}
}
