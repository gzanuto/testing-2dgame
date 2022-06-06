package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Hole extends Entity {
    
    public OBJ_Hole(GamePanel gp) {
        
        super(gp);
        
        name = "Hole";
        downr = setup("/objects/hole");
    }
    
}
