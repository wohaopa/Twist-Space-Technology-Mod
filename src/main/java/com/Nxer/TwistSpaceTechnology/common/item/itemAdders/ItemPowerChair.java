package com.Nxer.TwistSpaceTechnology.common.item.itemAdders;

import static net.minecraft.client.gui.GuiScreen.isShiftKeyDown;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPowerChair extends Item {

    public String unlocalizedName;

    public ItemPowerChair(/* String aName, */String aMetaName, CreativeTabs aCreativeTabs) {
        super();
        this.setCreativeTab(aCreativeTabs);
        this.unlocalizedName = aMetaName;
        // TextHandler.texter(aName, this.unlocalizedName + ".name");
    }

    @Override
    public Item setUnlocalizedName(String aUnlocalizedName) {
        this.unlocalizedName = aUnlocalizedName;
        return this;
    }

    @Override
    public String getUnlocalizedName(ItemStack aItemStack) {
        return this.unlocalizedName;
    }

    @Override
    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item aItem, CreativeTabs aCreativeTabs, List aList) {
        aList.add(new ItemStack(aItem, 1, 0));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack itemStack, final EntityPlayer player, final List toolTip,
        final boolean advancedToolTips) {

        if (isShiftKeyDown()) {
            // #tr tooltips.PowerChair.page2.line1 {\LIGHT_PURPLE}If you want it, then you'll have to take it.
            toolTip.add(StatCollector.translateToLocal("tooltips.PowerChair.page2.line1"));
        } else {
            // #tr tooltips.PowerChair.page1.line1 Your portal opening day's over.
            toolTip.add(StatCollector.translateToLocal("tooltips.PowerChair.page1.line1"));
        }
    }
}
