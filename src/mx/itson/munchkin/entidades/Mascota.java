/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.munchkin.entidades;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author 52622
 */
public class Mascota {
    private String nombreMascota;
    private String tipo;
    private int id;
    
    
            /**
             * el restultado de las tablas de mysql, obteniendo nombre, nombre de la mascota, telefono y fomicilio
             * @return los datos solicitados, establecidos por la tabla.
             * @throws SQLException 
             */
  public List<Mascota> obtener() throws SQLException{
      List<Mascota> mascotas = new ArrayList<>();
      try{
     
          Statement st;
          
          
          ResultSet resultSet = Statement.executeQuery("SELECT id, Nombre, Nombre Mascota, Telefono, Domicilio");
          
          while (resultSet.next()){
              Mascota mascota1 = new Mascota();
              mascota1.setId(resultSet.getInt(1));
              mascota1.setNombreMascota(resultSet.getString(2));
              mascota1.setTipo(resultSet.getString(3));
              
              mascotas.add(mascota1);
              
              
          }
          
          
          
      }catch(Exception ex){
           System.err.println("Ocurrió un error: " + ex.getMessage());
      }
        return mascotas;
  }
 
  /**
   * 
   * @param nombre
   * @param nombremascota
   * @param telefono
   * @param domicilio
   * @return  guarda los datos de los parametros.
   */
  
  
public boolean guardar(String nombre, String nombremascota, String telefono, String domicilio) {
        boolean resultado = false;
        try {

        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * @return the nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * @param nombreMascota the nombreMascota to set
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
           
}
