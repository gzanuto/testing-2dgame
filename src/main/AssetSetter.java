package main;

import object.OBJ_Chest;
import object.OBJ_CraftingTable;
import object.OBJ_Key;
import object.OBJ_WoodenDoorBack;
import object.OBJ_WoodenDoorFront;
import object.OBJ_WoodenDoorLeft;
import object.OBJ_WoodenDoorRight;
import object.OBJ_WoodenFloor;
import object.OBJ_WoodenWallBack;
import object.OBJ_WoodenWallFront;
import object.OBJ_WoodenWallLeft;
import object.OBJ_WoodenWallRight;


public class AssetSetter {
    
    GamePanel gp;
    
    public AssetSetter(GamePanel gp) {
        
        this.gp = gp;
        
    }
    
    public void setObject() {
        
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 45 * gp.tileSize;
        gp.obj[0].worldY = 48 * gp.tileSize;
        
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 44 * gp.tileSize;
        gp.obj[0].worldY = 48 * gp.tileSize;
        
        
        gp.obj[1] = new OBJ_Chest();
        gp.obj[1].worldX = 47 * gp.tileSize;
        gp.obj[1].worldY = 47 * gp.tileSize;
        
        
        
        
        
    }
    
}
