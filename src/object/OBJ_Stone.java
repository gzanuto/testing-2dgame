package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Stone extends Entity {

    public OBJ_Stone(GamePanel gp) {
        
        super(gp);
        
        name = "Stone";
        downr = setup("/objects/stone");
        collision = true;
    }
    
}
