package fuzs.easymagic.mixin.accessor;

import net.minecraft.util.RandomSource;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(EnchantmentMenu.class)
public interface EnchantmentMenuAccessor {

    @Mutable
    @Accessor
    void setEnchantSlots(Container enchantSlots);

    @Accessor
    DataSlot getEnchantmentSeed();

    @Accessor
    RandomSource getRandom();

    @Invoker
    List<EnchantmentInstance> callGetEnchantmentList(ItemStack stack, int enchantSlot, int level);
}
