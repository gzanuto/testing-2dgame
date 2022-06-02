package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import object.OBJ_Heart;
import object.OBJ_Key;
import object.SuperObject;


public class UI {
    
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    BufferedImage fulllife, halflife, nolife;
    public boolean messageOn = false;
    public String message = "";
    public int messageCounter = 0;
    public String currentDialogue = "";
    public int commandNum = 0;
    
    public UI(GamePanel gp) {
        this.gp = gp;
        
        arial_40 = new Font("Arial", Font.PLAIN, 40);
        
        SuperObject heart = new OBJ_Heart(gp);
        fulllife = heart.image;
        halflife = heart.image2;
        nolife = heart.image3;
    }
    
    public void showMessage(String text) {
        
        message = text;
        messageOn = true;
        
    }
    
    public void draw(Graphics2D g2) {
        
        this.g2 = g2;
        
        g2.setFont(arial_40);
        g2.setColor(Color.white);
        
        if(gp.gameState == gp.titleState) {
            drawTitleScreen();
        }
        
        if(gp.gameState == gp.playState) {
            drawPlayerLife();
            
        }
        if(gp.gameState == gp.pauseState) {
            drawPauseScreen();
            drawPlayerLife();
            
        }
        if (gp.gameState == gp.dialogueState) {
            drawDialogueScreen();
            drawPlayerLife();
            
        }
    }
    
    public void drawPlayerLife() {
        
//        gp.player.life = 7;
        
        int x = gp.tileSize/2;
        int y = gp.tileSize/2;
        int i = 0;
        
        while(i < gp.player.maxLife/2) {
            g2.drawImage(nolife, x, y, null);
            i++;
            x+= gp.tileSize;
        }
        
        x = gp.tileSize/2;
        y = gp.tileSize/2;
        i = 0;
        
        while(i < gp.player.life) {
            g2.drawImage(halflife, x, y, null);
            i++;
            if(i < gp.player.life) {
                g2.drawImage(fulllife, x, y, null);
            }
            i++;
            x += gp.tileSize;
                   
        }
    }
    
    public void drawTitleScreen() {
        
        g2.setColor(new Color(0, 0, 0));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
        
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 84F));
        String text = "Zeldinha do Bielga";
        int x = getXforCenteredText(text);
        int y = gp.tileSize*3;
        
        
        g2.setColor(Color.gray);
        g2.drawString(text, x+5, y+5);
        
        g2.setColor(Color.white);
        g2.drawString(text, x, y);
        
        x = gp.screenWidth/2 - (gp.tileSize*2)/2;
        y += gp.tileSize*2;
        g2.drawImage(gp.player.downr, x, y, gp.tileSize*2, gp.tileSize*2, null);
        
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 40F));
        
        text = "NEW GAME";
        x = getXforCenteredText(text);
        y +=gp.tileSize*3.5;
        g2.drawString(text, x, y);
        if(commandNum == 0) {
            g2.drawString(">", x-gp.tileSize, y);
        }
        
        text = "LOAD GAME";
        x = getXforCenteredText(text);
        y +=gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 1) {
            g2.drawString(">", x-gp.tileSize, y);
        }
        
        text = "QUIT";
        x = getXforCenteredText(text);
        y +=gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 2) {
            g2.drawString(">", x-gp.tileSize, y);
        }
    }
    public void drawPauseScreen() {

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 80F));
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        
        int y = gp.screenHeight/2;
        
        g2.drawString(text, x, y);
        
    }
    
    public void drawDialogueScreen() {
        int x = gp.tileSize*2;
        int y = gp.tileSize/2;
        int width = gp.screenWidth - (gp.tileSize*4);
        int height = gp.tileSize*4;
        
        drawSubWindow(x, y, width, height);
        
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 28F));
        x += gp.tileSize;
        y += gp.tileSize;
        
        for(String line: currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }
        
    }
    
    public void drawSubWindow(int x, int y, int width, int height) {
        
        Color c =  new Color(0, 0, 0, 210);
        g2.setColor(c);
        g2.fillRoundRect(x, y, width, height, 35, 35);
        
        c = new Color(255, 255, 255);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(x+5, y+5, width-10, height-10, 25, 25);
    }
    
    public int getXforCenteredText(String text) {
        
        int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth/2 - length/2;
        return x;
    }
}
