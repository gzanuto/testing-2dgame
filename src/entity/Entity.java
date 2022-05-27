package entity;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;
import main.UtilityTool;

public class Entity {
    
    GamePanel gp;
    public int worldX, worldY;
    public int speed;

    public BufferedImage upr, upl, downr, downl, leftr, leftl, rightr, rightl;
    public String direction;
    
    public int spriteCounter = 0;
    public int spriteNum = 1;
    
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false;
    public int actionLockCounter = 0;
    
    public Entity(GamePanel gp) {
        this.gp = gp;
    }
    
    public void setAction() {
        
        
    }
    
    public void update() {
        
        setAction();
        
        collisionOn = false;
        gp.cChecker.checkTile(this);
        gp.cChecker.checkObject(this, false);
        gp.cChecker.checkPlayer(this);
        
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
    
    public void draw(Graphics2D g2) {
        
        BufferedImage image = null;
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
            
        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&     
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
            
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
    
    public BufferedImage setup(String imagePath) {
        
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
                 try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            
            e.printStackTrace();
        }
                 return image;
    }

}
