package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenWallBack extends Entity {
    
    public OBJ_WoodenWallBack(GamePanel gp) {
        super(gp);
        
        name = "Wooden Wall Back";
        downr = setup("/objects/woodenwallback");
        collision = true;
    }
    
}
