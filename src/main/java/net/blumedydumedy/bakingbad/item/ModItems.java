package net.blumedydumedy.bakingbad.item;


import net.blumedydumedy.bakingbad.BakingBad;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FROSTED_CAKE = registerItem("frosted_cake", new Item (new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BakingBad.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        BakingBad.LOGGER.info("Registering Mod Items for" + BakingBad.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FROSTED_CAKE);
        });
    }
}
