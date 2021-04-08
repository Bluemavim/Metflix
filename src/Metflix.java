import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    //Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo(){

        //Pelis: Titanic, Batman: El caballero de la noche 
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula("Titanic", 1997); //Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.setDuracion(210); //3hs 30

        Actor actor = new Actor();
        actor.setNombre("Leo DiCaprio");

        //Agrego a la lista de actores del objeto titanic
        titanic.getActores().add(actor); //metodo Add -> agregar a una lista

        //Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        //Otra Peli
        Pelicula batman = new Pelicula("Batman: el caballero de la noche", 2008);
        batman.setDuracion(152);

        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
        actor.setNombre("Christian Bale");

        batman.getActores().add(actor);

        this.peliculas.add(batman);

        //Peli Eterno resplandor de una mente sin recuerdos:
        Pelicula eternoResp = new Pelicula("Eterno resplandor de una mente sin recuerdos", 2004);
        eternoResp.setDuracion(108);
        eternoResp.setDirector("Michel Gondry");

        //Agrego a sus protagonistas
      
        actor = new Actor();
        actor.nombre = "Jim Carrey";
        eternoResp.getActores().add(actor);

        actor = new Actor();
        actor.nombre = "Kate Winslet";
        eternoResp.getActores().add(actor);

        this.peliculas.add(eternoResp);


        //Peli Memento:

        Pelicula memento = new Pelicula("Memento", 2000); 
        memento.setDuracion(113);
        memento.director = new Director();
        memento.director.nombre = "Christopher Nolan";

        actor = new Actor();
        actor.nombre = "Guy Pearce";
        memento.getActores().add(actor);

        this.peliculas.add(memento);

        //Peli 1917:

        Pelicula milNueveDiecisiete = new Pelicula("1917", 2019);
        milNueveDiecisiete.setDuracion(119);
        milNueveDiecisiete.director = new Director();
        milNueveDiecisiete.director.nombre = "Sam Mendes";

        actor = new Actor();
        actor.nombre = "George MacKay";
        milNueveDiecisiete.getActores().add(actor);

        this.peliculas.add(milNueveDiecisiete);


        //Peli Whiplash:

        Pelicula whiplash = new Pelicula("Whiplash", 2014);
        whiplash.setDuracion(106);
        whiplash.director = new Director();
        whiplash.director.nombre = "Damien Chazelle";

        actor = new Actor();
        actor.nombre = "Miles Teller";
        whiplash.getActores().add(actor);

        this.peliculas.add(whiplash);

        //Peli Interstellar:

        Pelicula interstellar = new Pelicula("Interstellar", 2014);
        interstellar.setDuracion(169);
        interstellar.director = new Director();
        interstellar.director.nombre = "Christopher Nolan";

        actor = new Actor();
        actor.nombre = "Matthew McConaughey";
        interstellar.getActores().add(actor);

        this.peliculas.add(interstellar);

        //Homeland Serie

        Serie homeland = new Serie();
        homeland.nombre = "Homeland";
        homeland.añoLanzamiento = 2011;
        
        actor = new Actor();
        actor.nombre = "Claire Danes";

        homeland.getActores().add(actor);

        actor = new Actor();
        actor.nombre = "Mandy Patinkin";

        homeland.getActores().add(actor);

        //Temporada 1
        //creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        Episodio episodio = new Episodio(9, "Crossfire");
        //episodio.setNombre("Crossfire");
        //episodio.setNumero(9);

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio(10, "Representative Brody");

        temporada.episodios.add(episodio);

        //Agrego la temporada
        homeland.temporadas.add(temporada);

        //Temporada 4

        temporada = new Temporada();
        temporada.numero = 4;

        episodio = new Episodio(1, "The Drone Queen");

        temporada.episodios.add(episodio);

        episodio = new Episodio(4, "Iron in the Fire");

        temporada.episodios.add(episodio);

        homeland.temporadas.add(temporada);

        this.series.add(homeland);


        //The Good Wife Serie

        Serie goodWife = new Serie();
        goodWife.nombre = "The Good Wife";
        goodWife.añoLanzamiento = 2009;
        
        actor = new Actor();
        actor.nombre = "Julianna Margulies";

        goodWife.getActores().add(actor);

        actor = new Actor();
        actor.nombre = "Christine Baransky";

        homeland.getActores().add(actor);

        //Temporada 1        
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Episodios:
        episodio = new Episodio(3, "Home");

        temporada.episodios.add(episodio);

        episodio = new Episodio(10, "Lifeguard");

        temporada.episodios.add(episodio);

        //Agrego la temporada
        goodWife.temporadas.add(temporada);

        //Temporada 4

        temporada = new Temporada();
        temporada.numero = 3;

        episodio = new Episodio(11, "What went wrong");

        temporada.episodios.add(episodio);

        episodio = new Episodio(22, "The dream team");

        temporada.episodios.add(episodio);

        goodWife.temporadas.add(temporada);

        this.series.add(goodWife);        

        //How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.getActores().add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.getActores().add(actor);
        
        //T5:E11
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 5;
     
        //Creo el episodio
        episodio = new Episodio(11,"The last cigarrete");
        episodio.setDuracion(22);

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio(1, "Definitions");
        episodio.setDuracion(22);

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);


        //T3
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio(1, "Wait for it");
        episodio.setDuracion(22);

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio(4, "Little Boys");
        episodio.setDuracion(22);


        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.getActores().add(actor);

        
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio(1, "Pilot");

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio(9, "The Cooper-Hofstadter Polarization");
  
        temporada.episodios.add(episodio);

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

    }
    
    //Buscar Serie
    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, qeu apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    



    //buscar un director
    //
}
