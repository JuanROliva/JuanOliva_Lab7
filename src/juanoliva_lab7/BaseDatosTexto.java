package juanoliva_lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDatosTexto {
    
    private ArrayList<Equipo> registroRom = new ArrayList();
    private File archivo = null;

    public BaseDatosTexto(String direccionArvhico) {
        archivo = new File(direccionArvhico);
    }

    public ArrayList<Equipo> getRegistroEquipos() {
        return registroRom;
    }

    public void cargarArchivo(){
        if (archivo.exists()) {
            try {
                Scanner sc = new Scanner(archivo);
                registroRom = new ArrayList<>();
                while (sc.hasNext()) {
                    registroRom.add(new Equipo(sc.next()));
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("No pudo leer con scanner");
            }
        }
    }
    
    public void guardarArchivo(ArrayList<Equipo> registroRam ){
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Equipo equipo : registroRam) {
                bw.write(equipo.registroCadena());
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Fallo escribir");
        }
    }
}
