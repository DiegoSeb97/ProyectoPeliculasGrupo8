package edu.ar.data;
//DAO DATA ACCESS OBJECT

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static edu.ar.data.Conexion.close;
import static edu.ar.data.Conexion.getConexion;
import edu.ar.model.Pelicula;

public class PeliculaDAO {

    private static final String SQL_SELECT = "SELECT * FROM movies";
    private static final String SQL_INSERT = "INSERT INTO movies (nombre, descripcion, genero, calificacion, anio, estrellas, director) values(?,?,?,?,?,?,?)";
    //cada signo de pregunta representa un campo a insertar, con getters
    //campos deben estar identicos a los campos de la base de datos
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM movies WHERE id=7";


    //antes el metodo se llamaba seleccionar()
    public static List<Pelicula> obtener(){
        //METODO QUE RETORNA LA LISTA DE PELICULAS SACADAS DE UNA BASE DE DATOS
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Pelicula pelicula = null;
        List<Pelicula> peliculas = new ArrayList<>();

        try{
            //creo conexion con bd
            conn = getConexion();
            //preparo query
            ps = conn.prepareStatement(SQL_SELECT);//paso la query
            //ejecuto y guardo en rs el resultado de la query
            rs = ps.executeQuery();
            //itero resultados del rs (result set), datos de la bd
            //mientras rs tenga archivos (.next() comprueba si puede leer)
            while (rs.next()) {
                //guardo datos traidos en rs
                int id = rs.getInt("id");
                String nom = rs.getString("nombre");
                String desc = rs.getString("descripcion");
                String genero = rs.getString("genero");
                int calificacion = rs. getInt("calificacion");
                int anio = rs.getInt("anio");
                int estrellas = rs.getInt("estrellas");
                String director = rs.getString("director");

                //usamos instancia de pelicula creada anteriormente
                pelicula = new Pelicula(id, nom, desc, genero, calificacion, anio, estrellas, director);

                //agregar la pelicula en nuestro listado de peliculas
                peliculas.add(pelicula);
            }
        } catch(Exception e){
            e.printStackTrace(System.out);
        } finally{
            //este bloque siempre se realiza por mas que haya error o no
            try {
                //cierro todo
                close(rs);
                close(ps);
                close(conn);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

        }
        return peliculas;
    }

    //METODO INSERTAR PARA AGREGAR PELICULAS A LA BASE DE DATOS

    public static int insert(Pelicula peli){
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try{
            //conecto con base de datos
            //y luego le paso la query
            conn = getConexion();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, peli.getNombre());
            ps.setString(3, peli.getDescripcion());
            ps.setString(3, peli.getGenero());
            ps.setInt(4, peli.getCalificacion());
            ps.setInt(5, peli.getAnio());
            ps.setInt(6, peli.getEstrellas());
            ps.setString(7, peli.getDirector());

            registros = ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            //cerrar conexiones
            try{
                close(conn);
                close(ps);
            } catch(SQLException ex){
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    //seleccionar una pelicula usando el ID
    public static Pelicula seleccionarPorId(int id){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Pelicula peli = null;

        try{
            //inicializo conexion
            //incializo query con prepared statement, tambien seteo id
            //ejecuto query y el resultado queda guardado en result set
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                //mientras se pueda leer una linea de result set
                int idPeli = rs.getInt("id");
                String nombre = rs.getString("nombre");//probar con titulo segun este definido en la base de datos
                String descripcion = rs.getString("descripcion");
                String genero = rs.getString("genero");
                int calificacion = rs.getInt("calificacion");
                int anio = rs.getInt("anio");
                int estrellas = rs.getInt("estrellas");
                String director = rs.getString("director");

                peli = new Pelicula(idPeli, nombre, descripcion, genero, calificacion, anio, estrellas, director);
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try {
                //cierro campos
                close(rs);
                close(ps);
                close(conn);
            } catch (SQLException e) {
                //si hubo error al cerrar informar
                e.printStackTrace(System.out);
            }
        }
        return peli;
    }
}
