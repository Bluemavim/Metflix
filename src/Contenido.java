import java.util.ArrayList;
import java.util.List;

public class Contenido {

    //Atributos


    protected String nombre;
    protected Genero genero;
    //Idioma Origen
    protected Idioma idiomaOrigen;
    protected int añoLanzamiento;
    private List<Actor> actores = new ArrayList<>();


    //Getters y Setters

    //Getter y Setters de nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Getter y Setter de Género

    public Genero getGenero(){
        return this.genero;
    }    


    //Getter y setters de Año de Lanzamiento
    public int getAñoLanzamiento(){
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento = añoLanzamiento;
    }
    
    //Getter y setters de idioma
    public Idioma getIdiomaOrigen(){
        return this.idiomaOrigen;
    }

    public void setIdiomaOrigen(Idioma idiomaOrigen){
        this.idiomaOrigen = idiomaOrigen;
    }

    //Getters y Setters de List<Actor>

    public List<Actor> getActores(){
        return this.actores;
    }

    public void setActores(List<Actor> actores){
        this.actores = actores;
    }

}
