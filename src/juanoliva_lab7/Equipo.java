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

    public Equipo() {
    }
    
    public Equipo(String cadenaRegistro){
        this.cadenaRegistro(cadenaRegistro);
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

    public void setGolesFavor(int golesFavor) throws Exception {
        if (golesFavor > 0) {
            this.golesFavor = golesFavor;
        }else{
            throw new Exception("Los goles a favor deben ser positivos");
        }
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) throws Exception {
        if (golesContra > 0) {
            this.golesContra = golesContra;
        }else{
            throw new Exception("Los goles en contra deben ser positivos");
        }
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
    
    public void calcularDiferencia(){
        direferenciGoles = golesFavor - golesContra;
    }
    
    public void calculoPuntos(){
        puntos = (partidosGanados*3)+(partidosEmpatados*2);
    }
    
    public String registroCadena(){
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
        calcularDiferencia();
        calculoPuntos();
    }

    public Object[] obtenerArreglo(){
        Object[] registroTabla = {nombreEquipo, partidosJugados,partidosGanados,
            partidosEmpatados ,partidosPerdidos, golesFavor,golesContra,direferenciGoles,puntos};
        return registroTabla;
    }
    
    public void agregarPartidoJugado(){
        partidosJugados++;
    }
    
    public void agregarGane(){
        partidosGanados++;
    }
    
    public void agregarPerdida(){
        partidosPerdidos++;
    }
    
    public void agregarEmpate(){
        partidosEmpatados++;
    }
    
    public void agregarGolesFavor(int golesFavor){
        this.golesFavor += golesFavor;
    }
    
    public void agregarGolesContra (int golesContra){
        this.golesContra += golesContra;
    }
}
