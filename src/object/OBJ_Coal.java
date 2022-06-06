package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Coal extends Entity {

    public OBJ_Coal(GamePanel gp) {
        
        super(gp);
        
        name = "Coal";
        downr = setup("/objects/coal");
    }
    
}
