package componentesbasicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3CheckBox2 extends JFrame {
    
    public Ejercicio3CheckBox2() {
        JCheckBox checkBox1 = new JCheckBox("Aceptar términos y condiciones");
        getContentPane().add(checkBox1, BorderLayout.WEST);
        setSize(445, 213);
        setLocationRelativeTo(null);

        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    mostrarMensaje("Indica el código", "Has aceptado los términos y condiciones");
                } else {
                    mostrarMensaje("Indica el código", "Has desmarcado los términos y condiciones");
                }
            }
        });

        // Agregar otro checkbox para la publicidad
        JCheckBox checkBoxPublicidad = new JCheckBox("Desea recibir publicidad");
        getContentPane().add(checkBoxPublicidad, BorderLayout.EAST);

        checkBoxPublicidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBoxPublicidad.isSelected()) {
                    mostrarMensaje("Publicidad", "Has aceptado recibir publicidad");
                } else {
                    mostrarMensaje("Publicidad", "Has rechazado recibir publicidad");
                }
            }
        });
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3CheckBox2().setVisible(true);
            }
        });
    }
}
