public class StairDropsListener extends PluginListener {
	public boolean onBlockBreak(Player player, Block block){
		if (player.canUseCommand("/stairs")){
			int iih = player.getItemInHand();
			int w = player.getLocation().dimension;
			if (block.getType() == 53){ // WoodStairs
				if (etc.getLoader().getPlugin("Realms")!=null) {
					if (etc.getLoader().getPlugin("Realms").isEnabled()) {
						boolean permission = (Boolean)etc.getLoader().callCustomHook("Realms-PermissionCheck", new Object[] {"destroy", player, block});
						if (permission){
							if (getItemCanBreak(iih)){
								etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 53);
								block.setType(0);
								block.update();
								return true;
							}
						}
					}else if (getItemCanBreak(iih)){
						etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 53);
						block.setType(0);
						block.update();
						return true;
					}
				}
			}else if (block.getType() == 67){//Stone Stairs
				if (etc.getLoader().getPlugin("Realms")!=null) {
					if (etc.getLoader().getPlugin("Realms").isEnabled()) {
						boolean permission = (Boolean)etc.getLoader().callCustomHook("Realms-PermissionCheck", new Object[] {"destroy", player, block});
						if (permission){
							if (getItemCanBreak(iih)){
								etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 67);
								block.setType(0);
								block.update();
								return true;
							}
						}
					}else if (getItemCanBreak(iih)){
						etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 67);
						block.setType(0);
						block.update();
						return true;
					}
				}
			}else if (block.getType() == 108){//Brick Stairs MC
				if (etc.getLoader().getPlugin("Realms")!=null) {
					if (etc.getLoader().getPlugin("Realms").isEnabled()) {
						boolean permission = (Boolean)etc.getLoader().callCustomHook("Realms-PermissionCheck", new Object[] {"destroy", player, block});
						if (permission){
							if (getItemCanBreak(iih)){
								etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 108);
								block.setType(0);
								block.update();
								return true;
							}
						}
					}else if (getItemCanBreak(iih)){
						etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 108);
						block.setType(0);
						block.update();
						return true;
					}
				}
			}else if (block.getType() == 109){//Stone Brick Stairs
				if (etc.getLoader().getPlugin("Realms")!=null) {
					if (etc.getLoader().getPlugin("Realms").isEnabled()) {
						boolean permission = (Boolean)etc.getLoader().callCustomHook("Realms-PermissionCheck", new Object[] {"destroy", player, block});
						if (permission){
							if (getItemCanBreak(iih)){
								etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 109);
								block.setType(0);
								block.update();
								return true;
							}
						}
					}else if (getItemCanBreak(iih)){
						etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 109);
						block.setType(0);
						block.update();
						return true;
					}
				}
			}else if (block.getType() == 112){//Nether Brick Stairs
				if (etc.getLoader().getPlugin("Realms")!=null) {
					if (etc.getLoader().getPlugin("Realms").isEnabled()) {
						boolean permission = (Boolean)etc.getLoader().callCustomHook("Realms-PermissionCheck", new Object[] {"destroy", player, block});
						if (permission){
							if (getItemCanBreak(iih)){
								etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 109);
								block.setType(0);
								block.update();
								return true;
							}
						}
					}else if (getItemCanBreak(iih)){
						etc.getServer().getWorld(w).dropItem(block.getX(), block.getY(), block.getZ(), 109);
						block.setType(0);
						block.update();
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean getItemCanBreak(int ID){
		switch (ID){
			case 257: //Iron Pickaxe
				return StairDropsProps.getIronPick();
			case 270: //Wood Pickaxe
				return StairDropsProps.getWoodPick();
			case 274: //Stone Pickaxe
				return StairDropsProps.getStonePick();
			case 278: //Diamond Pickaxe
				return StairDropsProps.getDiamondPick();
			case 285: //Gold Pickaxe
				return StairDropsProps.getGoldPick();
			default:
				return false;
		}
	}
}