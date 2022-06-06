package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Iron extends Entity {

    public OBJ_Iron(GamePanel gp) {
        
        super(gp);
        
        name = "Iron";
        downr = setup("/objects/iron");
        collision = true;
    }
    
}
