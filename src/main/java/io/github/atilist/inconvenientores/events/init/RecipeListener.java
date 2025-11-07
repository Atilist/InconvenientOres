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
        } else if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(new ItemStack(BlockListener.soakedMilkStoneCrate, 1), new ItemStack(ItemListener.inconvenientCrate), new ItemStack(ItemListener.milkStone), new ItemStack(Item.MILK_BUCKET));
        }
    }
}
