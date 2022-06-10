package main;

import entity.NPC_Oldman;
import monster.MON_Slime;
import object.OBJ_Chest;


public class AssetSetter {
    
    GamePanel gp;
    
    public AssetSetter(GamePanel gp) {
        
        this.gp = gp;
        
    }
    
    public void setObject() {
        gp.obj[0] = new OBJ_Chest(gp);
        gp.obj[0].worldX = gp.tileSize*25;
        gp.obj[0].worldY = gp.tileSize*24;
       
    }
    public void setNPC() {
        
        gp.npc[0] = new NPC_Oldman(gp);
        gp.npc[0].worldX = gp.tileSize*27;
        gp.npc[0].worldY = gp.tileSize*27;
        
    }

    public void setMonster() {

        gp.monster[0] = new MON_Slime(gp);
        gp.monster[0].worldX = gp.tileSize*23;
        gp.monster[0].worldY = gp.tileSize*23;

    }
    
}

