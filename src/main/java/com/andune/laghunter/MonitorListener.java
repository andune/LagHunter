package com.andune.laghunter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

/**
 * @author andune
 */
public class MonitorListener implements Listener {
    private final Timer timer;

    public MonitorListener(Timer timer) {
        this.timer = timer;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockBreakEvent(BlockBreakEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerLoginEvent(PlayerLoginEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerJoinEvent(PlayerJoinEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerQuitEvent(PlayerQuitEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerKickEvent(PlayerKickEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockDamageEvent(BlockDamageEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockPistonRetractEvent(BlockPistonRetractEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockPistonExtendEvent(BlockPistonExtendEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockExpEvent(BlockExpEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockPlaceEvent(BlockPlaceEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void chunkLoadEvent(ChunkLoadEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void chunkUnloadEvent(ChunkUnloadEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerInteractEvent(PlayerInteractEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerChangedWorldEvent(PlayerChangedWorldEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void creatureSpawnEvent(CreatureSpawnEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerTeleportEvent(PlayerTeleportEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerMoveEvent(PlayerMoveEvent event) {
        timer.stopTimer(event);
    }

//    @EventHandler(priority = EventPriority.MONITOR)
//    public void inventoryMoveItemEvent(InventoryMoveItemEvent event) {
//        timer.stopTimer(event);
//    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void inventoryClickEvent(InventoryClickEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerDropItemEvent(PlayerDropItemEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void entityDeathEvent(EntityDeathEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockFormEvent(BlockFormEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void entityExplodeEvent(EntityExplodeEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void hangingBreakEvent(HangingBreakEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerPickupItemEvent(PlayerPickupItemEvent event) {
        timer.stopTimer(event);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void inventoryCloseEvent(InventoryCloseEvent event) {
        timer.stopTimer(event);
    }

}
