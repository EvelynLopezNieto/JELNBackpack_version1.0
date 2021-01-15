
package METODOS_DE_FUNCIONAMIENTO;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Lunes;
import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_Lunes {
    
    Vector vPrincipal = new Vector();
    String materiasLunes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Lunes.txt";

    //PARA GUARDAR DATOS EN UN VECTOR
//    public void guardarLunes(Estructura_Lunes estLun) {
//        vPrincipal.addElement(estLun);
//    }

    //PARA GUARDAR EN UN archivo txt
    public void guardarArchivoLunes(Estructura_Lunes estructuraLun) {
        try {
            FileWriter fw = new FileWriter(materiasLunes, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(estructuraLun.getHora_lunes());
            pw.print("|" + estructuraLun.getMateria_lunes());
            pw.println();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e,"Error de archivo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarRegMatLun(){
        try {
           FileWriter fw = new FileWriter(materiasLunes);
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
            FileReader fr = new FileReader(materiasLunes);
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
