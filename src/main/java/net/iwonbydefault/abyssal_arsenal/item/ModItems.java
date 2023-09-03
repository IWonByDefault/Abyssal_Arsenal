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

    public static final RegistryObject<Item> KUNZITE_SHARD = ITEMS.register("kunzite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KUNZITE = ITEMS.register("kunzite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNAL_KUNZITE = ITEMS.register("infernal_kunzite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPT_KUNZITE = ITEMS.register("corrupt_kunzite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELDRITCH_KUNZITE = ITEMS.register("eldritch_kunzite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFERNAL_POWDER = ITEMS.register("infernal_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPT_POWDER = ITEMS.register("corrupt_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELDRITCH_POWDER = ITEMS.register("eldritch_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNAL_DIAMOND = ITEMS.register("infernal_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPT_NETHERITE_INGOT = ITEMS.register("corrupt_netherite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABYSSAL_ESSENCE = ITEMS.register("abyssal_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTRAND_FIBERS = ITEMS.register("voidstrand_fibers",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTRAND = ITEMS.register("voidstrand",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELDRITCHSTRAND = ITEMS.register("eldritchstrand",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KUNZITE_ORE = ITEMS.register("kunzite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_KUNZITE_ORE = ITEMS.register("deepslate_kunzite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KUNZITE_BLOCK = ITEMS.register("kunzite_block",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
