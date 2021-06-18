package com.github.kyazuki.cheaptools;

import com.github.kyazuki.cheaptools.item.CheapToolsItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CheapTools.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CheapTools {
  public static final String MODID = "cheaptools";
  public static final Logger LOGGER = LogManager.getLogger(MODID);

  public CheapTools() {
    LOGGER.debug("CheapTools loaded!");
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    CheapToolsItems.registerItems(event.getRegistry());
  }
}
