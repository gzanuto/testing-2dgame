package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;

public class Player extends Entity {
    
    GamePanel gp;
    KeyHandler keyH;
    
    public final int screenX;
    public final int screenY;
    
    
    public Player(GamePanel gp, KeyHandler keyH) {
        
        this.gp = gp;
        this.keyH = keyH;
        
        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);
        
        
        setDefaultValues();
        getPlayerImage();

        
    }
    
    public void setDefaultValues() {
        
        worldX = gp.tileSize * 10;
        worldY = gp.tileSize * 15;
        speed = 2;
        direction = "down";
    }

    public void getPlayerImage() {
        
        try {
            
            upr = ImageIO.read(getClass() .getResourceAsStream("/player/upr.png"));
            upl = ImageIO.read(getClass() .getResourceAsStream("/player/upl.png"));
            downr = ImageIO.read(getClass() .getResourceAsStream("/player/downr.png"));
            downl = ImageIO.read(getClass() .getResourceAsStream("/player/downl.png"));
            leftr = ImageIO.read(getClass() .getResourceAsStream("/player/leftr.png"));
            leftl = ImageIO.read(getClass() .getResourceAsStream("/player/leftl.png"));
            rightr = ImageIO.read(getClass() .getResourceAsStream("/player/rightr.png"));
            rightl = ImageIO.read(getClass() .getResourceAsStream("/player/rightl.png"));


        } catch(IOException e) {
            
            e.printStackTrace();
        }
    }
    
    public void update () {
        
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true) {
            
            if(keyH.upPressed == true) {
            direction = "up";
            worldY -= speed;
            }
            else if(keyH.downPressed == true) {
            direction = "down";
            worldY += speed;
            }
            else if(keyH.leftPressed == true) {
            direction = "left";
            worldX -= speed;
            }
            else if(keyH.rightPressed == true) {
            direction = "right";
            worldX += speed;
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
        
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

        
        
    }
    
}
