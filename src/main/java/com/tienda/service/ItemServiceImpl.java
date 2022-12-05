
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.List;
import org.springframework.stereotype.Service;



@Service 
 public class ItemServiceImpl implements ItemService {
    
    @Override
    public void save (Item item) {
        boolean existe= false;
        for (Item c: listaItems){
            if (obejects.equals (c.getArticulo(), item.getArticulo)) {
                
                if (c.getCantidad() < item.getExistencias()) {
                    c.setCantidad(c.getCantidad() + 1); 
                }
                
               existe = true;
               break;
            }
        }
    }

    @Override
    public List<Item> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Item getItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualiza(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void facturar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 

}
