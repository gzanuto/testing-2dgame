package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Gold extends Entity {
    
    public OBJ_Gold(GamePanel gp) {
        
        super(gp);
        
        name = "Gold";
        downr = setup("/objects/gold");

    }
    
}
