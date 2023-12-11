package desarrollo_interfaces_6_11_23;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Ejercicio2 extends JFrame {
    private JLabel etiquetaMensaje;
    private JLabel etiquetaBienvenido;

    public Ejercicio2() {
        setTitle("Ejemplo con tres Contenedores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Paneles para botones y etiquetas
        JPanel panelBotones = new JPanel();
        JPanel panelMensaje = new JPanel();
        JPanel panelBienvenido = new JPanel();
        JPanel panelNuevosBotones = new JPanel(); // Panel para los nuevos botones

        // Configuración de la etiqueta de bienvenida
        etiquetaBienvenido = new JLabel("Bienvenido");
        panelBienvenido.add(etiquetaBienvenido);

        // Configuración de la etiqueta de mensaje
        etiquetaMensaje = new JLabel("Mensaje: ");
        panelMensaje.add(etiquetaMensaje);

        // Creación y configuración de los botones originales
        for (int i = 1; i <= 3; i++) {
            JButton boton = new JButton("Boton " + i);
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String textoBoton = ((JButton) e.getSource()).getText();
                    etiquetaMensaje.setText("Mensaje: " + textoBoton);
                }
            });
            panelBotones.add(boton);
        }

        // Creación y configuración de los nuevos botones
        for (int i = 1; i <= 3; i++) {
            JButton nuevoBoton = new JButton("Ventana " + i);
            nuevoBoton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNuevaVentana(((JButton) e.getSource()).getText());
                }
            });
            panelNuevosBotones.add(nuevoBoton);
        }

        // Asignación de los paneles al layout del JFrame
        setLayout(new BorderLayout());
        add(panelBienvenido, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(panelMensaje, BorderLayout.SOUTH);
        add(panelNuevosBotones, BorderLayout.EAST); // Agregar el nuevo panel al este

        pack(); // Ajusta el tamaño del frame según los componentes
        setVisible(true);
    }

    // Método para abrir una nueva ventana
    private void abrirNuevaVentana(String tituloVentana) {
        JFrame nuevaVentana = new JFrame(tituloVentana);
        nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevaVentana.add(new JLabel("Has pulsado " + tituloVentana));
        nuevaVentana.pack();
        nuevaVentana.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2();
            }
        });
    }
}
