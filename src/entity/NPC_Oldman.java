package entity;

import java.util.Random;
import main.GamePanel;


public class NPC_Oldman extends Entity {
    
    public NPC_Oldman(GamePanel gp) {
        super(gp);
        
        direction = "down";
        speed = 1;
        
        getImage();
    }
    
    public void getImage() {
        
         upr = setup("/npc/blacksmithback");
         upl = setup("/npc/blacksmithback");
         downr = setup("/npc/blacksmithfront");
         downl = setup("/npc/blacksmithfront");
         leftr = setup("/npc/blacksmithleft");
         leftl = setup("/npc/blacksmithleft");
         rightr = setup("/npc/blacksmithright");
         rightl = setup("/npc/blacksmithright");
         
    }
    
    public void setAction() {
        
        actionLockCounter ++;
        if(actionLockCounter == 120) {
            
            Random random = new Random();
            int i = random.nextInt(100) +1;
        
            if(i <= 25) {
                direction = "up";
            }
            if(i > 25 && i <= 50) {
                direction = "down";
            }
            if(i > 50 && i <= 75) {
                direction = "left";
            }
            if(i > 75 && i <= 100) {
                direction = "right";
            }
        
            actionLockCounter = 0;
        }
    }
    
}
