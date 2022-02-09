package fr.katsuo;

import fr.katsuo.event.Listener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Booty {

    public static void main(String[] args) throws Exception {
        JDABuilder builder = JDABuilder.createDefault(Secret.TOKEN);
        builder.addEventListeners(new Listener());
        builder.setActivity(Activity.of(Activity.ActivityType.CUSTOM_STATUS, "tesr"));
        builder.build();
    }
}
