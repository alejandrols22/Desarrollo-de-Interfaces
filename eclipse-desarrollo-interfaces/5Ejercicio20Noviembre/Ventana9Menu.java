package desarrollo_interfaces_clase_20_11_23;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana9Menu extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuArchivo;
    private JMenuItem miNuevo, miAbrir, miSalir;

    public Ventana9Menu() {
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);

        // Menú "Archivo"
        menuArchivo = new JMenu("Archivo");
        mb.add(menuArchivo);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.addActionListener(this);
        menuArchivo.add(miNuevo);

        miAbrir = new JMenuItem("Abrir");
        miAbrir.addActionListener(this);
        menuArchivo.add(miAbrir);
        
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
            Ventana9Menu ventana = new Ventana9Menu();
            ventana.setSize(300, 200);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
        });
    }
}
