package entity;


import java.awt.image.BufferedImage;

public class Entity {
    
    public int worldX, worldY;
    public int speed;

    public BufferedImage upr, upl, downr, downl, leftr, leftl, rightr, rightl;
    public String direction;
    
    public int spriteCounter = 0;
    public int spriteNum = 1;
    

    
    
}
