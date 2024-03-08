package com.Nxer.TwistSpaceTechnology.common.item.items;

import net.minecraft.item.Item;

import com.Nxer.TwistSpaceTechnology.client.GTCMCreativeTabs;
import com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemAdder01;
import com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemAdderRune;
import com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemMultiStructuresLinkTool;
import com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemPowerChair;
import com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemProofOfHeroes;

public final class BasicItems {

    // #tr MetaItem01.name MetaItem01Base
    public static final Item MetaItem01 = new ItemAdder01("MetaItem01", GTCMCreativeTabs.tabMetaItem01)
        .setTextureName("gtnhcommunitymod:MetaItem01/0");

    // #tr MetaItemRune.name MetaItemRuneBase
    public static final Item MetaItemRune = new ItemAdderRune("MetaItemRune", GTCMCreativeTabs.tabMetaItem01)
        .setTextureName("gtnhcommunitymod:MetaItem01/0");

    // #tr ProofOfHeroes.name 英雄の証
    public static final Item ProofOfHeroes = new ItemProofOfHeroes("ProofOfHeroes", GTCMCreativeTabs.tabMetaItem01)
        .setTextureName("gtnhcommunitymod:ProofOfHeroes");

    // #tr MultiStructuresLinkTool.name Multi-Structures Link Tool
    public static final Item MultiStructuresLinkTool = new ItemMultiStructuresLinkTool(
        "MultiStructuresLinkTool",
        GTCMCreativeTabs.tabMultiStructures);

    // #tr PowerChair.name Power Chair
    public static final Item PowerChair = new ItemPowerChair("PowerChair", GTCMCreativeTabs.tabMetaItem01)
        .setTextureName("gtnhcommunitymod:PowerChair");

}
