package desarrollo_interfaces_clase_27_11_23;

import javax.swing.*;

public class Ejercicio2ComboBox2 extends JFrame {
    private JComboBox<String> comboBoxLanguage;
    private JComboBox<String> comboBoxIde;
    private JLabel lblSeleccionaUnLenguaje;
    private JLabel lblSeleccionaUnIde;

    public Ejercicio2ComboBox2() {
        setTitle("Ejemplo JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Not recommended for complex layouts
        setSize(340, 132); // Adjusted to fit the components

        // Label for language selection
        lblSeleccionaUnLenguaje = new JLabel("Selecciona un lenguaje:");
        lblSeleccionaUnLenguaje.setBounds(10, 10, 150, 20);
        add(lblSeleccionaUnLenguaje);

        // Combo box for language selection
        comboBoxLanguage = new JComboBox<>();
        comboBoxLanguage.setBounds(160, 10, 150, 20);
        comboBoxLanguage.addItem("Java");
        comboBoxLanguage.addItem("Python");
        comboBoxLanguage.addItem("C++");
        add(comboBoxLanguage);

        // Label for IDE selection
        lblSeleccionaUnIde = new JLabel("Selecciona un ide:");
        lblSeleccionaUnIde.setBounds(10, 40, 150, 20);
        add(lblSeleccionaUnIde);

        // Combo box for IDE selection
        comboBoxIde = new JComboBox<>();
        comboBoxIde.setBounds(160, 40, 150, 20);
        comboBoxIde.addItem("IntelliJ IDEA");
        comboBoxIde.addItem("Eclipse");
        comboBoxIde.addItem("NetBeans");
        add(comboBoxIde);

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2ComboBox2();
            }
        });
    }
}
