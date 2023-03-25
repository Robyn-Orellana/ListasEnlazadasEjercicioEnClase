package java.reproductor;

public class Cancion {
    String ubicacion;
    String nombrecancion;
    String nombrearchivo;

    public Cancion(String ubi, String nomAr, String nomCan){
        ubicacion=ubi;
        nombrearchivo=nomAr;
        nombrecancion=nomCan;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombrecancion() {
        return nombrecancion;
    }

    public void setNombrecancion(String nombrecancion) {
        this.nombrecancion = nombrecancion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombrearchivo() {
        return nombrearchivo;
    }

    public void setNombrearchivo(String nombrearchivo) {
        this.nombrearchivo = nombrearchivo;
    }
}
