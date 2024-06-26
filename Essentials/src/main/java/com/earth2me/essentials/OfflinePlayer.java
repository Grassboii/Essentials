package com.earth2me.essentials;

import com.projectposeidon.ConnectionType;
import net.minecraft.server.Packet;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;


public class OfflinePlayer implements Player {
    final transient IEssentials ess;
    private final String name;
    private Location location = new Location(null, 0, 0, 0, 0, 0);
    private World world;
    private final UUID uniqueId = UUID.randomUUID();

    public OfflinePlayer(String name, IEssentials ess) {
        this.name = name;
        this.ess = ess;
        this.world = ess.getServer().getWorlds().get(0);
    }

    public boolean isOnline() {
        return false;
    }

    public boolean isOp() {
        return false;
    }

    public void setOp(boolean bln) {
    }

    public void sendMessage(String string) {
    }

    public String getDisplayName() {
        return name;
    }

    public void setDisplayName(String string) {
    }

    public InetSocketAddress getAddress() {
        return null;
    }

    public void kickPlayer(String string) {
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Override
    public void setBanned(boolean b) {

    }

    @Override
    public boolean isWhitelisted() {
        return false;
    }

    @Override
    public void setWhitelisted(boolean b) {

    }

    public PlayerInventory getInventory() {
        return null;
    }

    public ItemStack getItemInHand() {
        return null;
    }

    public void setItemInHand(ItemStack is) {
    }

    public int getHealth() {
        return 0;
    }

    public void setHealth(int i) {
    }

    public Egg throwEgg() {
        return null;
    }

    public Snowball throwSnowball() {
        return null;
    }

    public Arrow shootArrow() {
        return null;
    }

    public boolean isInsideVehicle() {
        return false;
    }

    public boolean leaveVehicle() {
        return false;
    }

    public Vehicle getVehicle() {
        return null;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location loc) {
        location = loc;
        world = loc.getWorld();
    }

    public World getWorld() {
        return world;
    }

    public void teleportTo(Location lctn) {
    }

    public void teleportTo(Entity entity) {
    }

    public int getEntityId() {
        return -1;
    }

    public boolean performCommand(String string) {
        return false;
    }

    public boolean isPlayer() {
        return false;
    }

    public int getRemainingAir() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setRemainingAir(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getMaximumAir() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setMaximumAir(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean isSneaking() {
        return false;
    }

    public void setSneaking(boolean bln) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void updateInventory() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void chat(String string) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public double getEyeHeight() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public double getEyeHeight(boolean bln) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public List<Block> getLineOfSight(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Block getTargetBlock(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getFireTicks() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setFireTicks(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getMaxFireTicks() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void remove() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Server getServer() {
        return ess == null ? null : ess.getServer();
    }

    public Vector getMomentum() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setMomentum(Vector vector) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Vector getVelocity() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setVelocity(Vector vector) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void damage(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void damage(int i, Entity entity) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Location getEyeLocation() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void sendRawMessage(String string) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Location getCompassTarget() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setCompassTarget(Location lctn) {
    }

    public int getMaximumNoDamageTicks() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setMaximumNoDamageTicks(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getLastDamage() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setLastDamage(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getNoDamageTicks() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setNoDamageTicks(int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean teleport(Location lctn) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean teleport(Entity entity) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public Entity getPassenger() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean setPassenger(Entity entity) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean eject() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void saveData() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void loadData() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean isSleeping() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public int getSleepTicks() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public List<Entity> getNearbyEntities(double d, double d1, double d2) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean isDead() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public float getFallDistance() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setFallDistance(float f) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean isSleepingIgnored() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setSleepingIgnored(boolean bln) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void awardAchievement(Achievement a) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void incrementStatistic(Statistic ststc) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void incrementStatistic(Statistic ststc, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void incrementStatistic(Statistic ststc, Material mtrl) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void incrementStatistic(Statistic ststc, Material mtrl, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void playNote(Location lctn, byte b, byte b1) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void sendBlockChange(Location lctn, Material mtrl, byte b) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void sendBlockChange(Location lctn, int i, byte b) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public EntityDamageEvent getLastDamageCause() {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void setLastDamageCause(EntityDamageEvent ede) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public void playEffect(Location lctn, Effect effect, int i) {
        throw new UnsupportedOperationException(Util.i18n("notSupportedYet"));
    }

    public boolean sendChunkChange(Location lctn, int i, int i1, int i2, byte[] bytes) {
        return true;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    @Override
    public UUID getPlayerUUID() {
        return null;
    }

    public void playNote(Location lctn, Instrument i, Note note) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPlayerTime(long l, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long getPlayerTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long getPlayerTimeOffset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isPlayerTimeRelative() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ConnectionType getConnectionType() {
        return null;
    }

    @Override
    public boolean hasReceivedPacket0() {
        return false;
    }

    @Override
    public boolean isUsingReleaseToBeta() {
        return false;
    }

    public void resetPlayerTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hidePlayer(Player player) {

    }

    @Override
    public void showPlayer(Player player) {

    }

    @Override
    public boolean canSee(Player player) {
        return false;
    }

    @Override
    public void sendPacket(Player player, Packet packet) {

    }

    public boolean isPermissionSet(String string) {
        return false;
    }

    public boolean isPermissionSet(Permission prmsn) {
        return false;
    }

    public boolean hasPermission(String string) {
        return false;
    }

    public boolean hasPermission(Permission prmsn) {
        return false;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PermissionAttachment addAttachment(Plugin plugin, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeAttachment(PermissionAttachment pa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void recalculatePermissions() {
    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendMap(MapView mv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
