
package com.tienda.service;

import com.tienda.domain.Articulo;
import lombok.Data;

@Data
public class Item  extends Articulo {
    private int cantidad; //almacenar la cantidad de items de un articulos
  
  public Item() {  
}
 public Item (Articulo articulo) {
     
     super.setArticulo (articulo.getIdArticulo());
     super.setIdCategoria (articulo.getIdCategoria());
     super.setDescripcion (articulo.getIdDescripciop());
     super.setDetalle (articulo.getIdDetalle());
     super.setPrecio (articulo.getIdPrecio());
     super.setExistencias (articulo.getIdExistencias());
     super.setActivo (articulo.getIdActivo());
     super.setRutaImagen (articulo.getIdRutaImagen());
     this cantidad=0;
   
     
 }

}
