package net.iwonbydefault.abyssal_arsenal.item;

import net.iwonbydefault.abyssal_arsenal.AbyssalArsenal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbyssalArsenal.MOD_ID);

    public static final RegistryObject<Item> KUNZITE = ITEMS.register("kunzite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
