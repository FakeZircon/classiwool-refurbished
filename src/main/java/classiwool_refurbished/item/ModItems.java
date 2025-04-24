package classiwool_refurbished.item;

import classiwool_refurbished.ClassiwoolRefurbished;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));

    private static void addItemToTabGroup(FabricItemGroupEntries entries){
        entries.add(TEST);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ClassiwoolRefurbished.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ClassiwoolRefurbished.LOGGER.info("registering mod Items for " + ClassiwoolRefurbished.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToTabGroup);
    }
}
