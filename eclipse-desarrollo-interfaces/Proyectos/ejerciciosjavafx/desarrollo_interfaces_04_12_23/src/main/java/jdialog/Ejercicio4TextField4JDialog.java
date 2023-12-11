package jdialog;


import javax.swing.*;
import java.awt.*;




	    

	
		    
			
			public class Ejercicio4TextField4JDialog extends JFrame {

			    public Ejercicio4TextField4JDialog() {
			        setTitle("Ejemplo JTextField con nombre y apellidos");
			        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

			        add(Box.createVerticalStrut(10)); // Espaciado inicial

			        // Añadir los pares de etiqueta y campo de texto
			        addLabeledTextField("Indica tu nombre:", 20);
			        addLabeledTextField("Indica tu edad:", 20);
			        addLabeledTextField("Dirección:", 20);
			        addLabeledTextField("Ciudad:", 20);
			        addLabeledTextField("Provincia:", 20);

			        JButton acceptButton = new JButton("Aceptar");
			        acceptButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el botón

			        // Añadir espaciado antes del botón
			        add(Box.createVerticalGlue());
			        add(acceptButton);
			        add(Box.createVerticalStrut(10)); // Espaciado final

			        pack();
			        setLocationRelativeTo(null); // Centrar en pantalla
			    }

			    private void addLabeledTextField(String labelText, int textFieldSize) {
			        JPanel panel = new JPanel();
			        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

			        JLabel label = new JLabel(labelText);
			        JTextField textField = new JTextField(textFieldSize);
			        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField.getPreferredSize().height));

			        panel.add(label);
			        panel.add(Box.createHorizontalStrut(5)); // Espaciado entre etiqueta y campo de texto
			        panel.add(textField);

			        add(panel);
			        add(Box.createVerticalStrut(5)); // Espaciado entre filas
			    }

			    public static void main(String[] args) {
			        SwingUtilities.invokeLater(() -> {
			            new Ejercicio4TextField4JDialog().setVisible(true);
			        });
			    }
			}

