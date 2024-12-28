package me.brandonli.mixin;

import net.minecraft.recipe.BannerDuplicateRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerDuplicateRecipe.class)
public final class BannerDuplicateRecipeMixin {

    @ModifyConstant(method = "matches(Lnet/minecraft/recipe/input/CraftingRecipeInput;Lnet/minecraft/world/World;)Z", constant = @Constant(intValue = 6))
    private int getOriginalLimit(final int original) {
        return Integer.MAX_VALUE;
    }

    @ModifyConstant(method = "craft(Lnet/minecraft/recipe/input/CraftingRecipeInput;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;)Lnet/minecraft/item/ItemStack;", constant = @Constant(intValue = 6))
    private int getOriginalCraftingLimit(final int original) {
        return Integer.MAX_VALUE;
    }
}
