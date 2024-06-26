package com.earth2me.essentials;

import org.bukkit.*;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.List;
import java.util.UUID;


public class FakeWorld implements World {

    private final String name;
    private final Environment env;

    FakeWorld(String string, Environment environment) {
        this.name = string;
        this.env = environment;
    }

    public Block getBlockAt(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Block getBlockAt(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getBlockTypeIdAt(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getBlockTypeIdAt(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getHighestBlockYAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getHighestBlockYAt(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chunk getChunkAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chunk getChunkAt(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chunk getChunkAt(Block block) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isChunkLoaded(Chunk chunk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chunk[] getLoadedChunks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void loadChunk(Chunk chunk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isChunkLoaded(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void loadChunk(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean loadChunk(int i, int i1, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadChunk(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadChunk(int i, int i1, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadChunk(int i, int i1, boolean bln, boolean bln1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadChunkRequest(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean unloadChunkRequest(int i, int i1, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean regenerateChunk(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean refreshChunk(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Item dropItem(Location lctn, ItemStack is) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Item dropItemNaturally(Location lctn, ItemStack is) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Arrow spawnArrow(Location lctn, Vector vector, float f, float f1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean generateTree(Location lctn, TreeType tt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean generateTree(Location lctn, TreeType tt, BlockChangeDelegate bcd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LivingEntity spawnCreature(Location lctn, CreatureType ct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LightningStrike strikeLightning(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LightningStrike strikeLightningEffect(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Entity> getEntities() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<LivingEntity> getLivingEntities() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Player> getPlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        return name;
    }

    public long getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Location getSpawnLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean setSpawnLocation(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long getTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTime(long l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long getFullTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFullTime(long l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hasStorm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setStorm(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getWeatherDuration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setWeatherDuration(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isThundering() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setThundering(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getThunderDuration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setThunderDuration(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Environment getEnvironment() {
        return env;
    }

    public long getSeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getPVP() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPVP(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean createExplosion(double d, double d1, double d2, float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean createExplosion(Location lctn, float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ChunkGenerator getGenerator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<BlockPopulator> getPopulators() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playEffect(Location lctn, Effect effect, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playEffect(Location lctn, Effect effect, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean createExplosion(double d, double d1, double d2, float f, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean createExplosion(double v, double v1, double v2, float v3, boolean b, EntityDamageEvent.DamageCause damageCause) {
        return false;
    }

    public boolean createExplosion(Location lctn, float f, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean createExplosion(Location location, float v, boolean b, EntityDamageEvent.DamageCause damageCause) {
        return false;
    }

    public <T extends Entity> T spawn(Location lctn, Class<T> type) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ChunkSnapshot getEmptyChunkSnapshot(int i, int i1, boolean bln, boolean bln1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSpawnFlags(boolean bln, boolean bln1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getAllowAnimals() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getAllowMonsters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UUID getUID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Block getHighestBlockAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Block getHighestBlockAt(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public Biome getBiome(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getTemperature(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getHumidity(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean unloadChunk(Chunk chunk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getKeepSpawnInMemory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setKeepSpawnInMemory(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isAutoSave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAutoSave(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
