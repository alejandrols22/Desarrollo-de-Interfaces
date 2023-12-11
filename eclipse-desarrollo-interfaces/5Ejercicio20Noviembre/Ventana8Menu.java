package desarrollo_interfaces_clase_20_11_23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana8Menu extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuArchivo;
    private JMenuItem miAbrir, miGuardar, miSalir;

    public Ventana8Menu() {
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);

        // Menú "Archivo"
        menuArchivo = new JMenu("Archivo");
        mb.add(menuArchivo);

        miAbrir = new JMenuItem("Abrir");
        miAbrir.addActionListener(this);
        menuArchivo.add(miAbrir);
        
        miGuardar = new JMenuItem("Guardar");
        miGuardar.addActionListener(this);
        menuArchivo.add(miGuardar);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(this);
        menuArchivo.add(miSalir);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem)(e.getSource());
        JOptionPane.showMessageDialog(this, "Seleccionaste: " + source.getText());
        if (e.getSource() == miSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana8Menu ventana = new Ventana8Menu();
            ventana.setSize(300, 200);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
        });
    }
}
