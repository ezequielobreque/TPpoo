/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ezequiel_o
 */
public class Interface {
public List<Item> items= new ArrayList<Item>();

    public List<Item> getItems() {
        return items;
    }
    public Item selecionDeItem(int i){
    return items.get(i);
    
    }
    public void setItems(Item item) {
        items.add(item);
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    


        
}
