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
public class LowestListener implements Listener {
    private final Timer timer;

    public LowestListener(Timer timer) {
        this.timer = timer;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockBreakEvent(BlockBreakEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerLoginEvent(PlayerLoginEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerJoinEvent(PlayerJoinEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerQuitEvent(PlayerQuitEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerKickEvent(PlayerKickEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockDamageEvent(BlockDamageEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockPistonRetractEvent(BlockPistonRetractEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockPistonExtendEvent(BlockPistonExtendEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockExpEvent(BlockExpEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockPlaceEvent(BlockPlaceEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void chunkLoadEvent(ChunkLoadEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void chunkUnloadEvent(ChunkUnloadEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerInteractEvent(PlayerInteractEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerChangedWorldEvent(PlayerChangedWorldEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void creatureSpawnEvent(CreatureSpawnEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerTeleportEvent(PlayerTeleportEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerMoveEvent(PlayerMoveEvent event) {
        timer.startTimer();
    }

//    @EventHandler(priority = EventPriority.LOWEST)
//    public void inventoryMoveItemEvent(InventoryMoveItemEvent event) {
//        timer.startTimer();
//    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void inventoryClickEvent(InventoryClickEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerDropItemEvent(PlayerDropItemEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void entityDeathEvent(EntityDeathEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockFormEvent(BlockFormEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void entityExplodeEvent(EntityExplodeEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void hangingBreakEvent(HangingBreakEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void playerPickupItemEvent(PlayerPickupItemEvent event) {
        timer.startTimer();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void inventoryCloseEvent(InventoryCloseEvent event) {
        timer.startTimer();
    }
}
