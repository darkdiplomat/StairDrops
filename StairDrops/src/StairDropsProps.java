import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StairDropsProps {
	private static String INIFILE = "plugins/config/TreeDrops/TreeDropsConfig.ini";
	static Logger log = Logger.getLogger("Minecraft");
	static String UseWoodPick = "true";
	static String UseStonePick = "true";
	static String UseIronPick = "true";
	static String UseGoldPick = "true";
	static String UseDiamondPick = "true";
	
	public static boolean getWoodPick(){
		boolean WoodPick = Boolean.parseBoolean(UseWoodPick);
		return WoodPick;
	}
	
	public static boolean getStonePick(){
		boolean StonePick = Boolean.parseBoolean(UseStonePick);
		return StonePick;
	}
	
	public static boolean getIronPick(){
		boolean IronPick = Boolean.parseBoolean(UseIronPick);
		return IronPick;
	}
	
	public static boolean getGoldPick(){
		boolean GoldPick = Boolean.parseBoolean(UseGoldPick);
		return GoldPick;
	}
	
	public static boolean getDiamondPick(){
		boolean DiamondPick = Boolean.parseBoolean(UseDiamondPick);
		return DiamondPick;
	}
	
	public static void loadIni() {
		File inifile = new File(INIFILE);
		if (inifile.exists()) {
			try {				
				Properties iniSettings = new Properties();
				iniSettings.load(new FileInputStream(inifile));
				UseWoodPick = iniSettings.getProperty("Use-Wood_Pickaxe", UseWoodPick);
				UseStonePick = iniSettings.getProperty("Use-Stone_Pickaxe", UseStonePick);
				UseIronPick = iniSettings.getProperty("Use-Iron_Pickaxe", UseIronPick);
				UseGoldPick = iniSettings.getProperty("Use-Gold_Pickaxe", UseGoldPick);
				UseDiamondPick = iniSettings.getProperty("Use-Diamond_Pickaxe", UseDiamondPick);
			}catch (Exception e) {
				log.log(Level.SEVERE, "[TreeDrops] file load failed, using defaults.");
			}
			createIni();
		}else {
			createIni();
		}
	}
	public static void createIni() {
		File inifile = new File(INIFILE);
		try {
			inifile.getParentFile().mkdirs();
			BufferedWriter outChannel = new BufferedWriter(new FileWriter(inifile));
			outChannel.write("Use-Wood_Pickaxe = " + UseWoodPick); outChannel.newLine();
			outChannel.write("Use-Stone_Pickaxe = " + UseStonePick); outChannel.newLine();
			outChannel.write("Use-Iron_Pickaxe = " + UseIronPick); outChannel.newLine();
			outChannel.write("Use-Gold_Pickaxe = " + UseGoldPick); outChannel.newLine();
			outChannel.write("Use-Diamond_Pickaxe = " + UseDiamondPick); outChannel.newLine();
			outChannel.close();
		} catch (Exception e) {
			log.log(Level.SEVERE, "[TreeDrops] file creation failed, using defaults.");
		}
	}

}
