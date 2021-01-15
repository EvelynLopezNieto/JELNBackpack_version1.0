package VENTANAS_PRINCIPALES;

import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {

    Vector vPrincipal = new Vector();

    //PROCEDIMIENTO PARA GUARDAR DATOS EN UN VECTOR
//    public void guardar(Objetos unObjeto) {
//        vPrincipal.addElement(unObjeto);
//    }

    //PROCEDIMIENTO PARA GUARDAR EN UN archivo txt
    public void guardarArchivo(Objetos objeto) {
        try {
            FileWriter fw = new FileWriter("prueba.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(objeto.getOb1());
            pw.print("|" + objeto.getOb2());
            pw.println();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void borrarContenido(){
        try {
            FileWriter fw = new FileWriter("prueba.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            
            pw.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e); 
        }
    }

    //FUNCION PARA MOSTRAR LOS DATOS EN UN jTable
    public DefaultTableModel listaObjetos() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("OBJETO 1");
        cabeceras.addElement("OBJETO 2");
        //CREAMOS UN VECTOR QUE CONTENGA CODIGO, NOMBRE, EDAD
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
            FileReader fr = new FileReader("prueba.txt");
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

        }
        return mdlTabla;
    }
    
    public void buscarLinea(String l){
        try {

            FileReader fr = new FileReader("prueba.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            
            while ((d = br.readLine()) != null) {
                
                if(d.equals(l)){
                    FileWriter fw = new FileWriter("prueba.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    //d="";
                    pw.print("");
                    //pw.println();
                    pw.close();
                    
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizarLinea(Objetos objet){
        try {
            FileReader fr = new FileReader("prueba.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            
            while ((d = br.readLine()) == null) {
                FileWriter fw = new FileWriter("prueba.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print(objet.getOb1());
                pw.print("|" + objet.getOb2());
                pw.println();
                pw.close();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
