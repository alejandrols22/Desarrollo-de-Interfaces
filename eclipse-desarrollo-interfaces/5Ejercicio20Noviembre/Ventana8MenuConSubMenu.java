package desarrollo_interfaces_clase_20_11_23;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana8MenuConSubmenu extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuArchivo, menuOpciones, menuAyuda;
    private JMenuItem miAbrir, miGuardar, miCerrar;
    private JMenuItem miConfiguracion, miPreferencias;
    private JMenuItem miAyuda, miAcercaDe;

    public Ventana8MenuConSubmenu() {
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

        miCerrar = new JMenuItem("Cerrar");
        miCerrar.addActionListener(this);
        menuArchivo.add(miCerrar);

        // Menú "Opciones"
        menuOpciones = new JMenu("Opciones");
        mb.add(menuOpciones);

        miConfiguracion = new JMenuItem("Configuración");
        miConfiguracion.addActionListener(this);
        menuOpciones.add(miConfiguracion);

        miPreferencias = new JMenuItem("Preferencias");
        miPreferencias.addActionListener(this);
        menuOpciones.add(miPreferencias);

        // Menú "Ayuda"
        menuAyuda = new JMenu("Ayuda");
        mb.add(menuAyuda);

        miAyuda = new JMenuItem("Ver Ayuda");
        miAyuda.addActionListener(this);
        menuAyuda.add(miAyuda);

        miAcercaDe = new JMenuItem("Acerca de...");
        miAcercaDe.addActionListener(this);
        menuAyuda.add(miAcercaDe);
    }

    public void actionPerformed(ActionEvent e) {
        // Aquí se manejan las acciones de los elementos de menú
        JMenuItem source = (JMenuItem)(e.getSource());
        JOptionPane.showMessageDialog(this, "Seleccionaste: " + source.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana8MenuConSubmenu ventana = new Ventana8MenuConSubmenu();
            ventana.setSize(400, 300);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
        });
    }
}