package main;

import entity.NPC_Oldman;
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
    
}

