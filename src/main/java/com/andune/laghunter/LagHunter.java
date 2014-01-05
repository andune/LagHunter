package com.andune.laghunter;

import com.andune.minecraft.commonlib.JarUtils;
import com.andune.minecraft.commonlib.Logger;
import com.andune.minecraft.commonlib.LoggerFactory;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author andune
 */
public class LagHunter extends JavaPlugin {
    private Logger log;

    private JarUtils jarUtils;
    private String buildNumber = "unknown";
    private Timer timer;
    private TickMonitor tickMonitor;

    @Override
    public void onEnable() {
        LoggerFactory.setLoggerPrefix("[LagHunter] ");
        log = LoggerFactory.getLogger(LagHunter.class);

        jarUtils = new JarUtils(getDataFolder(), getFile());
        buildNumber = jarUtils.getBuild();

        timer = new Timer();
        timer.setLimitMillis(250);
        getServer().getPluginManager().registerEvents(new LowestListener(timer), this);
        getServer().getPluginManager().registerEvents(new MonitorListener(timer), this);

        // TEST ONLY
//        getServer().getPluginManager().registerEvents(new TestListener(), this);

        tickMonitor = new TickMonitor();
        getServer().getScheduler().scheduleSyncRepeatingTask(this, tickMonitor, 0, 1);

        log.info("version " + getDescription().getVersion() + ", build " + buildNumber + " is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getScheduler().cancelTasks(this);
        log.info("version " + getDescription().getVersion() + ", build " + buildNumber + " is disabled");
    }
}
