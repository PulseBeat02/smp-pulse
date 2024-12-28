package me.brandonli.mixin;

import net.minecraft.item.BannerItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerItem.class)
public final class BannerItemMixin {
    @ModifyConstant(method = "appendBannerTooltip", constant = @Constant(intValue = 6))
    private static int modifyMaxBannerCount(final int original) {
        return Integer.MAX_VALUE;
    }
}

