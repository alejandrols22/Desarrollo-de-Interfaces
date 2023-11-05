package windowbuilder.ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio4FrameJOptionPane extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana con Boton");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton boton = new JButton("Haz clic aqui");
        ventana.getContentPane().setLayout(null); // Estableciendo layout nulo (Absolute Layout)
        boton.setBounds(150, 85, 100, 30); // Estableciendo posición y tamaño del botón
        ventana.getContentPane().add(boton);
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(ventana,
                        "Dime tu nombre", "Datos personales",
                        JOptionPane.QUESTION_MESSAGE);
                
                
                System.out.println("Nombre introducido: " + nombre);
            }
        });

        ventana.setVisible(true); // Haciendo visible la ventana
    }
}
