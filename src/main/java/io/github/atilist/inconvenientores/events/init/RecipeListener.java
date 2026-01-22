package io.github.atilist.inconvenientores.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            CraftingRegistry.addShapedRecipe(new ItemStack(ItemListener.falsifier, 1), " X ", " YX", "Y  ", 'X', ItemListener.fakeDiamond, 'Y', Item.STICK);
            CraftingRegistry.addShapedRecipe(new ItemStack(ItemListener.inconvenientCrate, 1), " X ", "XYX", " X ", 'X', ItemListener.fakeDiamond, 'Y', Block.CHEST);
            CraftingRegistry.addShapedRecipe(new ItemStack(BlockListener.cheesyGarbage, 1), "XXX", "XYX", "XXX", 'X', ItemListener.garbage, 'Y', ItemListener.rockyCheese);
            CraftingRegistry.addShapedRecipe(new ItemStack(BlockListener.garbagePile, 1), "XXX", "XXX", "XXX", 'X', ItemListener.garbage);
            CraftingRegistry.addShapedRecipe(new ItemStack(BlockListener.stuffPile, 1), "XXX", "XXX", "XXX", 'X', ItemListener.stuff);
            CraftingRegistry.addShapedRecipe(new ItemStack(ItemListener.consolidator, 1), " X ", "YXY", "YYY", 'X', ItemListener.stuff, 'Y', BlockListener.stuffPile);
        } else if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(new ItemStack(BlockListener.soakedMilkStoneCrate, 1), new ItemStack(ItemListener.inconvenientCrate), new ItemStack(ItemListener.milkStone), new ItemStack(Item.MILK_BUCKET));
            CraftingRegistry.addShapelessRecipe(new ItemStack(BlockListener.infestedRockDirt, 1), new ItemStack(ItemListener.garbageBacteria), new ItemStack(BlockListener.softenedRockDirt));
            CraftingRegistry.addShapelessRecipe(new ItemStack(ItemListener.garbage, 9), new ItemStack(BlockListener.garbagePile));
            CraftingRegistry.addShapelessRecipe(new ItemStack(ItemListener.stuff, 9), new ItemStack(BlockListener.stuffPile));
        }
    }
}
