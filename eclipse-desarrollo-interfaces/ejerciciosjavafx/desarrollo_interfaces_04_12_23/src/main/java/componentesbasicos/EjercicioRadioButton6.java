package componentesbasicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioRadioButton6 extends JFrame {
    public EjercicioRadioButton6() {
        setTitle("Ejemplo JRadioButton");
        // Configurar la operación de cierre por defecto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear los botones de radio
        JRadioButton radioButton1 = new JRadioButton("Pastilla Azul");
        JRadioButton radioButton2 = new JRadioButton("Pastilla Roja");
        
        // Agregar oyentes para los botones de radio
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se selecciona el botón de radio
                JOptionPane.showMessageDialog(EjercicioRadioButton6.this,
                        "Tomas la pastilla azul: la historia termina, despiertas en tu cama y crees lo que quieras creer.",
                        "Elección en la Matrix",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se selecciona el botón de radio
                JOptionPane.showMessageDialog(EjercicioRadioButton6.this,
                        "Tomas la pastilla roja: te quedas en el país de las maravillas y te muestro cuán profundo es el agujero del conejo.",
                        "Elección en la Matrix",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        // Crear un grupo para los botones de radio para asegurar que solo uno pueda ser seleccionado a la vez
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        
        // Panel para contener los botones de radio
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        
        // Agregar el panel al marco
        getContentPane().add(panel);

        // Empaquetar los componentes dentro del marco
        pack();
        // Centrar el marco en la pantalla
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Hacer que la aplicación sea visible en el Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new EjercicioRadioButton6().setVisible(true);
        });
    }
}
