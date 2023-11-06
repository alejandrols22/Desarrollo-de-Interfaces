package windowbuilder.ejercicio1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3JframeJOptionPane {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana con Botón");
        
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton boton = new JButton("Haz clic aquí");
        ventana.add(boton);
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(ventana,
                        "Dime tu nombre", "Datos Personales",
                        JOptionPane.QUESTION_MESSAGE);
                // Aquí puedes usar el nombre introducido si lo deseas
                System.out.println("Nombre introducido: " + nombre);
            }
        });
        
        ventana.setVisible(true);
    }
}



