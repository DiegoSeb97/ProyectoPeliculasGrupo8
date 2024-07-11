package edu.ar.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

//clase para conertarse con la BD
public class Conexion {
    //constante, conecta a nuestra pc
    //3306 o localhost:3306, puerto de la base de datos
    //puerto propio: localhost:3306/nombreBaseDeDatosAUsar
    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/pelisfin?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    private final static String JDBC_USER = "root";//depende de nuestro usuario para conectar a la base de datos
    private final static String JDBC_PASS = "";//contraseña

    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        //seteo valores al datasource
        //importar bibliotecas agregando dependencias en pom.xml
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        ds.setInitialSize(100);

        return ds;
    }

    public static Connection getConexion() throws SQLException{
        try{
            //registrar drive de sql
            //de la dependencia de mysql agregada en dependencias
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            //imprime trazado del error (ruta)
            ex.printStackTrace(System.out);
        }//podemos tener multiples catch para distintas excepciones, tratar de no tener muchas y tratar de agruparlas

        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }

    public static void close(Statement st) throws SQLException{
        st.close();
    }

    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
}
