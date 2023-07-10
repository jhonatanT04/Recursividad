/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicarecursividad;

import java.io.File;

/**
 *
 * @author venot
 */
public class Carpetas {
    public static void renombrarCarpetas(File directorio){
        if (directorio.isDirectory()) {
            String nomDirec = directorio.getName()+"_nuevo";
            File nuevoDirec = new File(directorio.getParentFile(), nomDirec);
            directorio.renameTo(nuevoDirec);
            File[] subDirectior = nuevoDirec.listFiles();
            if (subDirectior!=null) {
                renombreSubCarpetas(subDirectior, 0);
            }
        }
    }
    public static void renombreSubCarpetas(File[] subdirectore,int index){
        if (index<subdirectore.length) {
            File subDirector = subdirectore[index];
            renombrarCarpetas(subDirector);
            renombreSubCarpetas(subdirectore, index+1);
        }
    }
    
}
