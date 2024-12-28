package dev.xdpxi.fiberapi.util;

import dev.xdpxi.fiberapi.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

import java.util.Map;

public class Test {
    public static Block test_block;
    public static Item test_item;
    public static RegistryEntry<ArmorMaterial> test_material;

    public static void register() {
        Log.info("[FiberAPI/Register] - Test registerBlock...");
        try {
            test_block = Register.registerBlock(
                    new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
                    "test_block",
                    true,
                    Main.MOD_ID
            );
        } catch (Exception e) {
            Log.error("[FiberAPI/Register] - An error occurred while testing registerBlock:", e);
        }

        Log.info("[FiberAPI/Register] - Test registerItem...");
        try {
            test_item = Register.registerItem(
                    new Item(new Item.Settings()),
                    "test_item",
                    Main.MOD_ID
            );
        } catch (Exception e) {
            Log.error("[FiberAPI/Register] - An error occurred while testing registerItem:", e);
        }

        Log.info("[FiberAPI/Register] - Test registerMaterial...");
        try {
            test_material = Register.registerMaterial("test_material",
                    Map.of(
                            ArmorItem.Type.HELMET, 3,
                            ArmorItem.Type.CHESTPLATE, 8,
                            ArmorItem.Type.LEGGINGS, 6,
                            ArmorItem.Type.BOOTS, 3
                    ),
                    5,
                    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
                    () -> Ingredient.ofItems(test_item),
                    0.0F,
                    0.0F,
                    false,
                    Main.MOD_ID);
        } catch (Exception e) {
            Log.error("[FiberAPI/Register] - An error occurred while testing registerMaterial:", e);
        }
    }
}