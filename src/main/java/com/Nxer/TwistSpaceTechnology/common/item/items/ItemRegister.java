package com.Nxer.TwistSpaceTechnology.common.item.items;

import static com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemAdder01.initItem01;
import static com.Nxer.TwistSpaceTechnology.common.item.itemAdders.ItemAdderRune.initItemRune;
import static com.Nxer.TwistSpaceTechnology.common.item.items.BasicItems.MultiStructuresLinkTool;
import static com.Nxer.TwistSpaceTechnology.util.TextLocalization.DSPName;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.Nxer.TwistSpaceTechnology.common.GTCMItemList;
import com.Nxer.TwistSpaceTechnology.config.Config;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister {

    public static void registryItems() {
        Item[] itemsToReg = { BasicItems.MetaItem01, BasicItems.ProofOfHeroes, MultiStructuresLinkTool,
            BasicItems.MetaItemRune, BasicItems.PowerChair };

        for (Item item : itemsToReg) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }

    }

    // spotless:off
    public static void registryItemContainers() {
        // #tr MetaItem01.0.name Test Item 0
        GTCMItemList.TestItem0.set(initItem01(0, new String[]{
			// #tr tooltips.TestItem0.line1 A test item, no use.
			StatCollector.translateToLocal("tooltips.TestItem0.line1")}));
        // #tr MetaItem01.1.name Space Warper
        GTCMItemList.SpaceWarper.set(initItem01(1, new String[]{
            // #tr {\DARK_BLUE}Power of gravitation !
            StatCollector.translateToLocal("tooltips.SpaceWarper.line1")}));
        // #tr MetaItem01.2.name Gravitational Constraint Optical Quantum Crystal
        GTCMItemList.OpticalSOC.set(initItem01(2, new String[]{
			// #tr tooltips.OpticalSOC.line1 These Photons have their own mind.
			StatCollector.translateToLocal("tooltips.OpticalSOC.line1")}));
        // #tr MetaItem01.3.name Mold(Singularity)
        GTCMItemList.MoldSingularity.set(initItem01(3, new String[]{
			// #tr tooltips.MoldSingularity.line1 Mold for making Singularity
			StatCollector.translateToLocal("tooltips.MoldSingularity.line1")}));
        // #tr MetaItem01.4.name Particle Trap - SpaceTime Shield
        GTCMItemList.ParticleTrapTimeSpaceShield.set(initItem01(4, new String[]{
			// #tr tooltips.ParticleTrapTimeSpaceShield.line1 Constrain the operator(the photon) to a miniature spacetime.
			StatCollector.translateToLocal("tooltips.ParticleTrapTimeSpaceShield.line1")}));
        // #tr MetaItem01.5.name Lapotron Shard
        GTCMItemList.LapotronShard.set(initItem01(5, new String[]{
			// #tr tooltips.LapotronShard.line1 Even though it's just a shard, the energy fluctuations inside are also visible to the naked eye.
			StatCollector.translateToLocal("tooltips.LapotronShard.line1")}));
        // #tr MetaItem01.6.name Perfect Lapotron Crystal
        GTCMItemList.PerfectLapotronCrystal.set(initItem01(6, new String[]{
			// #tr tooltips.PerfectLapotronCrystal.line1 Immaculate !
			StatCollector.translateToLocal("tooltips.PerfectLapotronCrystal.line1")}));
        // #tr MetaItem01.7.name Energy Crystal Shard
        GTCMItemList.EnergyCrystalShard.set(initItem01(7, new String[]{
			// #tr tooltips.EnergyCrystalShard.line1 A red crystal shard, doesn't look like anything special.
			StatCollector.translateToLocal("tooltips.EnergyCrystalShard.line1")}));
        // #tr MetaItem01.8.name Perfect Energy Crystal
        GTCMItemList.PerfectEnergyCrystal.set(initItem01(8, new String[]{
			// #tr tooltips.PerfectEnergyCrystal.line1 As it grew in size, it displayed incredible traits on energy control.
			StatCollector.translateToLocal("tooltips.PerfectEnergyCrystal.line1")}));
        // #tr MetaItem01.9.name Solar Sail
        GTCMItemList.SolarSail.set(initItem01(9, new String[]{
			// #tr tooltips.SolarSail.line1 Collect and concentrate light energy.
			StatCollector.translateToLocal("tooltips.SolarSail.line1"), DSPName.toString()}));
        // #tr MetaItem01.10.name Dyson Sphere Frame Component
        GTCMItemList.DysonSphereFrameComponent.set(initItem01(10, new String[]{
			// #tr tooltips.DysonSphereFrameComponent.line1 Stellar gravity can't destroy these structures, even black hole.
			StatCollector.translateToLocal("tooltips.DysonSphereFrameComponent.line1"), DSPName.toString()}));
        // #tr MetaItem01.11.name Small Launch Vehicle
        GTCMItemList.SmallLaunchVehicle.set(initItem01(11, new String[]{
			// #tr tooltips.SmallLaunchVehicle.line1 Subtle and sophisticated.
			StatCollector.translateToLocal("tooltips.SmallLaunchVehicle.line1"), DSPName.toString()}));
        // #tr MetaItem01.12.name Empty Small Launch Vehicle
        GTCMItemList.EmptySmallLaunchVehicle.set(initItem01(12, new String[]{
			// #tr tooltips.EmptySmallLaunchVehicle.line1 Subtle and sophisticated but Empty.
			StatCollector.translateToLocal("tooltips.EmptySmallLaunchVehicle.line1"), DSPName.toString()}));
        // #tr MetaItem01.13.name Critical Photon
        GTCMItemList.CriticalPhoton.set(initItem01(13, new String[]{
			// #tr tooltips.CriticalPhoton.line1 The future has arrived.
			StatCollector.translateToLocal("tooltips.CriticalPhoton.line1"), DSPName.toString()}));
        // #tr MetaItem01.14.name Antimatter
        GTCMItemList.Antimatter.set(initItem01(14, new String[]{
			// #tr tooltips.Antimatter.line1 The Other Side of Matter.
			StatCollector.translateToLocal("tooltips.Antimatter.line1"), DSPName.toString()}));
        // #tr MetaItem01.15.name Annihilation Constrainer
        GTCMItemList.AnnihilationConstrainer.set(initItem01(15, new String[]{
			// #tr tooltips.AnnihilationConstrainer.line1 Encourage indirect operation.
			StatCollector.translateToLocal("tooltips.AnnihilationConstrainer.line1"), DSPName.toString()}));
        // #tr MetaItem01.16.name Antimatter Fuel Rod
        GTCMItemList.AntimatterFuelRod.set(initItem01(16, new String[]{
			// #tr tooltips.AntimatterFuelRod.line1 More...
			StatCollector.translateToLocal("tooltips.AntimatterFuelRod.line1"), DSPName.toString()}));
        // #tr MetaItem01.17.name Stellar Construction Frame Material
        GTCMItemList.StellarConstructionFrameMaterial.set(initItem01(17, new String[]{
			// #tr tooltips.StellarConstructionFrameMaterial.line1 Perfect and expensive.
			StatCollector.translateToLocal("tooltips.StellarConstructionFrameMaterial.line1"), DSPName.toString()}));
        // #tr MetaItem01.18.name Gravitational Lens
        GTCMItemList.GravitationalLens.set(initItem01(18, new String[]{
			// #tr tooltips.GravitationalLens.line3 Its twisted and powerful gravitational field is shielded in a container.", "tooltips.GravitationalLens.line1"), texter("It is usually utilized to work and alter spatial structures, ", "tooltips.GravitationalLens.line2"), texter(" but that doesn't stop some people from taking it and focusing sunlight to light fires for fun.
			StatCollector.translateToLocal("tooltips.GravitationalLens.line3"), DSPName.toString()}));
        // #tr MetaItem01.19.name Purple Magnolia Petal
        GTCMItemList.PurpleMagnoliaPetal.set(initItem01(19, new String[]{
			// #tr tooltips.PurpleMagnoliaPetal.line1 Petals falling from Alfheim...
			StatCollector.translateToLocal("tooltips.PurpleMagnoliaPetal.line1")}));
        // #tr MetaItem01.20.name Purple Magnolia Sapling
        GTCMItemList.PurpleMagnoliaSapling.set(initItem01(20, new String[]{
			// #tr tooltips.PurpleMagnoliaSapling.line1 Not plantable. Need to be on ic2 crop sticks.
			StatCollector.translateToLocal("tooltips.PurpleMagnoliaSapling.line1")}));
        // #tr MetaItem01.21.name Void Pollen
        GTCMItemList.VoidPollen.set(initItem01(21, new String[]{
			// #tr tooltips.VoidPollen.line1 Pollen yet to be arisen.
			StatCollector.translateToLocal("tooltips.VoidPollen.line1")}));
        // #tr MetaItem01.22.name Primitive Man's SpaceTime Distortion Device
        GTCMItemList.PrimitiveMansSpaceTimeDistortionDevice.set(initItem01(22, new String[]{
			// #tr tooltips.PrimitiveMansSpaceTimeDistortionDevice.line1 Anyway...
			StatCollector.translateToLocal("tooltips.PrimitiveMansSpaceTimeDistortionDevice.line1")}));

        if(Config.activateMegaSpaceStation) {
            // #tr MetaItem01.176.name High-dimensional extend
            GTCMItemList.HighDimensionalExtend.set(initItem01( 176));
            // #tr MetaItem01.177.name High-dimensional circuit board
            GTCMItemList.HighDimensionalCircuitDoard.set(initItem01(177));
            // #tr MetaItem01.178.name High-dimensional capacitor
            GTCMItemList.HighDimensionalCapacitor.set(initItem01(178));
            // #tr MetaItem01.179.name High-dimensional interface
            GTCMItemList.HighDimensionalInterface.set(initItem01(179));
            // #tr MetaItem01.180.name High-dimensional SMD diode
            GTCMItemList.HighDimensionalDiode.set(initItem01(180));
            // #tr MetaItem01.181.name High-dimensional Resistor
            GTCMItemList.HighDimensionalResistor.set(initItem01(181));
            // #tr MetaItem01.182.name High-dimensional Transistor
            GTCMItemList.HighDimensionalTransistor.set(initItem01(182));

            // #tr MetaItem01.300.name Cosmic Circuit Board
			GTCMItemList.CosmicCircuitBoard.set(initItem01(300));
            // #tr MetaItem01.302.name Event Horizon Nano Swarm
			GTCMItemList.EventHorizonNanoSwarm.set(initItem01(302));
            // #tr MetaItem01.303.name Micro dimension output
			GTCMItemList.MicroDimensionOutput.set(initItem01(303));
            // #tr MetaItem01.304.name Entropy reduction material nanoswarm
			GTCMItemList.EntropyReductionMaterialNanoswarm.set(initItem01(304));
            // #tr MetaItem01.306.name Narrative layer overwriting device
			GTCMItemList.NarrativeLayerOverwritingDevice.set(initItem01(306));
            // #tr MetaItem01.307.name Hyperspace Narrative Layer Adaptive Special SRA
			GTCMItemList.HyperspaceNarrativeLayerAdaptiveSpecialSRA.set(initItem01(307));
            // #tr MetaItem01.308.name Real Singularity Nano Swarm
			GTCMItemList.RealSingularityNanoSwarm.set(initItem01(308));
            // #tr MetaItem01.309.name paradox engine
			GTCMItemList.ParadoxEngine.set(initItem01(309));
            // #tr MetaItem01.310.name quasar soc
			GTCMItemList.QuasarSoc.set(initItem01(310));
            // #tr MetaItem01.311.name miniature galaxy
			GTCMItemList.MiniatureGalaxy.set(initItem01(311));
            // #tr MetaItem01.312.name self-adaptive AI Ⅰ
			GTCMItemList.Self_adaptiveAI1.set(initItem01(312));
            // #tr MetaItem01.313.name self-adaptive AI Ⅱ
			GTCMItemList.Self_adaptiveAI2.set(initItem01(313));
            // #tr MetaItem01.314.name self-adaptive AI Ⅲ
			GTCMItemList.Self_adaptiveAI3.set(initItem01(314));
            // #tr MetaItem01.315.name self-adaptive AI Ⅳ
			GTCMItemList.Self_adaptiveAI4.set(initItem01(315));
            // #tr MetaItem01.316.name self-adaptive AI Ⅴ
			GTCMItemList.Self_adaptiveAI5.set(initItem01(316));
            // #tr MetaItem01.317.name core of T800
			GTCMItemList.CoreOfT800.set(initItem01(317));
            // #tr MetaItem01.318.name Exotic Circuit Board
			GTCMItemList.ExoticCircuitBoard.set(initItem01(318));
            // #tr MetaItem01.319.name very good item
			GTCMItemList.spaceStationConstructingMaterialMax.set(initItem01(319));
            // #tr MetaItem01.320.name Light Quantum Matrix
			GTCMItemList.LightQuantumMatrix.set(initItem01(320));
            //// #tr MetaItem01.321.name Star Core
			GTCMItemList.StarCore.set(initItem01(321));
            // #tr MetaItem01.322.name Casimir Quantum Fiber
			GTCMItemList.CasimirQuantumFiber.set(initItem01(322));
            // #tr MetaItem01.323.name Superstring structure
			GTCMItemList.SuperstringStructure.set(initItem01(323));
            // #tr MetaItem01.324.name Dynamic Paradox Body
			GTCMItemList.DynamicParadoxBody.set(initItem01(324));
            // #tr MetaItem01.325.name Void Prism
			GTCMItemList.VoidPrism.set(initItem01(325));
            // #tr MetaItem01.326.name Pulsar core
			GTCMItemList.PulsarCore.set(initItem01(326));
            // #tr MetaItem01.327.name Star Crystal I
			GTCMItemList.StarCrystalI.set(initItem01(327));
            // #tr MetaItem01.328.name Super Dimensional Ring
			GTCMItemList.SuperDimensionalRing.set(initItem01(328));
            // #tr MetaItem01.329.name Hyperdimensional expansion
			GTCMItemList.HyperdimensionalExpansion.set(initItem01(329));
            // #tr MetaItem01.330.name optical layer
			GTCMItemList.OpticalLayer.set(initItem01(330));
            // #tr MetaItem01.331.name Magnetic Spin I
			GTCMItemList.MagneticSpinI.set(initItem01(331));
            // #tr MetaItem01.332.name star axis
			GTCMItemList.Staraxis.set(initItem01(332));
            // #tr MetaItem01.333.name Boltzmann Brain
			GTCMItemList.BoltzmannBrain.set(initItem01(333));
            // #tr MetaItem01.334.name Remnants of the Big Bang
			GTCMItemList.RemnantsOfTheBigBang.set(initItem01(334));
            // #tr MetaItem01.335.name Strange Film
			GTCMItemList.StrangeFilm.set(initItem01(335));
            // #tr MetaItem01.336.name Pulse Manganese
			GTCMItemList.PulseManganese.set(initItem01(336));
            // #tr MetaItem01.337.name Superdimensional Web
			GTCMItemList.SuperdimensionalWeb.set(initItem01(337));
            // #tr MetaItem01.338.name Pinoan Structure
			GTCMItemList.PinoanStructure.set(initItem01(338));
            // #tr MetaItem01.339.name Quantum Chain
			GTCMItemList.QuantumChain.set(initItem01(339));
            // #tr MetaItem01.340.name Star Belt
			GTCMItemList.StarBelt.set(initItem01(340));
            // #tr MetaItem01.341.name Nanoflow
			GTCMItemList.Nanoflow.set(initItem01(341));
            // #tr MetaItem01.342.name Space-time layer
			GTCMItemList.Space_TimeLayer.set(initItem01(342));
            // #tr MetaItem01.343.name Superconducting ring
			GTCMItemList.SuperconductingRing.set(initItem01(343));
            // #tr MetaItem01.344.name Quantized Superstring Structure
			GTCMItemList.QuantizedSuperstringStructure.set(initItem01(344));
            // #tr MetaItem01.345.name The zero point of vacuum can manifest objects
			GTCMItemList.ThezeroPointOfVacuumCanManifestObjects.set(initItem01(345));
            // #tr MetaItem01.346.name Star Core
			GTCMItemList.StarCore.set(initItem01(346));
            // #tr MetaItem01.347.name quasar remnant
			GTCMItemList.QuasarRemnant.set(initItem01(347));
            // #tr MetaItem01.348.name Infinite Divine Machine
			GTCMItemList.InfiniteDivineMachine.set(initItem01(348));
            // #tr MetaItem01.349.name Original Soup
			GTCMItemList.OriginalSoup.set(initItem01(349));
            // #tr MetaItem01.350.name Gravity Belt
			GTCMItemList.GravityBelt.set(initItem01(350));
            // #tr MetaItem01.351.name anti-gravity engine
			GTCMItemList.anti_GravityEngine.set(initItem01(351));
            // #tr MetaItem01.352.name Condensed Dark Matter Polymer
			GTCMItemList.CondensedDarkMatterPolymer.set(initItem01(352));
            // #tr MetaItem01.353.name Low Density Dark Matter Polymer
			GTCMItemList.LowDensityDarkMatterPolymer.set(initItem01(353));
            // #tr MetaItem01.354.name infinite recursion
			GTCMItemList.InfiniteRecursion.set(initItem01(354));
            // #tr MetaItem01.355.name Superdimensional Spiral
			GTCMItemList.SuperdimensionalSpiral.set(initItem01(355));
            // #tr MetaItem01.356.name Infinite Divine Machine I
			GTCMItemList.InfiniteDivineMachineI.set(initItem01(356));
            // #tr MetaItem01.357.name nuclear axis fluctuation
			GTCMItemList.NuclearaxisFluctuation.set(initItem01(357));
            // #tr MetaItem01.358.name Strange fluctuations
			GTCMItemList.StrangeFluctuations.set(initItem01(358));
            // #tr MetaItem01.359.name Pulse Copper
			GTCMItemList.PulseCopper.set(initItem01(359));
            // #tr MetaItem01.360.name Dark Matter Crystallization
			GTCMItemList.DarkMatterCrystallization.set(initItem01(360));
            // #tr MetaItem01.361.name Quantum Core
			GTCMItemList.QuantumCore.set(initItem01(361));
            // #tr MetaItem01.362.name Photon flow
			GTCMItemList.PhotonFlow.set(initItem01(362));
            // #tr MetaItem01.363.name nuclear belt
			GTCMItemList.NuclearBelt.set(initItem01(363));
            // #tr MetaItem01.364.name Life Guide
			GTCMItemList.LifeGuide.set(initItem01(364));
            // #tr MetaItem01.365.name Quantized Superstring Structure I
			GTCMItemList.QuantizedSuperstringStructureI.set(initItem01(365));
            // #tr MetaItem01.366.name empty heart
			GTCMItemList.EmptyHeart.set(initItem01(366));
            // #tr MetaItem01.367.name Star Core Belt
			GTCMItemList.StarCoreBelt.set(initItem01(367));
            // #tr MetaItem01.368.name Space-time Spiral
			GTCMItemList.Space_TimeSpiral.set(initItem01(368));
            // #tr MetaItem01.369.name Magnetic Spin IV
			GTCMItemList.MagneticSpinIV.set(initItem01(369));
            // #tr MetaItem01.370.name Nuclear Fluctuation
			GTCMItemList.NuclearFluctuation.set(initItem01(370));
            // #tr MetaItem01.371.name Celestial Resonance Crystal
			GTCMItemList.CelestialResonanceCrystal.set(initItem01(371));
            // #tr MetaItem01.372.name Low Density Dark Matter Polymer I
			GTCMItemList.LowDensityDarkMatterPolymerI.set(initItem01(372));
            // #tr MetaItem01.373.name Quantum Core
			GTCMItemList.QuantumCore.set(initItem01(373));
            // #tr MetaItem01.374.name Superdimensional life
			GTCMItemList.SuperdimensionalLife.set(initItem01(374));
            // #tr MetaItem01.375.name Gravity Fluctuation
			GTCMItemList.GravityFluctuation.set(initItem01(375));
            // #tr MetaItem01.376.name Light Spiral
			GTCMItemList.LightSpiral.set(initItem01(376));
            // #tr MetaItem01.377.name nuclear axis belt
			GTCMItemList.NuclearaxisBelt.set(initItem01(377));
            // #tr MetaItem01.378.name Superconducting Network
			GTCMItemList.SuperconductingNetwork.set(initItem01(378));
            // #tr MetaItem01.379.name Nanolife
			GTCMItemList.Nanolife.set(initItem01(379));
            // #tr MetaItem01.380.name Core of Ancient Creation
			GTCMItemList.CoreOfAncientCreation.set(initItem01(380));
            // #tr MetaItem01.381.name Quantum Heart
			GTCMItemList.QuantumHeart.set(initItem01(381));
            // #tr MetaItem01.382.name fluctuating life
			GTCMItemList.FluctuatingLife.set(initItem01(382));
            // #tr MetaItem01.383.name Pioneer Remains
			GTCMItemList.PioneerRemains.set(initItem01(383));
            // #tr MetaItem01.384.name Life is empty
			GTCMItemList.LifeIsEmpty.set(initItem01(384));
            // #tr MetaItem01.385.name Superstring structure V
			GTCMItemList.SuperstringStructureV.set(initItem01(385));
            // #tr MetaItem01.386.name Superdimensional fluctuations
			GTCMItemList.SuperdimensionalFluctuations.set(initItem01(386));
            // #tr MetaItem01.387.name Creations from the Outer Universe
			GTCMItemList.CreationsFromTheOuterUniverse.set(initItem01(387));
            // #tr MetaItem01.388.name Magnetic Vortex
			GTCMItemList.MagneticVortex.set(initItem01(388));
            // #tr MetaItem01.389.name Space-time core
			GTCMItemList.Space_TimeCore.set(initItem01(389));
            // #tr MetaItem01.390.name Subspace Heart
			GTCMItemList.SubspaceHeart.set(initItem01(390));
            // #tr MetaItem01.391.name cosmic expansion effect fluctuations
			GTCMItemList.CosmicExpansionEffectFluctuations.set(initItem01(391));
            // #tr MetaItem01.392.name Star Crystal IV
			GTCMItemList.StarCrystalIV.set(initItem01(392));
            // #tr MetaItem01.393.name Infinite Recursive Net
			GTCMItemList.InfiniteRecursiveNet.set(initItem01(393));
            // #tr MetaItem01.394.name Superconducting Life Waves
			GTCMItemList.SuperconductingLifeWaves.set(initItem01(394));
            // #tr MetaItem01.395.name gravitational heart
			GTCMItemList.GravitationalHeart.set(initItem01(395));
            // #tr MetaItem01.396.name Celestial Resonance Crystal Spiral
			GTCMItemList.CelestialResonanceCrystalSpiral.set(initItem01(396));
            // #tr MetaItem01.397.name nuclear axis core
			GTCMItemList.NuclearaxisCore.set(initItem01(397));
            // #tr MetaItem01.398.name Void Fluctuation
			GTCMItemList.VoidFluctuation.set(initItem01(398));
            // #tr MetaItem01.399.name Ancient Creation Fluctuation
			GTCMItemList.AncientCreationFluctuation.set(initItem01(399));
            // #tr MetaItem01.400.name Infinite recursive heart
			GTCMItemList.InfiniteRecursiveHeart.set(initItem01(400));
            // #tr MetaItem01.401.name Alien Star Core
			GTCMItemList.AlienStarCore.set(initItem01(401));
            // #tr MetaItem01.402.name spiral spiral
			GTCMItemList.SpiralSpiral.set(initItem01(402));
            // #tr MetaItem01.403.name Magnetic Spin Life
			GTCMItemList.MagneticSpinLife.set(initItem01(403));
            // #tr MetaItem01.404.name Light Waves
			GTCMItemList.LightWaves.set(initItem01(404));
            // #tr MetaItem01.405.name nuclear spiral
			GTCMItemList.NuclearSpiral.set(initItem01(405));
            // #tr MetaItem01.406.name Cosmic expansion effect core
			GTCMItemList.CosmicExpansionEffectCore.set(initItem01(406));
            // #tr MetaItem01.407.name Gravity Life
			GTCMItemList.GravityLife.set(initItem01(407));
            // #tr MetaItem01.408.name Celestial Resonance Crystal Network
			GTCMItemList.CelestialResonanceCrystalNetwork.set(initItem01(408));
            // #tr MetaItem01.409.name Life in Time and Space
			GTCMItemList.LifeInTimeandSpace.set(initItem01(409));
            // #tr MetaItem01.410.name Core Axis Life Heart
			GTCMItemList.CoreAxisLifeHeart.set(initItem01(410));
            // #tr MetaItem01.411.name Alien Star Core
			GTCMItemList.AlienStarCore.set(initItem01(411));
            // #tr MetaItem01.412.name Nano Life Heart
			GTCMItemList.NanoLifeHeart.set(initItem01(412));
            // #tr MetaItem01.413.name Ancient Creation Life
			GTCMItemList.AncientCreationLife.set(initItem01(413));
            // #tr MetaItem01.414.name infinite recursive kernel
			GTCMItemList.InfiniteRecursiveKernel.set(initItem01(414));
            // #tr MetaItem01.415.name Superconducting Life Zone
			GTCMItemList.SuperconductingLifeZone.set(initItem01(415));
            // #tr MetaItem01.416.name Gravity Life Fluctuation
			GTCMItemList.GravityLifeFluctuation.set(initItem01(416));
            // #tr MetaItem01.417.name Pioneer Remains Life Core
			GTCMItemList.PioneerRemainsLifeCore.set(initItem01(417));
            // #tr MetaItem01.418.name Subspace Fluctuation
			GTCMItemList.SubspaceFluctuation.set(initItem01(418));
            // #tr MetaItem01.419.name Space-time life core
			GTCMItemList.Space_TimeLifeCore.set(initItem01(419));
        }
        // #tr MetaItemRune.0.name Rune of Vigilance
        GTCMItemList.Rune_of_Vigilance.set(initItemRune(0, new String[]{
            // #tr tooltips.Rune_of_Vigilance.line1 Vigilance.
            StatCollector.translateToLocal( "tooltips.Rune_of_Vigilance.line1")}));
        // #tr MetaItemRune.1.name Rune of Erelong
        GTCMItemList.Rune_of_Erelong.set(initItemRune(1, new String[]{
            // #tr tooltips.Rune_of_Erelong.line1 Erelong.
            StatCollector.translateToLocal( "tooltips.Rune_of_Erelong.line1")}));
        // #tr MetaItemRune.2.name Rune of Ether
        GTCMItemList.Rune_of_Ether.set(initItemRune(2, new String[]{
            // #tr tooltips.Rune_of_Ether.line1 Ether.
            StatCollector.translateToLocal("tooltips.Rune_of_Ether.line1")}));
        // #tr MetaItemRune.3.name Rune of Perdition
        GTCMItemList.Rune_of_Perdition.set(initItemRune(3, new String[]{
            // #tr tooltips.Rune_of_Perdition.line1 Perdition.
            StatCollector.translateToLocal("tooltips.Rune_of_Perdition.line1")}));

        GTCMItemList.ProofOfHeroes.set(new ItemStack(BasicItems.ProofOfHeroes, 1));
        GTCMItemList.PowerChair.set(new ItemStack(BasicItems.PowerChair, 1));
    }

    // spotless:on
    public static void registry() {
        registryItems();
        registryItemContainers();
    }
}
