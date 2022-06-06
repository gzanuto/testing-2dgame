package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenWallRight extends Entity {
    
    public OBJ_WoodenWallRight(GamePanel gp) {

        super(gp);
        
        name = "Wooden Wall Right";
        downr = setup("/objects/woodenwallright");
        collision = true;

    }
    
}
