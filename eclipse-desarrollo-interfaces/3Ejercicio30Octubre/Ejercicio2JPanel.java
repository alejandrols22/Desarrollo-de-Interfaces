package clase30_octubre_desarrollo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2JPanel extends JFrame {
	
	// se dividen en dos JPanel, en un jpanel estaran los botones y en el otro un
	// jpanel seran label en una misma ventana al pulsar en un boton me aparecera la
	// informacion en el otro jlabel sin cambiarme de ventana

    private JPanel panelBotones;
    private JPanel panelMensaje;
    private JLabel labelMensaje;

    public Ejercicio2JPanel() {
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panelBotones = new JPanel();
        panelMensaje = new JPanel();

        labelMensaje = new JLabel("");
        panelMensaje.add(labelMensaje);

        String[] botonesNombres = {"Aceptar", "Cancelar", "Siguiente", "Redimensionar"};
        for (String nombre : botonesNombres) {
            JButton boton = new JButton(nombre);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    labelMensaje.setText("Has pulsado el botón " + e.getActionCommand());
                }
            });
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.NORTH);
        add(panelMensaje, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2JPanel();
    }
}
