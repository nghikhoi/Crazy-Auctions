package me.badbones69.crazyauctions.api.objects;

import me.badbones69.crazyauctions.api.managers.TimeManager;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class BidItem {
    
    private UUID ownerUUID;
    private String ownerName;
    private UUID storeID;
    private ItemStack item;
    private TopBidder topBidder;
    private long price;
    private long expireTime;
    
    public BidItem(Player owner, ItemStack item, long price) {
        ownerUUID = owner.getUniqueId();
        ownerName = owner.getName();
        storeID = UUID.randomUUID();
        topBidder = new TopBidder();
        this.item = item;
        this.price = price;
        expireTime = TimeManager.BID_TIME.getTime().getTimeInMillis();
    }
    
    public BidItem(UUID ownerUUID, String ownerName, UUID storeID, TopBidder topBidder, ItemStack item, long price, long expireTime) {
        this.ownerUUID = ownerUUID;
        this.ownerName = ownerName;
        this.storeID = storeID;
        this.topBidder = topBidder;
        this.item = item;
        this.price = price;
        this.expireTime = expireTime;
    }
    
    public UUID getOwnerUUID() {
        return ownerUUID;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public UUID getStoreID() {
        return storeID;
    }
    
    public TopBidder getTopBidder() {
        return topBidder;
    }
    
    public ItemStack getItem() {
        return item;
    }
    
    public long getPrice() {
        return price;
    }
    
    public long getExpireTime() {
        return expireTime;
    }
    
}