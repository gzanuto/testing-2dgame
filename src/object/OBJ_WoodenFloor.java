package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenFloor extends Entity {

    public OBJ_WoodenFloor(GamePanel gp) {

        super(gp);
        
        name = "Wooden Floor";
        downr = setup("/objects/woodenfloor");
    }
    
}
