package documentos;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class Documento{
    private String autor;
    private  String contenido;

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Float distancia (Documento otroDoc){
        Integer rawDist = LevenshteinDistance.getDefaultInstance(
        ).apply(this.contenido, otroDoc.getContenido());
        Integer contentSize = Math.max(this.contenido.length(),otroDoc.contenido.length());
        return rawDist *1.0f / contentSize;
    }
    public Documento(String unAutor, String unContenido){
        this.setAutor(unAutor);
        this.setContenido(unContenido);
    }

}
