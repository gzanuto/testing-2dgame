package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenDoorBack extends Entity {
    
    public OBJ_WoodenDoorBack(GamePanel gp) {

        super(gp);
        
        name = "Wooden Door Back";
        downr = setup("/objects/woodendoorback");
        collision = true;
    }
    
}
