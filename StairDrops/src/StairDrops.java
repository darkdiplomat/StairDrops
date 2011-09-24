import java.util.logging.Logger;

public class StairDrops extends Plugin{
	String name = "StairDrops";
	String version = "1.0";
	String author = "Darkdiplomat";
	static Logger log = Logger.getLogger("Minecraft");

  public void initialize(){
    StairDropsListener listener = new StairDropsListener();
    etc.getLoader().addListener(PluginLoader.Hook.BLOCK_BROKEN, listener, this, PluginListener.Priority.MEDIUM);
  }

  public void enable(){
	  StairDropsProps.loadIni();
	  log.info(name + " version " + version + " by " + author + " is enabled!" );
  }

  public void disable(){
	  log.info(name + " version " + version + " is disabled!");
  }
}