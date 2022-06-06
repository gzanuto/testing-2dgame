package object;

import entity.Entity;
import main.GamePanel;
public class OBJ_Heart extends Entity {
    
    public OBJ_Heart(GamePanel gp) {
        
        super(gp);
        
        name = "Heart";

        image = setup("/objects/fulllife");
        image2 = setup("/objects/halflife");
        image3 = setup("/objects/nolife");
    }

}
