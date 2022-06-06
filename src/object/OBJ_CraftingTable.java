package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_CraftingTable extends Entity {
    
    public OBJ_CraftingTable(GamePanel gp) {
        
        super(gp);
        
        name = "Crafting Table";
        downr = setup("/objects/craftingtable");
    }
    
}
