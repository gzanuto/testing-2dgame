package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Tree extends Entity {
    
    public OBJ_Tree(GamePanel gp) {
        
        super(gp);

        
        name = "Tree";
        downr = setup("/objects/tree");
        collision = true;
    }
    
}
