package java.reproductor;

public class NodoMusic {
    Cancion dato;
    NodoMusic enlace;

    public NodoMusic(Cancion dato, NodoMusic enlace) {
        this.dato = dato;
        this.enlace=enlace;
    }
}
