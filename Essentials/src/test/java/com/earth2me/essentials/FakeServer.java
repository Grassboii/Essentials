//package com.earth2me.essentials;
//
//import com.avaje.ebean.config.ServerConfig;
//
//import java.util.*;
//import java.util.concurrent.Callable;
//import java.util.concurrent.Future;
//import java.util.logging.Logger;
//import org.bukkit.Location;
//import org.bukkit.Server;
//import org.bukkit.World;
//import org.bukkit.World.Environment;
//import org.bukkit.command.CommandSender;
//import org.bukkit.command.PluginCommand;
//import org.bukkit.entity.Player;
//import org.bukkit.generator.ChunkGenerator;
//import org.bukkit.inventory.Recipe;
//import org.bukkit.map.MapView;
//import org.bukkit.plugin.Plugin;
//import org.bukkit.plugin.PluginManager;
//import org.bukkit.plugin.ServicesManager;
//import org.bukkit.scheduler.BukkitScheduler;
//import org.bukkit.scheduler.BukkitTask;
//import org.bukkit.scheduler.BukkitWorker;
//
//
//public class FakeServer implements Server
//{
//	private List<Player> players = new ArrayList<Player>();
//	private final List<World> worlds = new ArrayList<World>();
//
//	@Override
//	public String getGameVersion() {
//		return null;
//	}
//
//	public String getName()
//	{
//		return "Test Server";
//	}
//
//	@Override
//	public String getServerEnvironment() {
//		return null;
//	}
//
//	@Override
//	public String getPoseidonVersion() {
//		return null;
//	}
//
//	public String getVersion()
//	{
//		return "1.0";
//	}
//
//	public Player[] getOnlinePlayers()
//	{
//		return players.toArray(new Player[0]);
//	}
//
//	public void setOnlinePlayers(List<Player> players)
//	{
//		this.players = players;
//	}
//
//	public int getMaxPlayers()
//	{
//		return 100;
//	}
//
//	public int getPort()
//	{
//		return 25565;
//	}
//
//	public String getIp()
//	{
//		return "127.0.0.1";
//	}
//
//	public String getServerName()
//	{
//		return "Test Server";
//	}
//
//	public String getServerId()
//	{
//		return "Test Server";
//	}
//
//	public int broadcastMessage(String string)
//	{
//		int i = 0;
//		for (Player player : players)
//		{
//			player.sendMessage(string);
//			i++;
//		}
//		return i;
//	}
//
//	public String getUpdateFolder()
//	{
//		return "update";
//	}
//
//	public Player getPlayer(String string)
//	{
//		for (Player player : players)
//		{
//			if (player.getName().equalsIgnoreCase(string))
//			{
//				return player;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public Player getPlayer(UUID uuid) {
//		return null;
//	}
//
//	@Override
//	public Player getPlayerExact(String s) {
//		return null;
//	}
//
//	public List<Player> matchPlayer(String string)
//	{
//		List<Player> matches = new ArrayList<Player>();
//		for (Player player : players)
//		{
//			if (player.getName().substring(0, Math.min(player.getName().length(), string.length())).equalsIgnoreCase(string))
//			{
//				matches.add(player);
//			}
//		}
//		return matches;
//	}
//
//	public PluginManager getPluginManager()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public BukkitScheduler getScheduler()
//	{
//		return new BukkitScheduler() {
//
//			@Override
//			public int scheduleSyncDelayedTask(Plugin plugin, Runnable r, long l)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public int scheduleSyncDelayedTask(Plugin plugin, Runnable r)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public int scheduleSyncRepeatingTask(Plugin plugin, Runnable r, long l, long l1)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public int scheduleAsyncDelayedTask(Plugin plugin, Runnable r, long l)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public int scheduleAsyncDelayedTask(Plugin plugin, Runnable r)
//			{
//				r.run();
//				return 0;
//			}
//
//			@Override
//			public int scheduleAsyncRepeatingTask(Plugin plugin, Runnable r, long l, long l1)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public <T> Future<T> callSyncMethod(Plugin plugin, Callable<T> clbl)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public void cancelTask(int i)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public void cancelTasks(Plugin plugin)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public void cancelAllTasks()
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public boolean isCurrentlyRunning(int i)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public boolean isQueued(int i)
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public List<BukkitWorker> getActiveWorkers()
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//
//			@Override
//			public List<BukkitTask> getPendingTasks()
//			{
//				throw new UnsupportedOperationException("Not supported yet.");
//			}
//		};
//	}
//
//	public ServicesManager getServicesManager()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public List<World> getWorlds()
//	{
//		return worlds;
//	}
//
//	public World createWorld(String string, Environment e)
//	{
//		World w = new FakeWorld(string, e);
//		worlds.add(w);
//		return w;
//	}
//
//	public World createWorld(String string, Environment e, long l)
//	{
//		World w = new FakeWorld(string, e);
//		worlds.add(w);
//		return w;
//	}
//
//	public World getWorld(String string)
//	{
//		for (World world : worlds)
//		{
//			if (world.getName().equalsIgnoreCase(string)) {
//				return world;
//			}
//		}
//		return null;
//	}
//
//	public void reload()
//	{
//	}
//
//	public Logger getLogger()
//	{
//		return Logger.getLogger("Minecraft");
//	}
//
//	public PluginCommand getPluginCommand(String string)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public void savePlayers()
//	{
//	}
//
//	public boolean dispatchCommand(CommandSender cs, String string)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public void configureDbConfig(ServerConfig sc)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public boolean addRecipe(Recipe recipe)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public void addPlayer(Player base1)
//	{
//		players.add(base1);
//	}
//
//	public OfflinePlayer createPlayer(String name, IEssentials ess)
//	{
//		OfflinePlayer player = new OfflinePlayer(name, ess);
//		player.setLocation(new Location(worlds.get(0), 0, 0, 0, 0, 0));
//		return player;
//	}
//
//	public World createWorld(String string, Environment e, ChunkGenerator cg)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public World createWorld(String string, Environment e, long l, ChunkGenerator cg)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public boolean unloadWorld(String string, boolean bln)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public boolean unloadWorld(World world, boolean bln)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public Map<String, String[]> getCommandAliases()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public int getSpawnRadius()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public void setSpawnRadius(int i)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public boolean getOnlineMode()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public World getWorld(long l)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	public World getWorld(UUID uuid)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public int getViewDistance()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean getAllowNether()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean hasWhitelist()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public void setWhitelist(boolean b) {
//
//	}
//
//	@Override
//	public Set<org.bukkit.OfflinePlayer> getWhitelistedPlayers() {
//		return null;
//	}
//
//	@Override
//	public void reloadWhitelist() {
//
//	}
//
//	@Override
//	public MapView getMap(short s)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public MapView createMap(World world)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean getAllowFlight()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public void shutdown() {
//
//	}
//
//	@Override
//	public int broadcast(String s, String s1) {
//		return 0;
//	}
//
//	@Override
//	public org.bukkit.OfflinePlayer getOfflinePlayer(String s) {
//		return null;
//	}
//
//	@Override
//	public Set<String> getIPBans() {
//		return null;
//	}
//
//	@Override
//	public void banIP(String s) {
//
//	}
//
//	@Override
//	public void unbanIP(String s) {
//
//	}
//
//	@Override
//	public Set<org.bukkit.OfflinePlayer> getBannedPlayers() {
//		return null;
//	}
//}
