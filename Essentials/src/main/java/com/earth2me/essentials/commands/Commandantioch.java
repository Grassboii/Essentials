package com.earth2me.essentials.commands;

import com.earth2me.essentials.TargetBlock;
import com.earth2me.essentials.User;
import com.johnymuffin.beta.fundamentals.simplejson.JSONArray;
import net.minecraft.server.ItemStack;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.entity.TNTPrimed;
import org.json.simple.JSONObject;


public class Commandantioch extends EssentialsCommand {
    public Commandantioch() {
        super("antioch");
    }

    @Override
    public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception {
        ess.broadcastMessage(user, "...lobbest thou thy Holy Hand Grenade of Antioch towards thy foe,");
        ess.broadcastMessage(user, "who being naughty in My sight, shall snuff it.");

        final Location loc = new TargetBlock(user).getTargetBlock().getLocation();
        loc.getWorld().spawn(loc, TNTPrimed.class);
    }

}
