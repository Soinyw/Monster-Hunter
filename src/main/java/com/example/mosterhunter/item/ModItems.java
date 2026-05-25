package com.example.mosterhunter.item;

import com.example.mosterhunter.MonsterHunter;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MonsterHunter.MODID);

    public static final DeferredItem<Item> ICE_ETHER =
            ITEMS.register("ice_ether",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ETHER =
            ITEMS.register("raw_ether",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBOARD =
            ITEMS.register("material/cardboard",()->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}