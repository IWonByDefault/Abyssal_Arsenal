package net.iwonbydefault.abyssal_arsenal;

import com.mojang.logging.LogUtils;
import net.iwonbydefault.abyssal_arsenal.item.ModCreativeModTabs;
import net.iwonbydefault.abyssal_arsenal.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AbyssalArsenal.MOD_ID)
public class AbyssalArsenal {
    public static final String MOD_ID = "abyssal_arsenal";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AbyssalArsenal() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.KUNZITE_SHARD);
            event.accept(ModItems.KUNZITE);
            event.accept(ModItems.CORRUPT_KUNZITE);
            event.accept(ModItems.INFERNAL_KUNZITE);
            event.accept(ModItems.ELDRITCH_KUNZITE);

            event.accept(ModItems.INFERNAL_POWDER);
            event.accept(ModItems.CORRUPT_POWDER);
            event.accept(ModItems.ELDRITCH_POWDER);
            event.accept(ModItems.INFERNAL_DIAMOND);
            event.accept(ModItems.CORRUPT_NETHERITE_INGOT);
            event.accept(ModItems.ABYSSAL_ESSENCE);

            event.accept(ModItems.VOIDSTRAND_FIBERS);
            event.accept(ModItems.VOIDSTRAND);
            event.accept(ModItems.ELDRITCHSTRAND);

            event.accept(ModItems.KUNZITE_ORE);
            event.accept(ModItems.DEEPSLATE_KUNZITE_ORE);
            event.accept(ModItems.KUNZITE_BLOCK);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}