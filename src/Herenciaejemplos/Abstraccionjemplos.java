package Herenciaejemplos;

public class Abstraccionjemplos {
	
	public static void main(String[] args) {
        Libro libroreal = new LibroReal("Libro de Mormon", "Jose Smith", 1930, 642);
        libroreal.mostrarInformacion();

        Libro librodigital = new LibroDigital("Biblia", "Muchas personas", 600, "PDF");
        librodigital.mostrarInformacion();
    }
}

abstract class Libro{
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void mostrarInformacion();
}

class LibroReal extends Libro{
    private int numeroPaginas;

    public LibroReal(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El libro es: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " +anioPublicacion);
        System.out.println("Número de páinas: " + numeroPaginas);

    }
}

class LibroDigital extends Libro{
    private String formato;

    public LibroDigital(String titulo, String autor, int anioPublicacion, String formato) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El libro es: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " +anioPublicacion);
        System.out.println("Formato: " + formato);

    }
}
