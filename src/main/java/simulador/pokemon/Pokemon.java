package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private String tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, String tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void entrenar(){
        this.salud =+2;
    }
}

