package entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import main.UtilityTool;

public class Player extends Entity {
    
    
    KeyHandler keyH;
    
    public final int screenX;
    public final int screenY;
    
    //public int hasKey = 0;
    
    
    public Player(GamePanel gp, KeyHandler keyH) {
        
        super(gp);
        
        this.keyH = keyH;
        
        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);
        
        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 32;
        solidArea.height = 32;
        
        
        setDefaultValues();
        getPlayerImage();

        
    }
    
    public void setDefaultValues() {
        
        worldX = gp.tileSize * 25;
        worldY = gp.tileSize * 25;
        speed = 2;
        direction = "down";
        maxLife = 10;
        life = maxLife;
    }
    

    public void getPlayerImage() {
        
         upr = setup("/player/upr");
         upl = setup("/player/upl");
         downr = setup("/player/downr");
         downl = setup("/player/downl");
         leftr = setup("/player/leftr");
         leftl = setup("/player/leftl");
         rightr = setup("/player/rightr");
         rightl = setup("/player/rightl");
         
    }
    
    public void update () {
        
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true) {
            
            if(keyH.upPressed == true) {
            direction = "up";
            
            }
            else if(keyH.downPressed == true) {
            direction = "down";
            
            }
            else if(keyH.leftPressed == true) {
            direction = "left";
            
            }
            else if(keyH.rightPressed == true) {
            direction = "right";
            
            }
            
            collisionOn = false;
            gp.cChecker.checkTile(this);
            
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);
            
            int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            int monsterIndex = gp.cChecker.checkEntity(this, gp.monster);
            contactMonster(monsterIndex);

            gp.eHandler.checkEvent();

            gp.keyH.enterPressed = false;
            
            if(collisionOn == false) {
                
                switch(direction) {
                case "up":
                    worldY -= speed;
                    break;  
                case "down":
                    worldY += speed;
                    break;
                case "left":
                    worldX -= speed;
                    break;
                case "right":
                    worldX += speed;
                    break;
                }
            }
        
            spriteCounter++;
            if (spriteCounter > 10) {
                if(spriteNum == 1) {
                spriteNum = 2;
                }
                else if (spriteNum == 2) {
                spriteNum = 1;
                }
                spriteCounter = 0;
            }
        
        }

        if(invincible == true) {
            invincibleCounter++;
            if(invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }

    }
    public void pickUpObject(int i) {
        
        if(i != 999) {
            
        }
        
    }
    
    public void interactNPC(int i) {
        if (i != 999) {
            if(gp.keyH.enterPressed == true) {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak();
            }
        }
    }

    public void contactMonster(int i) {

        if (i != 999) {
            if(invincible ==false) {
                life -= 1;
                invincible = true;
            }
        }

    }
    
    public void draw(Graphics2D g2) {
        
        BufferedImage image = null;
        
        switch(direction) {
            
        case "up":
            if(spriteNum == 1) {
                image = upr;
            }
            if (spriteNum == 2) {
                image = upl;
            }
                
            break;
        case "down":
            if(spriteNum == 1) {
                image = downr;
            }
            if (spriteNum == 2) {
                image = downl;
            }
                
            break;
        case "left":
            if(spriteNum == 1) {
                image = leftr;
            }
            if (spriteNum == 2) {
                image = leftl;
            }
                
            break;
        case "right":
            if(spriteNum == 1) {
                image = rightr;
            }
            if (spriteNum == 2) {
                image = rightl;
            }
                
            break;
                
        }

        if(invincible == true) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        }

        g2.drawImage(image, screenX, screenY, null);

        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

//        g2.setFont(new Font("Arial", Font.PLAIN, 26));
//        g2.setColor(Color.white);
//        g2.drawString("Invincible: "+invincibleCounter, 10, 400);
    }
    
}
