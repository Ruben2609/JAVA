package ProyectoAlbum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;
import java.util.List;

// Definición de la clase abstracta Automovil
abstract class Motos {
    private String nombre;
    private String tipo;
    private ImageIcon imagen;

    public Motos(String nombre, String tipo, String imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = new ImageIcon(imagen);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    // Método abstracto para mostrar información detallada del automóvil
    public abstract void mostrarInformacion();
}

// Definición de clases de automóviles concretas
class Chopper extends Motos {
    public Chopper(String nombre, String imagen) {
        super(nombre, "Choppers", imagen);
    }

    @Override
    public void mostrarInformacion() {
        
        System.out.println("Nombre: " + getNombre() + getImagen());
        System.out.println("Tipo: " + getTipo() + getImagen());
        System.out.println();
    }
}

class Motoneta extends Motos {
    public Motoneta(String nombre, String imagen) {
        super(nombre, "Motoneta", imagen);
    }

    @Override
    public void mostrarInformacion() {
        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println();
    }
}

class Deportivo extends Motos {
    public Deportivo(String nombre, String imagen) {
        super(nombre, "Deportivo", imagen);
    }

    @Override
    public void mostrarInformacion() {
        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println();
    }
}

