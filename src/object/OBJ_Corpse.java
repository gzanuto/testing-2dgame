package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Corpse extends Entity {
    
    public OBJ_Corpse(GamePanel gp) {
        
        super(gp);
        
        name = "Corpse";
        downr = setup("/objects/corpse");
    }
    
}
