package com.Nxer.TwistSpaceTechnology.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

import com.Nxer.TwistSpaceTechnology.common.item.items.BasicItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GTCMCreativeTabs {

    /**
     * Creative Tab for MetaItem01
     */
    public static final CreativeTabs tabMetaItem01 = new CreativeTabs(
        // #tr temGroup.TST Meta Items 1 TST Meta Items 1
        StatCollector.translateToLocal("temGroup.TST Meta Items 1")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return BasicItems.MetaItem01;
        }
    };
    public static final CreativeTabs tabGears = new CreativeTabs(
        // #tr temGroup.TSTGears TSTGears
        StatCollector.translateToLocal("temGroup.TSTGears")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return BasicItems.MetaItem01;
        }
    };

    /**
     * Creative Tab for MetaBlock01
     */
    public static final CreativeTabs tabMetaBlock01 = new CreativeTabs(
        // #tr temGroup.TST Meta Blocks 1 TST Meta Blocks 1
        StatCollector.translateToLocal("temGroup.TST Meta Blocks 1")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return BasicItems.MetaItem01;
        }
    };

    /**
     * Creative Tab for MetaBlock01
     */
    public static final CreativeTabs tabGTCMGeneralTab = new CreativeTabs(
        // #tr temGroup.TST TST
        StatCollector.translateToLocal("temGroup.TST")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return BasicItems.MetaItem01;
        }
    };
    public static final CreativeTabs tabMultiStructures = new CreativeTabs(
        // #tr temGroup.MultiStructures MultiStructures
        StatCollector.translateToLocal("temGroup.MultiStructures")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return BasicItems.MetaItem01;
        }
    };

}
