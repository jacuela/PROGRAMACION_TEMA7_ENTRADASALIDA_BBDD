/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author jacuela
 */

public class EjemploAccesoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        //***********************************************************
        //    CARGAMOS EL DRIVER
        //***********************************************************
        try {
             Class.forName("org.mariadb.jdbc.Driver").newInstance();
             System.out.println("Driver <org.mariadb.jdbc.Driver> cargado.");
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar MariaDB JDBC Driver");
        }
        
      

        try{
            
            //***********************************************************
            //    NOS CONECTAMOS A LA BASE DE DATOS PERSONAS
            //***********************************************************
        
            //String url = "jdbc:mysql://127.0.0.1/personas";  
            String url = "jdbc:mariadb://127.0.0.1/personas";
            String username = "root";
            String password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
       
       
            
            
            
            //***********************************************************
            //    HACEMOS UN INSERT
            //***********************************************************
            
            //Opcion1: metemos los datos directamente. Esto lo haremos pocas veces (datos fijos)
//            statement.executeUpdate("INSERT INTO personas VALUES (NULL,'David','Costa',19)");
//            
//            
//            //Opcion2: datos en variables. Se leerian desde teclado, por ejemplo
//            String unnombre="Martita";
//            String unapellido="Gris";
//            int unaedad=20;
//            
//            String sql=String.format("INSERT INTO personas VALUES (NULL,'%s','%s',%d)",unnombre,unapellido,unaedad);
//            String sql2="INSERT INTO personas VALUES (NULL,'"+unnombre+"','"+unapellido+"',"+unaedad+")";
//            statement.executeUpdate(sql);
//            statement.executeQuery(sql2);
//            
//            //Opcion3: meter varias tuplas de golpe
//            String nombres[]={"Alfredo1","Alfredo2"};
//            String apellidos[]={"Perez","Olmos"};
//            String edades[]={"19","56"};
//            
//            //se insertan datos en la tabla
//            for (int i = 0; i < nombres.length; i++) {
//                statement.executeUpdate("INSERT INTO personas VALUES (NULL, '" + nombres[i] + "','" + apellidos[i] + "'," + edades[i] + ")");
//            }
//                
//             statement.close();
//             connection.close();

           
            //***********************************************************
            //    HACEMOS UN DELETE
            //***********************************************************
            System.out.println("Borrando una persona.........");
            System.out.print("Nombre de persona a borrar (INTRO para ninguna): ");
            String nombreDel=teclado.nextLine();
            
            if (!nombreDel.equals("")){
                String sql=String.format("DELETE FROM personas WHERE nombre='%s'",nombreDel);
                statement.executeUpdate(sql);
            }
            
            //statement.close();
            //connection.close();
                

           
            
            //***********************************************************
            //    HACEMOS UN SELECT
            //***********************************************************
       
        
            ResultSet rs = statement.executeQuery("SELECT * FROM personas");
            //ResultSet rs = statement.executeQuery("SELECT nombre,apellidos FROM personas");

            
            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                int edad  = rs.getInt("edad");

                System.out.printf("%d, %s %s, %d\n", id, nombre, apellido, edad);
            
            }
            rs.close();
        
            
            
            //================================================================
            //Cerramos cosicas abiertas. Esto se haria despues de hacer cualquier
            //tipo de consulta, SELECT, INSERT O UPDATE o DELETE. En este ejercicio se hacen
            //las varias cosas a la vez para practicar
            statement.close();
            connection.close();

            
        } catch (SQLException ex) {
              System.out.println(ex);
        }
        
        
        
        
        
    }
    
}
