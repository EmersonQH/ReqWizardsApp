/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author Usuario : EmersonQH
 */
import java.sql.*;
public class DbConnection {
   Connection db = null;
   public static Connection ConnectionDB(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection db = DriverManager.getConnection("jdbc:sqlite:test_admin.db");
           System.out.println("Conexion Exitosa con la Base de Datos");
           return db;
       }
       catch(Exception e){
           System.out.println("Conexion Fallida con la Base de datos"+e);
           return null;
       }
   }
}
























