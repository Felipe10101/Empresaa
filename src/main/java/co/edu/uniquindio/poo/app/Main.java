package co.edu.uniquindio.poo.app;
import java.time.LocalTime;
import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Empresa;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear Empresa
        Empresa empresaOf = new Empresa("AraPremium", "1291892",LocalTime.of(8, 0) );

        //Crear Empleados
        Empleado empleado1 = new Empleado("pedro", "102090", LocalTime.of(8, 0),LocalTime.of(14, 0) );
        Empleado empleado2 = new Empleado("manuel", "212312", LocalTime.of(10, 0),LocalTime.of(14, 0) );
        Empleado empleado3 = new Empleado("juan", "234325", LocalTime.of(13, 0),LocalTime.of(15, 0) );


        //Agregar Empleados a la lista
        empresaOf.getListaEmpleados().add(empleado1);
        empresaOf.getListaEmpleados().add(empleado2);
        empresaOf.getListaEmpleados().add(empleado3);

        //Consultar empleados que llegaron tarde
        ArrayList<Empleado> empleadosTarde = empresaOf.consultarEmpleadosTarde(
                empresaOf.getHoraEntradaEmpresa()
        );

        //Mostrar resultados
        StringBuilder mensaje = new StringBuilder("Empleados que llegaron tarde:\n\n");

        if (empleadosTarde.isEmpty()) {
            mensaje.append("Ningún empleado llegó tarde.");
        } else {
            for (Empleado e : empleadosTarde) {
                mensaje.append(e.getNombre())
                        .append(" - Hora de llegada: ")
                        .append(e.getHoraLlegada())
                        .append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}