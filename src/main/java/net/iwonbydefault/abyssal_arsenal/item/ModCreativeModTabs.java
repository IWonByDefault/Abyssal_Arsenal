package net.iwonbydefault.abyssal_arsenal.item;

import net.iwonbydefault.abyssal_arsenal.AbyssalArsenal;
import net.iwonbydefault.abyssal_arsenal.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbyssalArsenal.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Abyssal_ARSENAL_TAB = CREATIVE_MODE_TABS.register("abyssal_arsenal_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KUNZITE.get()))
                    .title(Component.translatable("creativetab.abyssal_arsenal_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KUNZITE_SHARD.get());
                        pOutput.accept(ModItems.KUNZITE.get());
                        pOutput.accept(ModItems.INFERNAL_KUNZITE.get());
                        pOutput.accept(ModItems.CORRUPT_KUNZITE.get());
                        pOutput.accept(ModItems.ELDRITCH_KUNZITE.get());

                        pOutput.accept(ModItems.INFERNAL_POWDER.get());
                        pOutput.accept(ModItems.CORRUPT_POWDER.get());
                        pOutput.accept(ModItems.ELDRITCH_POWDER.get());
                        pOutput.accept(ModItems.INFERNAL_DIAMOND.get());
                        pOutput.accept(ModItems.CORRUPT_NETHERITE_INGOT.get());
                        pOutput.accept(ModItems.ABYSSAL_ESSENCE.get());

                        pOutput.accept(ModItems.VOIDSTRAND_FIBERS.get());
                        pOutput.accept(ModItems.VOIDSTRAND.get());
                        pOutput.accept(ModItems.ELDRITCHSTRAND.get());

                        pOutput.accept(ModBlocks.KUNZITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_KUNZITE_ORE.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_KUNZITE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
