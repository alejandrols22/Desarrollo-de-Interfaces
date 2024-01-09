package ejerciciodesarrollo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ExamenFinal extends JFrame {
    // Componentes para el formulario
    private JTextField textFieldNombre;
    private JTextField textFieldApellidos;
    private JTextField textFieldEdad;
    private JTextArea textAreaComentarios;
    private JCheckBox checkBoxJava;
    private JCheckBox checkBoxPython;
    private JRadioButton radioButtonBachillerato;
    private JRadioButton radioButtonCicloMedio;
    private JRadioButton radioButtonCicloSuperior;
    private JButton botonCargarCurriculum;

    // Constructor de la clase ExamenFinal
    public ExamenFinal() {
        // Título de la ventana del formulario
        setTitle("Formulario para Alumnos de FP");
        // Operación por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establece BorderLayout como el gestor de diseño para el contenedor principal
        getContentPane().setLayout(new BorderLayout());

        // Panel para el formulario con un GridLayout
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));

        // Creación de etiquetas y campos de texto para el formulario
        JLabel labelNombre = new JLabel("Nombre:");
        textFieldNombre = new JTextField();
        JLabel labelApellidos = new JLabel("Apellidos:");
        textFieldApellidos = new JTextField();
        JLabel labelEdad = new JLabel("Edad:");
        textFieldEdad = new JTextField();
        JLabel labelComentarios = new JLabel("Comentarios:");
        textAreaComentarios = new JTextArea();
        // Un JScrollPane para permitir el desplazamiento en el área de comentarios
        JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
        // CheckBoxes para seleccionar los lenguajes de programación conocidos
        checkBoxJava = new JCheckBox("Java");
        checkBoxPython = new JCheckBox("Python");
        // RadioButtons para el nivel de estudios
        radioButtonBachillerato = new JRadioButton("Bachillerato");
        radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
        radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");

        // Agrupación de los RadioButtons para permitir una única selección
        ButtonGroup groupNivelEstudios = new ButtonGroup();
        groupNivelEstudios.add(radioButtonBachillerato);
        groupNivelEstudios.add(radioButtonCicloMedio);
        groupNivelEstudios.add(radioButtonCicloSuperior);

        // Botón para cargar el currículum
        botonCargarCurriculum = new JButton("Cargar Curriculum");

        // Añadir los componentes al panel del formulario
        panelFormulario.add(labelNombre);
        panelFormulario.add(textFieldNombre);
        panelFormulario.add(labelApellidos);
        panelFormulario.add(textFieldApellidos);
        panelFormulario.add(labelEdad);
        panelFormulario.add(textFieldEdad);
        panelFormulario.add(labelComentarios);
        panelFormulario.add(scrollPane);
        panelFormulario.add(checkBoxJava);
        panelFormulario.add(checkBoxPython);
        panelFormulario.add(radioButtonBachillerato);
        panelFormulario.add(radioButtonCicloMedio);
        panelFormulario.add(radioButtonCicloSuperior);
        panelFormulario.add(botonCargarCurriculum);

        // Añadir el panel del formulario al centro del BorderLayout
        getContentPane().add(panelFormulario, BorderLayout.CENTER);

        // Panel para los botones de acción en la parte inferior
        JPanel panelBotones = new JPanel();
        JButton botonCerrar = new JButton("Cerrar");
        JButton botonAceptar = new JButton("Aceptar");
        panelBotones.add(botonCerrar);
        panelBotones.add(botonAceptar);
        // Añadir el panel de botones al sur del BorderLayout
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        // Manejador de eventos para el botón Aceptar
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para recopilar la información del formulario y mostrarla
                recopilarInformacionFormulario();
            }
        });

        // Manejador de eventos para el botón Cerrar
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar ventana de agradecimiento al cerrar la aplicación
                mostrarVentanaAgradecimiento();
            }
        });

        // Manejador de eventos para el botón Cargar Curriculum
        botonCargarCurriculum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cargar el currículum del alumno
                cargarCurriculum();
            }
        });

        // Ajustar el tamaño de la ventana para que se adapte a los componentes y centrarla
        pack();
        setLocationRelativeTo(null);
    }

    // Método para recopilar la información del formulario y mostrarla
    private void recopilarInformacionFormulario() {
        // Aquí se recopila la información del formulario y se muestra
        // en un diálogo de mensaje
        String nombre = textFieldNombre.getText();
        String apellidos = textFieldApellidos.getText();
        String edad = textFieldEdad.getText();
        String comentarios = textAreaComentarios.getText();
        boolean javaChecked = checkBoxJava.isSelected();
        boolean pythonChecked = checkBoxPython.isSelected();
        String nivelEstudios = radioButtonBachillerato.isSelected() ? "Bachillerato" :
                radioButtonCicloMedio.isSelected() ? "Ciclo Medio" :
                radioButtonCicloSuperior.isSelected() ? "Ciclo Superior" : "No seleccionado";

        String mensaje = String.format("Nombre: %s\nApellidos: %s\nEdad: %s\nComentarios: %s\nJava: %b\nPython: %b\nNivel de Estudios: %s",
                nombre, apellidos, edad, comentarios, javaChecked, pythonChecked, nivelEstudios);

        JOptionPane.showMessageDialog(this, mensaje, "Información del Formulario", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar la ventana de agradecimiento
    private void mostrarVentanaAgradecimiento() {
        // Creación de la ventana de diálogo de agradecimiento
        JDialog dialogoAgradecimiento = new JDialog(this, "Agradecimiento", true);
        JLabel mensajeAgradecimiento = new JLabel("Gracias por usar nuestro programa", SwingConstants.CENTER);
        JButton botonAceptar = new JButton("Aceptar");
        // Acción del botón Aceptar en el diálogo de agradecimiento
        botonAceptar.addActionListener(e -> {
            dialogoAgradecimiento.dispose();
            ExamenFinal.this.dispose();
        });

        // Agregar los componentes al diálogo de agradecimiento
        dialogoAgradecimiento.setLayout(new BorderLayout());
        dialogoAgradecimiento.add(mensajeAgradecimiento, BorderLayout.CENTER);
        dialogoAgradecimiento.add(botonAceptar, BorderLayout.SOUTH);
        dialogoAgradecimiento.pack();
        dialogoAgradecimiento.setLocationRelativeTo(this);
        dialogoAgradecimiento.setVisible(true);
    }

    // Método para cargar el currículum utilizando un JFileChooser
    private void cargarCurriculum() {
        // Creación y configuración del JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);

        // Procesar la selección del archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            // Mostrar el nombre del archivo seleccionado en un diálogo de mensaje
            JOptionPane.showMessageDialog(this, "Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear la ventana del formulario en el Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            ExamenFinal ventana = new ExamenFinal();
            ventana.setVisible(true);
        });
    }
}


