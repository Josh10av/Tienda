
package com.tienda.controller;



import com.tienda.domain.Item;
import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j

public class CarritoController {
     @Autowired
     private ItemAService itemService;
     @Autowired
     private ArticuloService articuloService;
     
     @GetMapping ("/carrito/listado")
     public String inicio (Model model) {
         var items = itemService.getItems();
         model.addAttribute ("items", items);
         var carritoTotalVenta=0;
         for (Item i:items) {
             carritoToltalVenta += (i.getCantidad() * i.getPrecio());
         }
         
        model.addAttribute ("carritoTotal", carritoTotalVenta);
        return "/carrito/listado"; 
       
     }
    
    
}
