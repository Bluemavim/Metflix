public class Episodio {
    private int numero;
    private String nombre;
    private int duracion; //en minutos
    public Director director;
    private String sinopsis;


    //GETTERS Y SETTERS DE CADA ATRIBUTO

    //Getter y setters de numero
    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    //Getter y Setters de nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getter y setters de duración
    public int getDuracion(){
        return this.duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    //Getter y setters de director
    public int getDirector(){
        return this.duracion;
    }

    public void setDirector(Director director){
        this.director = director;
    }

    //Getters y Setters de Sinopsis

    public String getSinopsis(){
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }


    //MÉTODOS


    public void reproducir(){
        System.out.println("Reproduciendo episodio " + "*" + nombre + "*");
    }
}
