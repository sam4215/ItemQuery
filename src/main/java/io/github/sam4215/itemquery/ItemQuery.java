package io.github.sam4215.itemquery;

import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.spec.CommandSpec;

import java.util.logging.Logger;

@Plugin(id="itemquery", name="ItemQuery", version = "1.0")
public class ItemQuery {
    @Inject
    public Logger logger;
    @Inject
    public Game game;
    @Subscribe
    public void onStart(ServerStartedEvent e) {
        logger.info("ItemQuery is starting up!");
        logger.info("ItemQuery (version 1.0) is an uber cool plugin by ButterDev!");
        logger.info("ItemQuery is enabled!");
    }
    CommandSpec commandSpec = CommandSpec.builder()
            .description(Texts.of("ItemQuery main/help command"))
            .permission("itemquery.use")
            .executor(new io.github.sam4215.itemquery.command.ItemQuery())
            .build();
}
