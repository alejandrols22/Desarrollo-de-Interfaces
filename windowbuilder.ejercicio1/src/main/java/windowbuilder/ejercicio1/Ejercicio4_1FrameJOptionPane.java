package windowbuilder.ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio4_1FrameJOptionPane extends JFrame {
	

	 private JPanel contentPane;

	    public static void main(String[] args) {
	        JFrame ventana = new JFrame("Ventana con Botones");
	        ventana.setSize(500, 300);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        ventana.getContentPane().setLayout(null); // Estableciendo layout nulo (Absolute Layout)

	        // Primer botón - Pregunta el nombre
	        JButton boton1 = new JButton("Preguntar Nombre");
	        boton1.setBounds(50, 50, 150, 30);
	        ventana.getContentPane().add(boton1);
	        
	        boton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String nombre = JOptionPane.showInputDialog(ventana,
	                        "Dime tu nombre", "Datos personales",
	                        JOptionPane.QUESTION_MESSAGE);
	                System.out.println("Nombre introducido: " + nombre);
	            }
	        });

	        // Segundo botón - Muestra un mensaje
	        JButton boton2 = new JButton("Mostrar Mensaje");
	        boton2.setBounds(50, 100, 150, 30);
	        ventana.getContentPane().add(boton2);
	        
	        boton2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(ventana, "¡Hola, este es un mensaje!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	            }
	        });

	        // Tercer botón - Cierra la ventana
	        JButton boton3 = new JButton("Cerrar Ventana");
	        boton3.setBounds(50, 150, 150, 30);
	        ventana.getContentPane().add(boton3);
	        
	        boton3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                ventana.dispose();
	            }
	        });

	        ventana.setVisible(true); // Haciendo visible la ventana
	    }
	}