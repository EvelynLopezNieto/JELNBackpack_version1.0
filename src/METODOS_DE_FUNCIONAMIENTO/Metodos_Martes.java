
package METODOS_DE_FUNCIONAMIENTO;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Martes;
import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_Martes {
        
    Vector vPrincipal = new Vector();
    String materiasMartes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Martes.txt";

    //PARA GUARDAR DATOS EN UN VECTOR
//    public void guardarMartes(Estructura_Martes estMar) {
//        vPrincipal.addElement(estMar);
//    }

    //PARA GUARDAR EN UN archivo txt
    public void guardarArchivoMartes(Estructura_Martes estructuraMar) {
        try {
            FileWriter fw = new FileWriter(materiasMartes, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(estructuraMar.getHora_martes());
            pw.print("|" + estructuraMar.getMateria_martes());
            pw.println();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e,"Error de archivo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarRegMatMar(){
        try {
           FileWriter fw = new FileWriter(materiasMartes);
           PrintWriter pw = new PrintWriter(fw);
           pw.print("");
           fw.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Ocurrió un error con el archivo\n"+e,"Error de archivo",JOptionPane.ERROR_MESSAGE); 
        }
    }

    //PARA MOSTRAR LOS DATOS EN UN jTable
    public DefaultTableModel listaMaterias() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("HORA");
        cabeceras.addElement("MATERIA");
        //CREAMOS UN VECTOR QUE CONTENGA HORA Y MATERIA
        //CREAMOS UN MODELO DE TABLA PARA AGREGAR EL VECTOR EN LA UBICACION 0
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        try {
            FileReader fr = new FileReader(materiasMartes);
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error con el archivo, o el archivo está vacío\n"+e,"Error de archivo",JOptionPane.ERROR_MESSAGE);
        }
        return mdlTabla;
    }

}
