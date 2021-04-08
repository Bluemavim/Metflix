public class Pelicula extends Contenido {

    //Constructor:

    public Pelicula(String nombre, int añoLanzamiento) {
        super.nombre = nombre;
        super.añoLanzamiento = añoLanzamiento;
    }

    //Atributos
    
    private int duracion; //en minutos
    private boolean filmadaEnIMAX;
    private Director director = new Director();
    //private List<Director> directores = new ArrayList<>();

//GETTERS Y SETTERS DE CADA ATRIBUTO

    //Getter y setters de Duración
    public int getDuracion(){
        return this.duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }


    //Getter/Setter de Filmadaen Imax

    public boolean getFilmadaEnIMAX() {
        return this.filmadaEnIMAX;
    }

    public void setFilmadaEnIMAX(boolean filmadaEnIMAX) {
        this.filmadaEnIMAX = filmadaEnIMAX;
    }

    //Getter/Setter de Director
    
    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }


    //Getters y Setters de List<Director>

    //public List<Director> getDirectores(){
       // return this.directores;
   // }

   // public void setDirectores(List<Director> directores){
        //this.directores = directores;
   // }


}
