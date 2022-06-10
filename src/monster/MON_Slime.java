package monster;

import entity.Entity;
import main.GamePanel;

import java.util.Random;

public class MON_Slime extends Entity {

    public MON_Slime(GamePanel gp) {
        super(gp);

        type = 2;
        name = "Slime";
        speed = 1;
        maxLife = 2;
        life = maxLife;

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        getImage();
    }

    public void getImage() {
        upr = setup("/monster/monsterr");
        upl = setup("/monster/monsterl");
        downr = setup("/monster/monsterr");
        downl = setup("/monster/monsterl");
        leftr = setup("/monster/monsterr");
        leftl = setup("/monster/monsterl");
        rightr = setup("/monster/monsterr");
        rightl = setup("/monster/monsterl");
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
