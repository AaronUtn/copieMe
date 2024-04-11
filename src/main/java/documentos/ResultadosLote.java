package documentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ResultadosLote {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private List<ParDocumentos> posiblesCopias;

    public void ResultadoLote(){
        //super();
        this.posiblesCopias = new ArrayList<ParDocumentos>();
    }

    public LocalDateTime getFechaInicio(){
        return fechaInicio;
    }
    public void setFechaInicio(LocalDateTime fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public LocalDateTime getFechaFin(){
        return fechaFin;
    }
    public void setFechaFin(LocalDateTime fechaFin){
        this.fechaFin = fechaFin;
    }

    public List<ParDocumentos> getPosiblesCopias(){

        return new ArrayList<ParDocumentos>(posiblesCopias);
    }
    public void agregarPar(ParDocumentos par){
        this.posiblesCopias.add(par);
    }
}

