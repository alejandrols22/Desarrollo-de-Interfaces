package windowbuilder.ejercicio1;

import javax.swing.JOptionPane;

public class EjemplosJOptionPane {

	public static void main(String[] args) {
	
		while (true) { // Loop infinito para que el usuario pueda probar todas las opciones
            String[] opciones = {"Mensaje Informativo", "Entrada de Texto", "Mensaje de Confirmación", "Selección de Opciones", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción del menú", "Menú Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    // Mensaje Informativo
                    JOptionPane.showMessageDialog(null, "Este es un mensaje informativo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 1:
                    // Entrada de Texto
                    String entrada = JOptionPane.showInputDialog(null, "Introduce tu nombre:", "Entrada", JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Nombre introducido: " + entrada, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    // Mensaje de Confirmación
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "El usuario eligió continuar.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario eligió no continuar.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 3:
                    // Selección de Opciones
                    Object[] opcionesSeleccion = {"Opción 1", "Opción 2", "Opción 3"};
                    int opcionElegida = JOptionPane.showOptionDialog(null, "Elige una opción", "Selección",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSeleccion, opcionesSeleccion[0]);
                    JOptionPane.showMessageDialog(null, "El usuario eligió: " + opcionesSeleccion[opcionElegida], "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4:
                    // Salir del programa
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no reconocida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
