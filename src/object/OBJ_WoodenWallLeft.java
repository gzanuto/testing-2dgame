package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenWallLeft extends Entity {
    
    public OBJ_WoodenWallLeft(GamePanel gp) {

        super(gp);
        
        name = "Wooden Wall Left";
        downr = setup("/objects/woodenwallleft");
        collision = true;

    }
    
}
