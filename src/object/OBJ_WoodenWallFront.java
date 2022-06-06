package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenWallFront extends Entity {
    
    public OBJ_WoodenWallFront(GamePanel gp) {
        super(gp);
        
        name = "Wooden Wall Front";
        downr = setup("/objects/woodenwallfront");
        collision = true;
    }
    
}
