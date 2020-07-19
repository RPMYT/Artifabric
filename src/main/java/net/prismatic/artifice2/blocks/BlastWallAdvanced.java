package net.prismatic.artifice2.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

import java.util.List;

public class BlastWallAdvanced extends Block {
    public BlastWallAdvanced(Settings settings) {
        super(settings);
    }
    @Override
    public void buildTooltip(ItemStack itemStack, BlockView blockView, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("tooltip.artifice2.blast_wall_advanced").formatted(Formatting.GRAY));
        tooltip.add(new TranslatableText("tooltip.artifice2.blast_wall_advanced.flavour").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
    }
}
