package co.edu.uniquindio.poo.app;
import java.time.LocalTime;
import co.edu.uniquindio.poo.model.Empleado;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("pedro", "102090", LocalTime.of(14, 0),LocalTime.of(14, 0) );
        JOptionPane.showMessageDialog(null, empleado1);
    }
}