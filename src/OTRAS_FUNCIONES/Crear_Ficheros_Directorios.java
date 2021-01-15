
package OTRAS_FUNCIONES;

import java.io.*;
import javax.swing.JOptionPane;

public class Crear_Ficheros_Directorios {
    
    
    public void crearDirectorios(){
        try {
            String ruta_dir_principal = "C:"+File.separator+"JELNBackpack";
            String ruta_dir_tareas = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas";
            String ruta_dir_materias = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias";
            
            File rutaDirP = new File(ruta_dir_principal);
            rutaDirP.mkdir();
            
            File rutaDirTareas = new File(ruta_dir_tareas);
            rutaDirTareas.mkdir();
            
            File rutaDirMaterias = new File(ruta_dir_materias);
            rutaDirMaterias.mkdir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Ha ocurrido un error al crear los directorios"+e, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void crearFicheros(){
        crearFicherosRegTareas();
        crearFicherosRegMaterias();
    }
    
    public void crearFicherosRegTareas(){
        try {
            String tareasLunes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Lunes.txt";
            String tareasMartes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Martes.txt";
            String tareasMiercoles = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Miercoles.txt";
            String tareasJueves = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Jueves.txt";
            String tareasViernes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Viernes.txt";
            
            
            File rutaDirT1 = new File(tareasLunes);
            rutaDirT1.createNewFile();
                        
            File rutaDirT2 = new File(tareasMartes);
            rutaDirT2.createNewFile();
            
            File rutaDirT3 = new File(tareasMiercoles);
            rutaDirT3.createNewFile();
            
            File rutaDirT4 = new File(tareasJueves);
            rutaDirT4.createNewFile();
            
            File rutaDirT5 = new File(tareasViernes);
            rutaDirT5.createNewFile();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "¡Ha ocurrido un error al crear\n"
                    + "los ficheros para el registro de tareas", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void crearFicherosRegMaterias(){
        try {
            String materiasLunes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Lunes.txt";
            String materiasMartes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Martes.txt";
            String materiasMiercoles = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Miercoles.txt";
            String materiasJueves = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Jueves.txt";
            String materiasViernes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Materias"
                    +File.separator+"Registro_Materias_Viernes.txt";
            
            
            File rutaDirM1 = new File(materiasLunes);
            rutaDirM1.createNewFile();
                        
            File rutaDirM2 = new File(materiasMartes);
            rutaDirM2.createNewFile();
            
            File rutaDirM3 = new File(materiasMiercoles);
            rutaDirM3.createNewFile();
            
            File rutaDirM4 = new File(materiasJueves);
            rutaDirM4.createNewFile();
            
            File rutaDirM5 = new File(materiasViernes);
            rutaDirM5.createNewFile();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "¡Ha ocurrido un error al crear\n"
                    + "los ficheros para el registro de materias", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
}
