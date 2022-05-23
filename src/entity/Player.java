package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import main.UtilityTool;

public class Player extends Entity {
    
    GamePanel gp;
    KeyHandler keyH;
    
    public final int screenX;
    public final int screenY;
    
    //public int hasKey = 0;
    
    
    public Player(GamePanel gp, KeyHandler keyH) {
        
        this.gp = gp;
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
    }

    public void getPlayerImage() {
        
         upr = setup("upr");
         upl = setup("upl");
         downr = setup("downr");
         downl = setup("downl");
         leftr = setup("leftr");
         leftl = setup("leftl");
         rightr = setup("rightr");
         rightl = setup("rightl");
         
    }
    
    public BufferedImage setup(String imageName) {
        
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
                 try {
            image = ImageIO.read(getClass().getResourceAsStream("/player/" + imageName + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            
            e.printStackTrace();
        }
                 return image;
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
    }
    public void pickUpObject(int i) {
        
        if(i != 999) {
            
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
        
        g2.drawImage(image, screenX, screenY, null);

        
        
    }
    
}
