package com.andune.laghunter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * For testing only, not to be used in production.
 *
 * @author andune
 */
public class TestListener implements Listener {
    @EventHandler
    public void blockBreakEvent(BlockBreakEvent event) {
        try {
            // sleep for 0.5 second
            Thread.currentThread().sleep(500L);
        } catch (InterruptedException e) {
            // ignore exception
        }
    }
}
