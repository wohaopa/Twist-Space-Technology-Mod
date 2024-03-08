package com.Nxer.TwistSpaceTechnology.common.block;

import net.minecraft.block.Block;

import com.Nxer.TwistSpaceTechnology.common.block.blockClass.BlockBase01;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.BlockNuclearReactor;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.PhotonControllerUpgradeCasing;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationAntiGravityCasing;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationStructureCasing;

public class BasicBlocks {

    // #tr blockBase01.MetaBlock01.name MetaBlock01
    public static final Block MetaBlock01 = new BlockBase01("MetaBlock01");

    // #tr PhotonControllerUpgrades.name Photon Controller Upgrade
    public static final Block PhotonControllerUpgrade = new PhotonControllerUpgradeCasing("PhotonControllerUpgrades");

    // #tr SpaceStationStructureBlock.name Space Station Structure Block
    public static final Block spaceStationStructureBlock = new SpaceStationStructureCasing(
        "SpaceStationStructureBlock");

    // #tr SpaceStationAntiGravityBlock.name Space Station Anti Gravity Block
    public static final Block SpaceStationAntiGravityBlock = new SpaceStationAntiGravityCasing(
        "SpaceStationAntiGravityBlock");
    public static Block BlockStar;

    // #tr nuclear.name Mega Nuclear Reactor
    public static Block NuclearReactorBlock = new BlockNuclearReactor("nuclear");
}
