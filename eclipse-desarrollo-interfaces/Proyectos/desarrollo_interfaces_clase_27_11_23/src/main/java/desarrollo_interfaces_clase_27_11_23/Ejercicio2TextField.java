package desarrollo_interfaces_clase_27_11_23;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2TextField extends JFrame {

    private JTextField nameField, ageField, addressField, cityField, provinceField;
    private JButton acceptButton;

    public Ejercicio2TextField() {
        setTitle("Formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(350, 300);

        addLabelAndTextField("Indica tu nombre:", 10, 30, 300, 20);
        nameField = new JTextField();
        nameField.setBounds(160, 30, 150, 20);
        add(nameField);

        addLabelAndTextField("Indica tu edad:", 10, 60, 300, 20);
        ageField = new JTextField();
        ageField.setBounds(160, 60, 150, 20);
        add(ageField);

        addLabelAndTextField("Indica tu dirección:", 10, 90, 300, 20);
        addressField = new JTextField();
        addressField.setBounds(160, 90, 150, 20);
        add(addressField);

        addLabelAndTextField("Indica tu ciudad:", 10, 120, 300, 20);
        cityField = new JTextField();
        cityField.setBounds(160, 120, 150, 20);
        add(cityField);

        addLabelAndTextField("Indica tu provincia:", 10, 150, 300, 20);
        provinceField = new JTextField();
        provinceField.setBounds(160, 150, 150, 20);
        add(provinceField);

        acceptButton = new JButton("Aceptar");
        acceptButton.setBounds(100, 200, 150, 30);
        add(acceptButton);

        acceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();
                String city = cityField.getText();
                String province = provinceField.getText();

                System.out.println("Nombre: " + name);
                System.out.println("Edad: " + age);
                System.out.println("Dirección: " + address);
                System.out.println("Ciudad: " + city);
                System.out.println("Provincia: " + province);
            }
        });

        setLocationRelativeTo(null);
    }

    private void addLabelAndTextField(String labelText, int x, int y, int width, int height) {
        JLabel label = new JLabel(labelText);
        label.setBounds(x, y, width, height);
        add(label);
    }

    public static void main(String[] args) {
        Ejercicio1TextField form = new Ejercicio1TextField();
        form.setVisible(true);
    }
}
