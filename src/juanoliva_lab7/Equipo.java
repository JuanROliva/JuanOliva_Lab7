package juanoliva_lab7;

import java.util.Scanner;

public class Equipo {
    private String nombreEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesContra;
    private int direferenciGoles;
    private int puntos;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDireferenciGoles() {
        return direferenciGoles;
    }

    public void setDireferenciGoles(int direferenciGoles) {
        this.direferenciGoles = direferenciGoles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombreEquipo;
    }
    
    public String resitroCadena(){
        return nombreEquipo+","+partidosJugados+","+partidosGanados+","+
                partidosEmpatados+partidosPerdidos+","+golesFavor+","+
                golesContra+","+direferenciGoles+","+puntos+"\n";
    }
    
    public void cadenaRegistro(String cadenaRegistro){
        Scanner registro = new Scanner(cadenaRegistro);
        registro.useDelimiter(",");
        nombreEquipo = registro.next();
        partidosJugados = registro.nextInt();
        partidosGanados = registro.nextInt();
        partidosEmpatados = registro.nextInt();
        partidosPerdidos = registro.nextInt();
        golesFavor = registro.nextInt();
        golesContra = registro.nextInt();
        puntos = registro.nextInt();
    }
}
