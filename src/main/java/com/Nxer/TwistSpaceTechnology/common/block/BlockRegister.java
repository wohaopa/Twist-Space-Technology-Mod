package com.Nxer.TwistSpaceTechnology.common.block;

import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.BlockStar;
import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.MetaBlock01;
import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.NuclearReactorBlock;
import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.PhotonControllerUpgrade;
import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.SpaceStationAntiGravityBlock;
import static com.Nxer.TwistSpaceTechnology.common.block.BasicBlocks.spaceStationStructureBlock;
import static com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.BlockNuclearReactor.NuclearReactorBlockMeta;

import com.Nxer.TwistSpaceTechnology.common.GTCMItemList;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.BlockStar;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.BlockNuclearReactor;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.PhotonControllerUpgradeCasing;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.PhotonControllerUpgradeCasingItemBlock;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationAntiGravityCasing;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationAntiGravityCasingItemBlock;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationStructureCasing;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.Casings.spaceStation.SpaceStationStructureCasingItemBlock;
import com.Nxer.TwistSpaceTechnology.common.block.blockClass.ItemBlockBase01;
import com.Nxer.TwistSpaceTechnology.common.tile.TileStar;
import com.Nxer.TwistSpaceTechnology.config.Config;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {

    public static void registryBlocks() {

        GameRegistry.registerBlock(MetaBlock01, ItemBlockBase01.class, MetaBlock01.getUnlocalizedName());
        GameRegistry.registerBlock(
            PhotonControllerUpgrade,
            PhotonControllerUpgradeCasingItemBlock.class,
            PhotonControllerUpgrade.getUnlocalizedName());
        GameRegistry.registerBlock(
            spaceStationStructureBlock,
            SpaceStationStructureCasingItemBlock.class,
            spaceStationStructureBlock.getUnlocalizedName());
        GameRegistry.registerBlock(
            SpaceStationAntiGravityBlock,
            SpaceStationAntiGravityCasingItemBlock.class,
            SpaceStationAntiGravityBlock.getUnlocalizedName());
        GameRegistry.registerBlock(
            NuclearReactorBlock,
            BlockNuclearReactor.innerItemBlock.class,
            NuclearReactorBlock.getUnlocalizedName());
        BlockStar = new BlockStar();
        GameRegistry.registerTileEntity(TileStar.class, "StarRender");
    }

    public static void registryBlockContainers() {

        // #tr MetaBlock01.0.name TestMetaBlock01_0
        GTCMItemList.TestMetaBlock01_0.set(ItemBlockBase01.initMetaBlock01(0));
        // #tr PhotonControllerUpgrades.0.name Photonic Intensifier LV Tier
        GTCMItemList.PhotonControllerUpgradeLV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(0));
        // #tr PhotonControllerUpgrades.1.name Photonic Intensifier MV Tier
        GTCMItemList.PhotonControllerUpgradeMV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(1));
        // #tr PhotonControllerUpgrades.2.name Photonic Intensifier HV Tier
        GTCMItemList.PhotonControllerUpgradeHV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(2));
        // #tr PhotonControllerUpgrades.3.name Photonic Intensifier EV Tier
        GTCMItemList.PhotonControllerUpgradeEV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(3));
        // #tr PhotonControllerUpgrades.4.name Photonic Intensifier IV Tier
        GTCMItemList.PhotonControllerUpgradeIV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(4));
        // #tr PhotonControllerUpgrades.5.name Photonic Intensifier LuV Tier
        GTCMItemList.PhotonControllerUpgradeLuV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(5));
        // #tr PhotonControllerUpgrades.6.name Photonic Intensifier ZPM Tier
        GTCMItemList.PhotonControllerUpgradeZPM.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(6));
        // #tr PhotonControllerUpgrades.7.name Photonic Intensifier UV Tier
        GTCMItemList.PhotonControllerUpgradeUV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(7));
        // #tr PhotonControllerUpgrades.8.name Photonic Intensifier UHV Tier
        GTCMItemList.PhotonControllerUpgradeUHV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(8));
        // #tr PhotonControllerUpgrades.9.name Photonic Intensifier UEV Tier
        GTCMItemList.PhotonControllerUpgradeUEV.set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(9));
        // #tr PhotonControllerUpgrades.10.name Photonic Intensifier UIV Tier
        GTCMItemList.PhotonControllerUpgradeUIV
            .set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(10));
        // #tr PhotonControllerUpgrades.11.name Photonic Intensifier UMV Tier
        GTCMItemList.PhotonControllerUpgradeUMV
            .set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(11));
        // #tr PhotonControllerUpgrades.12.name Photonic Intensifier UXV Tier
        GTCMItemList.PhotonControllerUpgradeUXV
            .set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(12));
        // #tr PhotonControllerUpgrades.13.name Photonic Intensifier MAX Tier
        GTCMItemList.PhotonControllerUpgradeMAX
            .set(PhotonControllerUpgradeCasing.photonControllerUpgradeCasingMeta(13));
        // ---------------------------------------------------------------------------------------------------------------------------//
        if (Config.activateMegaSpaceStation) {
            // #tr SpaceStationStructureBlock.0.name spaceStationStructureBlock LV Tier
            GTCMItemList.spaceStationStructureBlockLV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(0));
            // #tr SpaceStationStructureBlock.1.name spaceStationStructureBlock MV Tier
            GTCMItemList.spaceStationStructureBlockMV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(1));
            // #tr SpaceStationStructureBlock.2.name spaceStationStructureBlock HV Tier
            GTCMItemList.spaceStationStructureBlockHV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(2));
            // #tr SpaceStationStructureBlock.3.name spaceStationStructureBlock EV Tier
            GTCMItemList.spaceStationStructureBlockEV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(3));
            // #tr SpaceStationStructureBlock.4.name spaceStationStructureBlock IV Tier
            GTCMItemList.spaceStationStructureBlockIV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(4));
            // #tr SpaceStationStructureBlock.5.name spaceStationStructureBlock LuV Tier
            GTCMItemList.spaceStationStructureBlockLuV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(5));
            // #tr SpaceStationStructureBlock.6.name spaceStationStructureBlock ZPM Tier
            GTCMItemList.spaceStationStructureBlockZPM
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(6));
            // #tr SpaceStationStructureBlock.7.name spaceStationStructureBlock UV Tier
            GTCMItemList.spaceStationStructureBlockUV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(7));
            // #tr SpaceStationStructureBlock.8.name spaceStationStructureBlock UHV Tier
            GTCMItemList.spaceStationStructureBlockUHV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(8));
            // #tr SpaceStationStructureBlock.9.name spaceStationStructureBlock UEV Tier
            GTCMItemList.spaceStationStructureBlockUEV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(9));
            // #tr SpaceStationStructureBlock.10.name spaceStationStructureBlock UIV Tier
            GTCMItemList.spaceStationStructureBlockUIV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(10));
            // #tr SpaceStationStructureBlock.11.name spaceStationStructureBlock UMV Tier
            GTCMItemList.spaceStationStructureBlockUMV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(11));
            // #tr SpaceStationStructureBlock.12.name spaceStationStructureBlock UXV Tier
            GTCMItemList.spaceStationStructureBlockUXV
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(12));
            // #tr SpaceStationStructureBlock.13.name spaceStationStructureBlock MAX Tier
            GTCMItemList.spaceStationStructureBlockMAX
                .set(SpaceStationStructureCasing.SpaceStationStructureCasingMeta(13));
            // ----------------------------------------
            // #tr SpaceStationAntiGravityBlock.0.name SpaceStationAntiGravityBlock LV Tie
            GTCMItemList.SpaceStationAntiGravityBlockLV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(0));
            // #tr SpaceStationAntiGravityBlock.1.name SpaceStationAntiGravityBlock MV Tie
            GTCMItemList.SpaceStationAntiGravityBlockMV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(1));
            // #tr SpaceStationAntiGravityBlock.2.name SpaceStationAntiGravityBlock HV Tie
            GTCMItemList.SpaceStationAntiGravityBlockHV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(2));
            // #tr SpaceStationAntiGravityBlock.3.name SpaceStationAntiGravityBlock EV Tie
            GTCMItemList.SpaceStationAntiGravityBlockEV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(3));
            // #tr SpaceStationAntiGravityBlock.4.name SpaceStationAntiGravityBlock IV Tie
            GTCMItemList.SpaceStationAntiGravityBlockIV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(4));
            // #tr SpaceStationAntiGravityBlock.5.name SpaceStationAntiGravityBlock LuV Tie
            GTCMItemList.SpaceStationAntiGravityBlockLuV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(5));
            // #tr SpaceStationAntiGravityBlock.6.name SpaceStationAntiGravityBlock ZPM Tie
            GTCMItemList.SpaceStationAntiGravityBlockZPM
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(6));
            // #tr SpaceStationAntiGravityBlock.7.name SpaceStationAntiGravityBlock UV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(7));
            // #tr SpaceStationAntiGravityBlock.8.name SpaceStationAntiGravityBlock UHV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUHV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(8));
            // #tr SpaceStationAntiGravityBlock.9.name SpaceStationAntiGravityBlock UEV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUEV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(9));
            // #tr SpaceStationAntiGravityBlock.10.name SpaceStationAntiGravityBlock UIV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUIV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(10));
            // #tr SpaceStationAntiGravityBlock.11.name SpaceStationAntiGravityBlock UMV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUMV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(11));
            // #tr SpaceStationAntiGravityBlock.12.name SpaceStationAntiGravityBlock UXV Tie
            GTCMItemList.SpaceStationAntiGravityBlockUXV
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(12));
            // #tr SpaceStationAntiGravityBlock.13.name SpaceStationAntiGravityBlock MAX Tie
            GTCMItemList.SpaceStationAntiGravityBlockMAX
                .set(SpaceStationAntiGravityCasing.SpaceStationAntiGravityCasingMeta(13));
            // #tr nuclear.0.name Nuclear Reactor structure block0
            GTCMItemList.NuclearReactorStructure0.set(NuclearReactorBlockMeta(0));
            // #tr nuclear.1.name Nuclear Reactor structure block1
            GTCMItemList.NuclearReactorStructure1.set(NuclearReactorBlockMeta(1));
            // #tr nuclear.2.name Nuclear Reactor structure block2
            GTCMItemList.NuclearReactorStructure2.set(NuclearReactorBlockMeta(2));
            // #tr nuclear.3.name Nuclear Reactor structure block3
            GTCMItemList.NuclearReactorStructure3.set(NuclearReactorBlockMeta(3));
        }
    }

    public static void registry() {
        registryBlocks();
        registryBlockContainers();
    }
}
