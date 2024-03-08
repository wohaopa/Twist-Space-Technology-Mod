package com.Nxer.TwistSpaceTechnology.util;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import com.Nxer.TwistSpaceTechnology.Tags;

/**
 * <li>It's best to write here the texts that need auto generate en_US.lang .
 * <li>Or some usually used texts.
 */
public enum TextLocalization {

    // spotless:off
    // region general

    // #tr ModNameDesc Added by {\GREEN}Twist Space Technology {\GRAY}
    ModNameDesc("ModNameDesc"),
    // #tr HeatCapacity Heat Capacity:{\SPACE}
    HeatCapacity("HeatCapacity"),
    // #tr FluidCapacity Capacity:{\SPACE}
    FluidCapacity("FluidCapacity"),
    // #tr HatchTier Hatch Tier:{\SPACE}
    HatchTier("HatchTier"),
    Kelvin("Kelvin"), // #tr Kelvin {\SPACE}K

    // #tr BLUE_PRINT_INFO Follow the {\BLUE}Structure{\DARK_BLUE}Lib {\GRAY}hologram projector to build the main structure.
    BLUE_PRINT_INFO("BLUE_PRINT_INFO"),
    // #tr DSPName {\BLUE}Dyson Sphere Program
    DSPName("DSPName"),
    // #tr Tooltip_Details {\LIGHT_PURPLE}Details:
    Tooltip_Details("Tooltip_Details"),
    // #tr Tooltips_JoinWirelessNetWithoutEnergyHatch Joining the wireless EU network when without installing an energy hatch.
    Tooltips_JoinWirelessNetWithoutEnergyHatch("Tooltips_JoinWirelessNetWithoutEnergyHatch"),
    // endregion

    // region Waila
    // #tr Waila.General.WirelessMode Wireless Mode
    Waila_WirelessMode("Waila.General.WirelessMode"),
    // #tr Waila.General.CurrentEuCost Current EU Cost
    Waila_CurrentEuCost("Waila.General.CurrentEuCost"),
    // endregion

    // region getInfoData
    // #tr General.getInfoData.Wireless_mode_enabled Wireless mode enabled
    Info_Wireless_mode_enabled("General.getInfoData.Wireless_mode_enabled"),
    // endregion

    // region special hatch info

    // #tr Tooltip_DoNotNeedMaintenance Do Not Need Maintenance!
    Tooltip_DoNotNeedMaintenance("Tooltip_DoNotNeedMaintenance"),
    // #tr Tooltip_DoNotNeedEnergyHatch Do Not Need Energy Hatch!
    Tooltip_DoNotNeedEnergyHatch("Tooltip_DoNotNeedEnergyHatch"),

    // endregion

    // region get info message
    // #tr infoText_CurrentStellarCoefficient Current Stellar Coefficient:
    infoText_CurrentStellarCoefficient("infoText_CurrentStellarCoefficient"),
    // #tr infoText_CurrentPlanetCoefficient Current Planet Coefficient:
    infoText_CurrentPlanetCoefficient("infoText_CurrentPlanetCoefficient"),

    // endregion

    // region casing
    // #tr textCasing Casing
    textCasing("textCasing"),
    // #tr textUseBlueprint Use {\BLUE}Blue{\AQUA}print{\RESET} to preview
    textUseBlueprint("textUseBlueprint"),
    // #tr textAnyCasing Any Casing
    textAnyCasing("textAnyCasing"),
    // #tr textTopCenter Top center
    textTopCenter("textTopCenter"),
    // #tr textFrontCenter Front center
    textFrontCenter("textFrontCenter"),
    // #tr textFrontBottom Front bottom
    textFrontBottom("textFrontBottom"),
    // #tr textCenterOfLRSides Center area of left and right side
    textCenterOfLRSides("textCenterOfLRSides"),
    // #tr textCenterOfUDSides Center area of up and down side
    textCenterOfUDSides("textCenterOfUDSides"),
    // #tr StructureTooComplex The structure is too complex!
    StructureTooComplex("StructureTooComplex"),

    // #tr textCasingAdvIrPlated Advanced Iridium Plated Machine Casing
    textCasingAdvIrPlated("textCasingAdvIrPlated"),

    // #tr textCasingTT_0 High Power Casing
    textCasingTT_0("textCasingTT_0"),

    // #tr textAroundController Around the Controller
    textAroundController("textAroundController"),

    // #tr textScrewdriverChangeMode Use screwdriver to change mode.
    textScrewdriverChangeMode("textScrewdriverChangeMode"),

    // endregion

    // region general tooltips

    // #tr Tooltip_GlassTierLimitEnergyHatchTier The Glass Tier limit the Energy hatch voltage Tier.
    Tooltip_GlassTierLimitEnergyHatchTier("Tooltip_GlassTierLimitEnergyHatchTier"),

    // endregion

    // region Intensify Chemical Distorter text localization

    // #tr NameIntensifyChemicalDistorter Intensify Chemical Distorter
    NameIntensifyChemicalDistorter("NameIntensifyChemicalDistorter"),

    // #tr Tooltip_ICD_MachineType Intensify Chemical Distorter/Chemical Reactor
    Tooltip_ICD_MachineType("Tooltip_ICD_MachineType"),
    // #tr Tooltip_ICD_00 Controller block for the Intensify Chemical Distorter
    Tooltip_ICD_00("Tooltip_ICD_00"),
    // #tr Tooltip_ICD_01 {\AQUA}I! {\BLUE}AM! {\AQUA}THE! {\BLUE}CHEM! {\AQUA}THAT! {\BLUE}IS! {\AQUA}APPROOOOOACHING !!
    Tooltip_ICD_01("Tooltip_ICD_01"),
    // #tr Tooltip_ICD_02 The most advanced base chemical reactor.
    Tooltip_ICD_02("Tooltip_ICD_02"),

    Tooltip_ICD_03(textScrewdriverChangeMode.key),
    // #tr Tooltip_ICD_04 {\GOLD}Intensify Chemical Distorter mode:{\SPACE}
    Tooltip_ICD_04("Tooltip_ICD_04"),
    // #tr Tooltip_ICD_05 Focus on processing the most complex chemical reaction - 16x Parallel.
    Tooltip_ICD_05("Tooltip_ICD_05"),
    // #tr Tooltip_ICD_06 {\GOLD}Chemical Reactor mode:{\SPACE}
    Tooltip_ICD_06("Tooltip_ICD_06"),
    // #tr Tooltip_ICD_07 1024 Parallel and 900% faster than using LCR of the same voltage.
    Tooltip_ICD_07("Tooltip_ICD_07"),

    // endregion

    // region Precise High-Energy Photonic Quantum Master text localization
    // #tr NamePreciseHighEnergyPhotonicQuantumMaster Precise High-Energy Photonic Quantum Master
    NamePreciseHighEnergyPhotonicQuantumMaster("NamePreciseHighEnergyPhotonicQuantumMaster"),

    // #tr Tooltip_PhC_MachineType Photon Controller/Laser Engraver
    Tooltip_PhC_MachineType("Tooltip_PhC_MachineType"),
    // #tr Tooltip_PhC_00 Controller block for the Precise High-Energy Photonic Quantum Master
    Tooltip_PhC_00("Tooltip_PhC_00"),
    // #tr Tooltip_PhC_01 {\BLUE}Prism tank in order, sir.
    Tooltip_PhC_01("Tooltip_PhC_01"),
    // #tr Tooltip_PhC_02 Control Photons on the scale of 10¯¹² meters.
    Tooltip_PhC_02("Tooltip_PhC_02"),
    // #tr Tooltip_PhC_03 Install Photonic Intensifier on the back side of the structure to dramatically increase production speeds.
    Tooltip_PhC_03("Tooltip_PhC_03"),
    // #tr Tooltip_PhC_04 Multi upgrade modules can be stacked. Also can be uninstalled. Replace using normal Casing.
    Tooltip_PhC_04("Tooltip_PhC_04"),
     Tooltip_PhC_05(textScrewdriverChangeMode.key),
    // #tr Tooltip_PhC_06 {\GOLD}Photon Controller mode:
    Tooltip_PhC_06("Tooltip_PhC_06"),
    // #tr Tooltip_PhC_07 16x Parallel
    Tooltip_PhC_07("Tooltip_PhC_07"),
    // #tr Tooltip_PhC_08 {\GOLD}Laser Engraver mode:
    Tooltip_PhC_08("Tooltip_PhC_08"),
    // #tr Tooltip_PhC_09 256x Parallel | Extra reduce 50%% recipe time spent
    Tooltip_PhC_09("Tooltip_PhC_09"),
    // #tr textHighPowerCasingUDSides High Power Casing area of up and down side
    textHighPowerCasingUDSides("textHighPowerCasingUDSides"),
    // #tr textUpgradeCasing Upgrade module casing at backside area wrapped by AdvIrPlated Casing
    textUpgradeCasingAndLocation("textUpgradeCasingAndLocation"),



    // endregion

    // region MiracleTop

    // #tr NameMiracleTop Miracle Top
    NameMiracleTop("NameMiracleTop"),

    // #tr Tooltip_MiracleTop_MachineType Circuit Assembler/Gravitation Breaker
    Tooltip_MiracleTop_MachineType("Tooltip_MiracleTop_MachineType"),
    // #tr Tooltip_MiracleTop_00 Controller block for the Miracle Top.
    Tooltip_MiracleTop_00("Tooltip_MiracleTop_00"),
    // #tr Tooltip_MiracleTop_01 {\LIGHT_PURPLE}I never think about the future because it will come sooner or later.
    Tooltip_MiracleTop_01("Tooltip_MiracleTop_01"),
    // #tr Tooltip_MiracleTop_02 For absolute precision and efficiency, please abandon traditional manufacturing
    // methods.
    Tooltip_MiracleTop_02("Tooltip_MiracleTop_02"),
    // #tr Tooltip_MiracleTop_03 The machine consists of a ring section and a conveying section.
    Tooltip_MiracleTop_03("Tooltip_MiracleTop_03"),
    // #tr Tooltip_MiracleTop_04 The number of rings is variable: Maximum 16 rings, Minimum 2 rings(the first and the
    // last).
    Tooltip_MiracleTop_04("Tooltip_MiracleTop_04"),
    // #tr Tooltip_MiracleTop_05 Total speed multiplier is equal to 400%% x num of rings.
    Tooltip_MiracleTop_05("Tooltip_MiracleTop_05"),
    // #tr Tooltip_MiracleTop_06 Enable Perfect overclock when num of rings >= 8 .
    Tooltip_MiracleTop_06("Tooltip_MiracleTop_06"),
    // #tr Tooltip_MiracleTop_07 128x Parallel per Ring.
    Tooltip_MiracleTop_07("Tooltip_MiracleTop_07"),
    // #tr textMiracleTopHatchLocation Outermost 12 blocks on the ring (outermost 3 on each side).
    textMiracleTopHatchLocation("textMiracleTopHatchLocation"),

    // endregion

    // region Magnetic Drive Pressure Former

    // #tr NameMagneticDrivePressureFormer Magnetic Drive Pressure Former
    NameMagneticDrivePressureFormer("NameMagneticDrivePressureFormer"),
    // #tr Tooltip_MagneticDrivePressureFormer_MachineType Extruder | Bending Machine | Forming Press
    Tooltip_MagneticDrivePressureFormer_MachineType("Tooltip_MagneticDrivePressureFormer_MachineType"),
    // #tr Tooltip_MagneticDrivePressureFormer_00 Controller block for the Magnetic Drive Pressure Former.
    Tooltip_MagneticDrivePressureFormer_00("Tooltip_MagneticDrivePressureFormer_00"),
    // #tr Tooltip_MagneticDrivePressureFormer_01 {\AQUA}Simple applications of Maxwell's equations.
    Tooltip_MagneticDrivePressureFormer_01("Tooltip_MagneticDrivePressureFormer_01"),
    // #tr Tooltip_MagneticDrivePressureFormer_02 No difficulty ! No hurry !
    Tooltip_MagneticDrivePressureFormer_02("Tooltip_MagneticDrivePressureFormer_02"),
    // #tr Tooltip_MagneticDrivePressureFormer_03 {\GOLD}Extruder Mode:
    Tooltip_MagneticDrivePressureFormer_03("Tooltip_MagneticDrivePressureFormer_03"),
    // #tr Tooltip_MagneticDrivePressureFormer_04 700%% faster than normal | Infinity Coil+ enable Perfect Overclock
    Tooltip_MagneticDrivePressureFormer_04("Tooltip_MagneticDrivePressureFormer_04"),
    // #tr Tooltip_MagneticDrivePressureFormer_05 {\GOLD}Bending and Forming Press and Forge Hammer Mode:
    Tooltip_MagneticDrivePressureFormer_05("Tooltip_MagneticDrivePressureFormer_05"),
    // #tr Tooltip_MagneticDrivePressureFormer_06 1500%% faster than normal | Enable Perfect Overclock
    Tooltip_MagneticDrivePressureFormer_06("Tooltip_MagneticDrivePressureFormer_06"),
    // #tr Tooltip_MagneticDrivePressureFormer_07 Extra +100%% speed multiplier per Coil Level.
    Tooltip_MagneticDrivePressureFormer_07("Tooltip_MagneticDrivePressureFormer_07"),
    // #tr Tooltip_MagneticDrivePressureFormer_08 Need Infinity Glass to use Laser energy hatch.
    Tooltip_MagneticDrivePressureFormer_08("Tooltip_MagneticDrivePressureFormer_08"),
    // #tr Tooltip_MagneticDrivePressureFormer_09 1024x Parallel.
    Tooltip_MagneticDrivePressureFormer_09("Tooltip_MagneticDrivePressureFormer_09"),
    // #tr Tooltip_MagneticDrivePressureFormer_Hatches Frame location, Osmiridium Casing.
    Tooltip_MagneticDrivePressureFormer_Hatches("Tooltip_MagneticDrivePressureFormer_Hatches"),
    // #tr Tooltip_MagneticDrivePressureFormer_EnergyHatch The white, Iridium Casing, and the bottom center.
    Tooltip_MagneticDrivePressureFormer_EnergyHatch("Tooltip_MagneticDrivePressureFormer_EnergyHatch"),

    // endregion

    // region Physical Form Switcher

    // #tr NamePhysicalFormSwitcher Physical Form Switcher
    NamePhysicalFormSwitcher("NamePhysicalFormSwitcher"),
    // #tr Tooltip_PhysicalFormSwitcher_MachineType Fluid Solidifier | Fluid Extractor | Forge Hammer
    Tooltip_PhysicalFormSwitcher_MachineType("Tooltip_PhysicalFormSwitcher_MachineType"),
    // #tr Tooltip_PhysicalFormSwitcher_00 Controller block for the Physical Form Switcher
    Tooltip_PhysicalFormSwitcher_00("Tooltip_PhysicalFormSwitcher_00"),
    // #tr Tooltip_PhysicalFormSwitcher_01 {\YELLOW}Forming Master !
    Tooltip_PhysicalFormSwitcher_01("Tooltip_PhysicalFormSwitcher_01"),
    // #tr Tooltip_PhysicalFormSwitcher_02 The ultimate method of melt operation.
    Tooltip_PhysicalFormSwitcher_02("Tooltip_PhysicalFormSwitcher_02"),
    // #tr Tooltip_PhysicalFormSwitcher_03 Has parallel equivalent to Perfect Overclock.
    Tooltip_PhysicalFormSwitcher_03("Tooltip_PhysicalFormSwitcher_03"),
    // #tr Tooltip_PhysicalFormSwitcher_04 Additional 10%% reduction in time per Voltage Tier, multiplication calculus.
    Tooltip_PhysicalFormSwitcher_04("Tooltip_PhysicalFormSwitcher_04"),
    // #tr Tooltip_PhysicalFormSwitcher_05 The Glass Tier limit the recipe voltage tier.
    Tooltip_PhysicalFormSwitcher_05("Tooltip_PhysicalFormSwitcher_05"),

    // endregion

    // region Magnetic Mixer
    // #tr NameMagneticMixer "Mini" Magnetic Mixer
    NameMagneticMixer("NameMagneticMixer"),
    // #tr Tooltip_MagneticMixer_MachineType Mixer
    Tooltip_MagneticMixer_MachineType("Tooltip_MagneticMixer_MachineType"),
    // #tr Tooltip_MagneticMixer_00 Controller block for the "Mini" Magnetic Mixer
    Tooltip_MagneticMixer_00("Tooltip_MagneticMixer_00"),
    // #tr Tooltip_MagneticMixer_01 {\RED}Watch out for the Bumps !
    Tooltip_MagneticMixer_01("Tooltip_MagneticMixer_01"),
    // #tr Tooltip_MagneticMixer_02 Looks more like a tumble washing machine.
    Tooltip_MagneticMixer_02("Tooltip_MagneticMixer_02"),
    // #tr Tooltip_MagneticMixer_03 Has parallel equivalent to Perfect Overclock.
    Tooltip_MagneticMixer_03("Tooltip_MagneticMixer_03"),
    // #tr Tooltip_MagneticMixer_04 Additional 20%% reduction in time per Voltage Tier, multiplication calculus.
    Tooltip_MagneticMixer_04("Tooltip_MagneticMixer_04"),

    // endregion

    // region MagneticDomainConstructor
    // #tr NameMagneticDomainConstructor Magnetic Domain Constructor
    NameMagneticDomainConstructor("NameMagneticDomainConstructor"),
    // #tr Tooltip_MagneticDomainConstructor_MachineType Electromagnetic Separator | Electromagnetic Polarizer
    Tooltip_MagneticDomainConstructor_MachineType("Tooltip_MagneticDomainConstructor_MachineType"),
    // #tr Tooltip_MagneticDomainConstructor_00 Controller block for the Magnetic Domain Constructor
    Tooltip_MagneticDomainConstructor_00("Tooltip_MagneticDomainConstructor_00"),
    // #tr Tooltip_MagneticDomainConstructor_01 {\DARK_GRAY}Don't give up your imagination.
    Tooltip_MagneticDomainConstructor_01("Tooltip_MagneticDomainConstructor_01"),
    // #tr Tooltip_MagneticDomainConstructor_02 Controlling the magnetic domains inside the crystal, yes that's it.
    Tooltip_MagneticDomainConstructor_02("Tooltip_MagneticDomainConstructor_02"),
    // #tr Tooltip_MagneticDomainConstructor_03 8x Parallel per Ring.(Don't use a lot of blueprints when first scanning.)
    Tooltip_MagneticDomainConstructor_03("Tooltip_MagneticDomainConstructor_03"),
    // #tr Tooltip_MagneticDomainConstructor_04 Additional 10%% reduction in time per Voltage Tier, multiplication calculus.
    Tooltip_MagneticDomainConstructor_04("Tooltip_MagneticDomainConstructor_04"),

    // endregion

    // region Silksong
    // #tr NameSilksong Silksong
    NameSilksong("NameSilksong"),
    // #tr Tooltip_Silksong_MachineType Wiremill
    Tooltip_Silksong_MachineType("Tooltip_Silksong_MachineType"),
    // #tr Tooltip_Silksong_00 Controller block for the Silksong
    Tooltip_Silksong_00("Tooltip_Silksong_00"),
    // #tr Tooltip_Silksong_01 {\WHITE}Maybe dreams aren't such a good thing ......
    Tooltip_Silksong_01("Tooltip_Silksong_01"),
    // #tr Tooltip_Silksong_02 Endless cables spew from this machine.
    Tooltip_Silksong_02("Tooltip_Silksong_02"),
    // #tr Tooltip_Silksong_03 24x Parallel per piece.
    Tooltip_Silksong_03("Tooltip_Silksong_03"),
    // #tr Tooltip_Silksong_04 Additional 10%% reduction in time per Coil Tier, multiplication calculus.
    Tooltip_Silksong_04("Tooltip_Silksong_04"),
    // endregion

    // region HolySeparator
    // #tr NameHolySeparator Holy Separator
    NameHolySeparator("NameHolySeparator"),
    // #tr Tooltip_HolySeparator_MachineType Cutter | Slicer | Lathe
    Tooltip_HolySeparator_MachineType("Tooltip_HolySeparator_MachineType"),
    // #tr Tooltip_HolySeparator_00 Controller block for the Holy Separator
    Tooltip_HolySeparator_00("Tooltip_HolySeparator_00"),
    // #tr Tooltip_HolySeparator_01 {\YELLOW}Precision {\GRAY}and {\AQUA}Grace.
    Tooltip_HolySeparator_01("Tooltip_HolySeparator_01"),
    // #tr Tooltip_HolySeparator_02 Another form of laser engraving.
    Tooltip_HolySeparator_02("Tooltip_HolySeparator_02"),
    // #tr Tooltip_HolySeparator_03 You can even slice potato chips with this.
    Tooltip_HolySeparator_03("Tooltip_HolySeparator_03"),
    // #tr Tooltip_HolySeparator_04 Extra 8x Parallel per Piece. 16 Piece enable Perfect Overclock.
    Tooltip_HolySeparator_04("Tooltip_HolySeparator_04"),
    // #tr Tooltip_HolySeparator_05 Additional 10%% reduction in time per Coil Tier, multiplication calculus.
    Tooltip_HolySeparator_05("Tooltip_HolySeparator_05"),

    // endregion

    // region SpaceScaler
    // #tr NameSpaceScaler Space Scaler
    NameSpaceScaler("NameSpaceScaler"),
    // #tr Tooltip_SpaceScaler_MachineType Compressor | Extractor | Particle Collider
    Tooltip_SpaceScaler_MachineType("Tooltip_SpaceScaler_MachineType"),
    // #tr Tooltip_SpaceScaler_00 Controller block for the Space Scaler
    Tooltip_SpaceScaler_00("Tooltip_SpaceScaler_00"),
    // #tr Tooltip_SpaceScaler_01 {\AQUA} First Look Space Technology.
    Tooltip_SpaceScaler_01("Tooltip_SpaceScaler_01"),
    // #tr Tooltip_SpaceScaler_02 Another method to operate matter.
    Tooltip_SpaceScaler_02("Tooltip_SpaceScaler_02"),
    // #tr Tooltip_SpaceScaler_03 Only if the space is manageable...
    Tooltip_SpaceScaler_03("Tooltip_SpaceScaler_03"),
    // #tr Tooltip_SpaceScaler_04 Has parallel equivalent to Perfect Overclock.
    Tooltip_SpaceScaler_04("Tooltip_SpaceScaler_04"),
    // #tr Tooltip_SpaceScaler_05 If use Ultimate Containment Field Generator, enable 10x speed multiplier.
    Tooltip_SpaceScaler_05("Tooltip_SpaceScaler_05"),
    // #tr Tooltip_SpaceScaler_06 Crude Stabilisation Field Generator block+ allowed machine Particle Collider Mode.
    Tooltip_SpaceScaler_06("Tooltip_SpaceScaler_06"),
    // #tr Tooltip_SpaceScaler_07 In Particle Collider mode, higher tier has more output.
    Tooltip_SpaceScaler_07("Tooltip_SpaceScaler_07"),

    // endregion

    // region MoleculeDeconstructor
    // #tr NameMoleculeDeconstructor Molecule Deconstructor
    NameMoleculeDeconstructor("NameMoleculeDeconstructor"),
    // #tr Tooltip_MoleculeDeconstructor_MachineType Electrolyzer | Centrifuge
    Tooltip_MoleculeDeconstructor_MachineType("Tooltip_MoleculeDeconstructor_MachineType"),
    // #tr Tooltip_MoleculeDeconstructor_00 Controller block for the Molecule Deconstructor
    Tooltip_MoleculeDeconstructor_00("Tooltip_MoleculeDeconstructor_00"),
    // #tr Tooltip_MoleculeDeconstructor_01 {\AQUA}The lightning seemed to roll down a ladder.
    Tooltip_MoleculeDeconstructor_01("Tooltip_MoleculeDeconstructor_01"),
    // #tr Tooltip_MoleculeDeconstructor_02 Separate the molecules one by one with tweezers.
    Tooltip_MoleculeDeconstructor_02("Tooltip_MoleculeDeconstructor_02"),
    // #tr Tooltip_MoleculeDeconstructor_03 Extra 24x Parallel per Piece. 16 Piece enable Perfect Overclock.
    Tooltip_MoleculeDeconstructor_03("Tooltip_MoleculeDeconstructor_03"),
    // #tr Tooltip_MoleculeDeconstructor_04 Additional 10%% reduction in time per Voltage Tier, multiplication calculus.
    Tooltip_MoleculeDeconstructor_04("Tooltip_MoleculeDeconstructor_04"),
    // #tr Tooltip_MoleculeDeconstructor_05 The Glass Tier limit the Energy hatch voltage Tier.
    Tooltip_MoleculeDeconstructor_05("Tooltip_MoleculeDeconstructor_05"),

    // endregion

    // region CrystallineInfinitier
    // #tr NameCrystallineInfinitier Crystalline Infinitier
    NameCrystallineInfinitier("NameCrystallineInfinitier"),
    // #tr Tooltip_CrystallineInfinitier_MachineType Autoclave | Crystalline Infinitier
    Tooltip_CrystallineInfinitier_MachineType("Tooltip_CrystallineInfinitier_MachineType"),
    // #tr Tooltip_CrystallineInfinitier_00 Controller block for the Crystalline Infinitier
    Tooltip_CrystallineInfinitier_00("Tooltip_CrystallineInfinitier_00"),
    // #tr Tooltip_CrystallineInfinitier_01 {\GREEN}They're here. Grow and multiply without end.
    Tooltip_CrystallineInfinitier_01("Tooltip_CrystallineInfinitier_01"),
    // #tr Tooltip_CrystallineInfinitier_02 With Gravitation Tech as a medium, we can control growth of crystalline cells more conveniently.
    Tooltip_CrystallineInfinitier_02("Tooltip_CrystallineInfinitier_02"),
    // #tr Tooltip_CrystallineInfinitier_03 Higher glass tier, higher field generator tier, higher voltage tier means higher value of parallel.
    Tooltip_CrystallineInfinitier_03("Tooltip_CrystallineInfinitier_03"),
    // #tr Tooltip_CrystallineInfinitier_04 And higher field generator tier means lower Energy cost.
    Tooltip_CrystallineInfinitier_04("Tooltip_CrystallineInfinitier_04"),
    // #tr Tooltip_CrystallineInfinitier_05 Crude Stabilisation Field Generator enable Perfect Overclock.
    Tooltip_CrystallineInfinitier_05("Tooltip_CrystallineInfinitier_05"),
    // #tr Tooltip_CrystallineInfinitier_06 Extra +300%% speed in Autoclave mode.
    Tooltip_CrystallineInfinitier_06("Tooltip_CrystallineInfinitier_06"),

    // endregion

    // region DSPLauncher
    // #tr NameDSPLauncher Dyson Sphere Module Launch Site
    NameDSPLauncher("NameDSPLauncher"),
    // #tr Tooltip_DSPLauncher_MachineType Dyson Sphere Program: Launch Site
    Tooltip_DSPLauncher_MachineType("Tooltip_DSPLauncher_MachineType"),
    // #tr Tooltip_DSPLauncher_00 Controller block for the Dyson Sphere Module Launch Site
    Tooltip_DSPLauncher_00("Tooltip_DSPLauncher_00"),
    // #tr Tooltip_DSPLauncher_01 {\BLUE}"Low altitude flight..."
    Tooltip_DSPLauncher_01("Tooltip_DSPLauncher_01"),
    // #tr Tooltip_DSPLauncher_02 Launching Dyson Sphere components into Dyson Sphere orbit to form a Dyson Sphere.
    Tooltip_DSPLauncher_02("Tooltip_DSPLauncher_02"),
    // #tr Tooltip_DSPLauncher_03 No overclock and no extra parallel.
    Tooltip_DSPLauncher_03("Tooltip_DSPLauncher_03"),
    // #tr Tooltip_DSPLauncher_04 Higher tier of Elevator Module means faster launching.
    Tooltip_DSPLauncher_04("Tooltip_DSPLauncher_04"),
    // #tr Tooltip_DSPLauncher_05 Inputting Space Warper will enable overlord mode. Reduce launch intervals.
    Tooltip_DSPLauncher_05("Tooltip_DSPLauncher_05"),
    // #tr Tooltip_DSPLauncher_06 Joining the wireless EU network when without installing an energy hatch.
    Tooltip_DSPLauncher_06("Tooltip_DSPLauncher_06"),
    // #tr Tooltip_DSPLauncher_2_01 Final progress time = recipe time / ( module tier * 1 or 30 in overload mode )
    Tooltip_DSPLauncher_2_01("Tooltip_DSPLauncher_2_01"),
    // #tr Tooltip_DSPLauncher_2_02 Every Space Warper will provide (default) 15 minutes of overload mode.
    Tooltip_DSPLauncher_2_02("Tooltip_DSPLauncher_2_02"),
    // #tr Tooltip_DSPLauncher_2_03 Input Space Warper will be consumed immediately.
    Tooltip_DSPLauncher_2_03("Tooltip_DSPLauncher_2_03"),
    // #tr Tooltip_DSPLauncher_2_04 Converted to remaining time of overload mode.
    Tooltip_DSPLauncher_2_04("Tooltip_DSPLauncher_2_04"),

    // endregion

    // region DSPReceiver
    // #tr NameDSPReceiver Dyson Sphere Ray Receiving Station
    NameDSPReceiver("NameDSPReceiver"),
    // #tr Tooltip_DSPReceiver_MachineType Dyson Sphere Program: Ray Receiving Station
    Tooltip_DSPReceiver_MachineType("Tooltip_DSPReceiver_MachineType"),
    // #tr Tooltip_DSPReceiver_00 Controller block for the Dyson Sphere Ray Receiving Station.
    Tooltip_DSPReceiver_00("Tooltip_DSPReceiver_00"),
    // #tr Tooltip_DSPReceiver_01 {\DARK_PURPLE}{\BOLD}You hold in your hands the true power of Master Nebula ...
    Tooltip_DSPReceiver_01("Tooltip_DSPReceiver_01"),
    // #tr Tooltip_DSPReceiver_02 Receive high-energy rays transmitted back from the Dyson Cloud or the Dyson Sphere.
    Tooltip_DSPReceiver_02("Tooltip_DSPReceiver_02"),
    // #tr Tooltip_DSPReceiver_03 The received energy can be exported directly to the Wireless EU Net or Dynamo Hatches or stored as Critical Photons.
    Tooltip_DSPReceiver_03("Tooltip_DSPReceiver_03"),
    // #tr Tooltip_DSPReceiver_04 Ratio of the requesting from Dyson Sphere power point can be limited by putting Integrated Circuit into controller block.
    Tooltip_DSPReceiver_04("Tooltip_DSPReceiver_04"),
    // #tr Tooltip_DSPReceiver_05 At the same time, the maximum requested power point is 1024A Max (default).
    Tooltip_DSPReceiver_05("Tooltip_DSPReceiver_05"),
    // #tr Tooltip_DSPReceiver_06 Actual output power is affected by stellar and planetary coefficients.
    Tooltip_DSPReceiver_06("Tooltip_DSPReceiver_06"),
    // #tr Tooltip_DSPReceiver_07 Inputting Gravitational Lens will enable intensify mode. Increase actual output power.
    Tooltip_DSPReceiver_07("Tooltip_DSPReceiver_07"),
    // #tr Tooltip_DSPReceiver_08 Joining the wireless EU network when without installing a dynamo hatch.
    Tooltip_DSPReceiver_08("Tooltip_DSPReceiver_08"),
    // #tr Tooltip_DSPReceiver_02_01 Actual Generating EU = used power point * stellar coefficient * planet coefficient * 1 or 2 in intensify mode
    Tooltip_DSPReceiver_02_01("Tooltip_DSPReceiver_02_01"),
    // #tr Tooltip_DSPReceiver_02_02 Personal Dimension was been classified as Overworld(Earth).
    Tooltip_DSPReceiver_02_02("Tooltip_DSPReceiver_02_02"),
    // #tr Tooltip_DSPReceiver_02_03 Every Gravitational Lens will provide (default) 10 minutes of intensify mode.
    Tooltip_DSPReceiver_02_03("Tooltip_DSPReceiver_02_03"),
    // #tr Tooltip_DSPReceiver_02_04 Input Gravitational Lens will be consumed immediately.
    Tooltip_DSPReceiver_02_04("Tooltip_DSPReceiver_02_04"),
    // #tr Tooltip_DSPReceiver_02_05 Converted to remaining time of intensify mode.
    Tooltip_DSPReceiver_02_05("Tooltip_DSPReceiver_02_05"),
    // #tr Tooltip_DSPReceiver_02_06 Requesting ratio = Integrated Circuit Number / Stack Size
    Tooltip_DSPReceiver_02_06("Tooltip_DSPReceiver_02_06"),
    // #tr Tooltip_DSPReceiver_02_07 Put §b§l§oAstral Array Fabricator§7 into controller slot then this machine can request over 1024A Max power point.
    Tooltip_DSPReceiver_02_07("Tooltip_DSPReceiver_02_07"),
    // #tr Tooltip_DSPReceiver_02_08 Final requesting power point limit = Astral Array Fabricator amount * 1024A Max
    Tooltip_DSPReceiver_02_08("Tooltip_DSPReceiver_02_08"),

    // endregion

    // region ArtificialStar
    // #tr NameArtificialStar Artificial Star
    NameArtificialStar("NameArtificialStar"),
    // #tr Tooltip_ArtificialStar_MachineType Dyson Sphere Program: Annihilation Generator
    Tooltip_ArtificialStar_MachineType("Tooltip_ArtificialStar_MachineType"),
    // #tr Tooltip_ArtificialStar_Controller Controller block for the Artificial Star
    Tooltip_ArtificialStar_Controller("Tooltip_ArtificialStar_Controller"),
    // #tr Tooltip_ArtificialStar_00 {\LIGHT_PURPLE}{\BOLD}All you need to do is to let the proton and antiproton
    // beams
    Tooltip_ArtificialStar_00("Tooltip_ArtificialStar_00"),
    // #tr Tooltip_ArtificialStar_01 {\LIGHT_PURPLE}{\BOLD} pass silently from both ends into the annihilation
    // constrainer. Easy peasy!
    Tooltip_ArtificialStar_01("Tooltip_ArtificialStar_01"),
    // #tr Tooltip_ArtificialStar_02 It owes its simple shape to the elegance of the theory.
    Tooltip_ArtificialStar_02("Tooltip_ArtificialStar_02"),
    // #tr Tooltip_ArtificialStar_03 Actual output power is affected by 3 types tiered block.
    Tooltip_ArtificialStar_03("Tooltip_ArtificialStar_03"),
    // #tr Tooltip_ArtificialStar_04 At the same time, higher tier increase the probability of recovering materials.
    Tooltip_ArtificialStar_04("Tooltip_ArtificialStar_04"),
    // #tr Tooltip_ArtificialStar_05 Continuous operation improves power generation.
    Tooltip_ArtificialStar_05("Tooltip_ArtificialStar_05"),
    // #tr Tooltip_ArtificialStar_06 Only and must install 1 input bus.
    Tooltip_ArtificialStar_06("Tooltip_ArtificialStar_06"),
    // #tr Tooltip_ArtificialStar_07 Energy will output to Wireless EU Net directly.
    Tooltip_ArtificialStar_07("Tooltip_ArtificialStar_07"),
    // #tr Tooltip_ArtificialStar_08 Use screwdriver to enable/disable animations.
    Tooltip_ArtificialStar_08("Tooltip_ArtificialStar_08"),
    // #tr Tooltip_ArtificialStar_02_01 Output multiplier = tTime^0.25 * tDim^0.25 * 1.588186^(tStabilisation - 2)
    Tooltip_ArtificialStar_02_01("Tooltip_ArtificialStar_02_01"),
    // #tr Tooltip_ArtificialStar_02_02 Actual Generating EU = recipe value * output multiplier * Rewards for continuous
    // operation
    Tooltip_ArtificialStar_02_02("Tooltip_ArtificialStar_02_02"),
    // #tr Tooltip_ArtificialStar_02_03 Recovering probability = tTime * tDim * tStabilisation / 1000
    Tooltip_ArtificialStar_02_03("Tooltip_ArtificialStar_02_03"),
    // #tr Tooltip_ArtificialStar_02_04 Input fuels will be consumed at once, process 6.4s (default), and output the
    // corresponding EU.
    Tooltip_ArtificialStar_02_04("Tooltip_ArtificialStar_02_04"),
    // #tr Tooltip_ArtificialStar_02_05 Rewards multiplier 1%% increase per run when continuous operation.
    Tooltip_ArtificialStar_02_05("Tooltip_ArtificialStar_02_05"),
    // #tr Tooltip_ArtificialStar_02_06 Maximum is 150%% , Minimum is 100%% when uncontinuous.
    Tooltip_ArtificialStar_02_06("Tooltip_ArtificialStar_02_06"),

    // endregion

    // region Dyson Sphere Program Information
    // #tr Tooltip_DSPInfo_launch_01 Launching Solar Sail increase Solar Sail amount of current Galaxy's Dyson Sphere.
    Tooltip_DSPInfo_launch_01("Tooltip_DSPInfo_launch_01"),
    // #tr Tooltip_DSPInfo_launch_02 Launching Small Launch Vehicle increase Node amount of current Galaxy's Dyson Sphere.
    Tooltip_DSPInfo_launch_02("Tooltip_DSPInfo_launch_02"),
    // #tr Tooltip_DSPInfo_00 DSP Power Point = Solar Sail Power Point (default 524288) * Solar Sail amount * (Node + 1)^0.5
    Tooltip_DSPInfo_00("Tooltip_DSPInfo_00"),
    // #tr Tooltip_DSPInfo_01 Every Node can absorb (default) 256 Solar Sails.
    Tooltip_DSPInfo_01("Tooltip_DSPInfo_01"),
    // #tr Tooltip_DSPInfo_02 If unabsorbed solar sails amount is larger than 2048,
    Tooltip_DSPInfo_02("Tooltip_DSPInfo_02"),
    // #tr Tooltip_DSPInfo_03 the excess may be destroyed.
    Tooltip_DSPInfo_03("Tooltip_DSPInfo_03"),
    // #tr Tooltip_DSPInfo_04 Every 30 minutes has 1/5000 chance to decrease Solar Sail amount.
    Tooltip_DSPInfo_04("Tooltip_DSPInfo_04"),
    // #tr Tooltip_DSPInfo_05 In decreasing, every Dyson Sphere has 1/4 chance to destroyed Solar Sail amount.
    Tooltip_DSPInfo_05("Tooltip_DSPInfo_05"),
    // #tr Tooltip_DSPInfo_06 The amount of destroyed is the excess' 1/2 .
    Tooltip_DSPInfo_06("Tooltip_DSPInfo_06"),

    // endregion

    // region MiracleDoor
    // #tr NameMiracleDoor Miracle Door
    NameMiracleDoor("NameMiracleDoor"),
    // #tr Tooltip_MiracleDoor_MachineType Stellar Forge | Fluid Alloy Cooker
    Tooltip_MiracleDoor_MachineType("Tooltip_MiracleDoor_MachineType"),
    // #tr Tooltip_MiracleDoor_Controller Controller block for the Miracle Door
    Tooltip_MiracleDoor_Controller("Tooltip_MiracleDoor_Controller"),
    // #tr Tooltip_MiracleDoor_00 {\GOLD}{\BOLD}Mere mortals can't even begin to understand the progress we've made.
    Tooltip_MiracleDoor_00("Tooltip_MiracleDoor_00"),
    // #tr Tooltip_MiracleDoor_01 Enslaving Stellaris to work for us.
    Tooltip_MiracleDoor_01("Tooltip_MiracleDoor_01"),
    // #tr Tooltip_MiracleDoor_02 No matter how large the workload, it can be done in one time.
    Tooltip_MiracleDoor_02("Tooltip_MiracleDoor_02"),
    // #tr Tooltip_MiracleDoor_03 No matter how large the workload, it need one Critical Photon to start.
    Tooltip_MiracleDoor_03("Tooltip_MiracleDoor_03"),
    // #tr Tooltip_MiracleDoor_04 Power consumption: Fluid Alloy Cooker §c1600%% | Stellar Forge §c6400%%
    Tooltip_MiracleDoor_04("Tooltip_MiracleDoor_04"),
    // #tr Tooltip_MiracleDoor_05 Directly get EU from the Wireless EU Net.
    Tooltip_MiracleDoor_05("Tooltip_MiracleDoor_05"),
    // #tr Tooltip_MiracleDoor_06 Warning! If trying to start machine when Wireless EU Net has not enough EU,
    Tooltip_MiracleDoor_06("Tooltip_MiracleDoor_06"),
    // #tr Tooltip_MiracleDoor_07 the materials will fade.
    Tooltip_MiracleDoor_07("Tooltip_MiracleDoor_07"),
    // #tr Tooltip_MiracleDoor_08 Put Integrated Circuit into Controller block to decrease process time interval.
    Tooltip_MiracleDoor_08("Tooltip_MiracleDoor_08"),
    // #tr Tooltip_MiracleDoor_2_01 Each run takes the same amount of time, (ABS) 25.6s | (EBF) 128s default.
    Tooltip_MiracleDoor_2_01("Tooltip_MiracleDoor_2_01"),
    // #tr Tooltip_MiracleDoor_2_02 If putting Integrated Circuit into Controller block slot,
    Tooltip_MiracleDoor_2_02("Tooltip_MiracleDoor_2_02"),
    // #tr Tooltip_MiracleDoor_2_03 actual progress time = default / (Integrated Circuit Number * Stack Size)
    Tooltip_MiracleDoor_2_03("Tooltip_MiracleDoor_2_03"),
    // #tr Tooltip_MiracleDoor_2_04 Actual cost EU = recipe value * 16 * (Integrated Circuit Number * Stack Size)
    Tooltip_MiracleDoor_2_04("Tooltip_MiracleDoor_2_04"),
    // #tr Tooltip_MiracleDoor_2_05 ABS mode each run cost 1 Critical Photon to start.
    Tooltip_MiracleDoor_2_05("Tooltip_MiracleDoor_2_05"),

    // endregion

    // region OreProcessingFactory
    // #tr NameOreProcessingFactory General Ore Processing Factory TST
    NameOreProcessingFactory("NameOreProcessingFactory"),
    // #tr Tooltip_OreProcessingFactory_MachineType Ore Processor
    Tooltip_OreProcessingFactory_MachineType("Tooltip_OreProcessingFactory_MachineType"),
    // #tr Tooltip_OreProcessingFactory_Controller Controller block for the General Ore Processing Factory TST
    Tooltip_OreProcessingFactory_Controller("Tooltip_OreProcessingFactory_Controller"),
    // #tr Tooltip_OreProcessingFactory_01 {\WHITE}Engineering is the art of directing the great sources of power in nature for the use and convenience of man.
    Tooltip_OreProcessingFactory_01("Tooltip_OreProcessingFactory_01"),
    // #tr Tooltip_OreProcessingFactory_02 The ores will line up and go in through the entrance and out through the exit.
    Tooltip_OreProcessingFactory_02("Tooltip_OreProcessingFactory_02"),
    // #tr Tooltip_OreProcessingFactory_03 This machine will not do overclock. Progress time is always 6.4s (default) .
    Tooltip_OreProcessingFactory_03("Tooltip_OreProcessingFactory_03"),
    // #tr Tooltip_OreProcessingFactory_04 It will process as many inputs as possible at once, if power allow.
    Tooltip_OreProcessingFactory_04("Tooltip_OreProcessingFactory_04"),
    // #tr Tooltip_OreProcessingFactory_05 Consume 3200L Lubricant every 12.8s (default).
    Tooltip_OreProcessingFactory_05("Tooltip_OreProcessingFactory_05"),
    // #tr Tooltip_OreProcessingFactory_06 Non-ore inputs will be transferred to the output bus.
    Tooltip_OreProcessingFactory_06("Tooltip_OreProcessingFactory_06"),

    // endregion

    // region CircuitConverter
    // #tr NameCircuitConverter General Circuit Converter
    NameCircuitConverter("NameCircuitConverter"),
    // #tr Tooltip_CircuitConverter_MachineType Circuit Converter
    Tooltip_CircuitConverter_MachineType("Tooltip_CircuitConverter_MachineType"),
    // #tr Tooltip_CircuitConverter_Controller Controller block for the General Circuit Converter
    Tooltip_CircuitConverter_Controller("Tooltip_CircuitConverter_Controller"),
    // #tr Tooltip_CircuitConverter_01 Transform input circuits to Any Circuit.
    Tooltip_CircuitConverter_01("Tooltip_CircuitConverter_01"),
    // #tr Tooltip_CircuitConverter_2_01 Maximum 8 In/Output Buses.
    Tooltip_CircuitConverter_2_01("Tooltip_CircuitConverter_2_01"),
    // endregion

    // region LargeIndustrialCokingFactory
    // #tr NameLargeIndustrialCokingFactory Large Industrial Coking Factory
    NameLargeIndustrialCokingFactory("NameLargeIndustrialCokingFactory"),
    // #tr Tooltip_LargeIndustrialCokingFactory_MachineType Coke Oven
    Tooltip_LargeIndustrialCokingFactory_MachineType("Tooltip_LargeIndustrialCokingFactory_MachineType"),
    // #tr Tooltip_LargeIndustrialCokingFactory_Controller Controller block for the Large Industrial Coking Factory
    Tooltip_LargeIndustrialCokingFactory_Controller("Tooltip_LargeIndustrialCokingFactory_Controller"),
    // #tr Tooltip_LargeIndustrialCokingFactory_01 {\DARK_AQUA}{\BOLD}Seizing like a ravenous beast, lavishing like a breezing east.
    Tooltip_LargeIndustrialCokingFactory_01("Tooltip_LargeIndustrialCokingFactory_01"),
    // #tr Tooltip_LargeIndustrialCokingFactory_02 Process endless inputs in one time.
    Tooltip_LargeIndustrialCokingFactory_02("Tooltip_LargeIndustrialCokingFactory_02"),
    // #tr Tooltip_LargeIndustrialCokingFactory_03 Higher tier of coil make machine more faster.
    Tooltip_LargeIndustrialCokingFactory_03("Tooltip_LargeIndustrialCokingFactory_03"),
    // endregion

    // region Elvenworkshop
    // #tr NameElvenWorkshop ElvenWorkshop
    NameElvenWorkshop("NameElvenWorkshop"),
    // #tr Tooltip_ElvenWorkshop_MachineType Mana Infuser/Rune Engraver
    Tooltip_ElvenWorkshop_MachineType("Tooltip_ElvenWorkshop_MachineType"),
    // endregion

    // region HyperSpacetimeTransformer
    // #tr NameHyperSpacetimeTransformer HyperSpacetimeTransformer
    NameHyperSpacetimeTransformer("NameHyperSpacetimeTransformer"),
    // #tr Tooltip_HyperSpacetimeTransformer_MachineType HyperSpacetimeTransformer
    Tooltip_HyperSpacetimeTransformer_MachineType("Tooltip_HyperSpacetimeTransformer_MachineType"),
    // #tr Tooltip_HyperSpacetimeTransformer_00 To change the material itself in a higher dimension.
    Tooltip_HyperSpacetimeTransformer_00("Tooltip_HyperSpacetimeTransformer_00"),
    // #tr Tooltip_HyperSpacetimeTransformer_01 Molecular Transformer Mode
    Tooltip_HyperSpacetimeTransformer_01("Tooltip_HyperSpacetimeTransformer_01"),
    // #tr Tooltip_HyperSpacetimeTransformer_02 Parallel:Product of three types of field generators.
    Tooltip_HyperSpacetimeTransformer_02("Tooltip_HyperSpacetimeTransformer_02"),
    // #tr Tooltip_HyperSpacetimeTransformer_03 Tier 9 field generator will decrease energy use by 25%, max 75%.
    Tooltip_HyperSpacetimeTransformer_03("Tooltip_HyperSpacetimeTransformer_03"),
    // #tr Tooltip_HyperSpacetimeTransformer_04 {\SPACE}
    Tooltip_HyperSpacetimeTransformer_04("Tooltip_HyperSpacetimeTransformer_04"),
    // #tr Tooltip_HyperSpacetimeTransformer_05 {\SPACE}
    Tooltip_HyperSpacetimeTransformer_05("Tooltip_HyperSpacetimeTransformer_05"),
    // #tr Tooltip_HyperSpacetimeTransformer_06 {\SPACE}
    Tooltip_HyperSpacetimeTransformer_06("Tooltip_HyperSpacetimeTransformer_06"),

    // region Scavenger
    // #tr NameScavenger Scavenger
    NameScavenger("NameScavenger"),
    // #tr Tooltip_Scavenger_MachineType Sifter
    Tooltip_Scavenger_MachineType("Tooltip_Scavenger_MachineType"),
    // #tr Tooltip_Scavenger_Controller Controller block for the Scavenger
    Tooltip_Scavenger_Controller("Tooltip_Scavenger_Controller"),
    // #tr Tooltip_Scavenger_01 {\BOLD}I like pigs. Dogs look up to us. Cats look down on us. Pigs treat us as equals.
    Tooltip_Scavenger_01("Tooltip_Scavenger_01"),
    // #tr Tooltip_Scavenger_02 Has parallel equivalent to Perfect Overclock.
    Tooltip_Scavenger_02("Tooltip_Scavenger_02"),
    // #tr Tooltip_Scavenger_03 Only uses 60%% of the EU/t normally required.
    Tooltip_Scavenger_03("Tooltip_Scavenger_03"),
    // #tr Tooltip_Scavenger_04 Additional 20%% reduction in time per Voltage Tier, multiplication calculus.
    Tooltip_Scavenger_04("Tooltip_Scavenger_04"),
    // endregion

    // region AdvancedMegaOilCracker
    // #tr NameAdvancedMegaOilCracker Advanced Mega Oil Cracker
    NameAdvancedMegaOilCracker("NameAdvancedMegaOilCracker"),
    // #tr Tooltips_AdvancedMegaOilCracker_MachineType Cracker
    Tooltips_AdvancedMegaOilCracker_MachineType("Tooltips_AdvancedMegaOilCracker_MachineType"),
    // #tr Tooltips_AdvancedMegaOilCracker_Controller Controller block for the Advanced Mega Oil Cracker
    Tooltips_AdvancedMegaOilCracker_Controller("Tooltips_AdvancedMegaOilCracker_Controller"),
    // #tr Tooltips_AdvancedMegaOilCracker_01 {\ITALIC}Freedom as a basis for self-government.
    Tooltips_AdvancedMegaOilCracker_01("Tooltips_AdvancedMegaOilCracker_01"),
    // #tr Tooltips_AdvancedMegaOilCracker_02 As the Mega Oil Cracker do.
    Tooltips_AdvancedMegaOilCracker_02("Tooltips_AdvancedMegaOilCracker_02"),
    // endregion

    // region InfiniteAirHatch
    // #tr NameInfiniteAirHatch Infinite Air Hatch
    NameInfiniteAirHatch("NameInfiniteAirHatch"),
    // #tr NameManaHatch Mana Hatch
    NameManaHatch("NameManaHatch"),
    // #tr NameInfiniteWirelessDynamoHatch Infinite Wireless Dynamo Hatch
    NameInfiniteWirelessDynamoHatch("NameInfiniteWirelessDynamoHatch"),
    // #tr NameDualInputBuffer_IV Dual Input Buffer (IV)
    NameDualInputBuffer_IV("NameDualInputBuffer_IV"),
    // #tr NameDualInputBuffer_LuV Dual Input Buffer (LuV)
    NameDualInputBuffer_LuV("NameDualInputBuffer_LuV"),
    // #tr NameDualInputBuffer_ZPM Dual Input Buffer (ZPM)
    NameDualInputBuffer_ZPM("NameDualInputBuffer_ZPM"),
    // #tr NameDualInputBuffer_UV Dual Input Buffer (UV)
    NameDualInputBuffer_UV("NameDualInputBuffer_UV"),

    // endregion

    // region megaUniverseSpaceStation
    // #tr NameMegaUniversalSpaceStation Mega Universal Space Station
    NameMegaUniversalSpaceStation("NameMegaUniversalSpaceStation"),
    // #tr Tooltip_MegaUniversalSpaceStation_MachineType space station
    Tooltip_MegaUniversalSpaceStation_MachineType("Tooltip_MegaUniversalSpaceStation_MachineType"),
    // #tr Tooltip_MegaUniversalSpaceStation_00 Use auto build item to build instead of build your self
    Tooltip_MegaUniversalSpaceStation_00("Tooltip_MegaUniversalSpaceStation_00"),
    // #tr Tooltip_MegaUniversalSpaceStation_01 Auto-SpaceStation build core
    Tooltip_MegaUniversalSpaceStation_01("Tooltip_MegaUniversalSpaceStation_01"),
    // #tr Tooltip_MegaUniversalSpaceStation_02 If your station broke, you can put fix block inside the input hatch to fix it
    Tooltip_MegaUniversalSpaceStation_02("Tooltip_MegaUniversalSpaceStation_02"),
    // #tr Tooltip_MegaUniversalSpaceStation_03 temp
    Tooltip_MegaUniversalSpaceStation_03("Tooltip_MegaUniversalSpaceStation_03"),
    // #tr Tooltip_MegaUniversalSpaceStation_04 temp
    Tooltip_MegaUniversalSpaceStation_04("Tooltip_MegaUniversalSpaceStation_04"),
    // #tr Tooltip_MegaUniversalSpaceStation_05 temp
    Tooltip_MegaUniversalSpaceStation_05("Tooltip_MegaUniversalSpaceStation_05"),
    // #tr Tooltip_MegaUniversalSpaceStation_06 temp
    Tooltip_MegaUniversalSpaceStation_06("Tooltip_MegaUniversalSpaceStation_06"),

    // #tr NameStellarMaterialSiphon Stellar Material Siphon
    NameStellarMaterialSiphon("NameStellarMaterialSiphon"),
    // #tr Tooltip_MegaUniversalSpaceStation_MachineType Siphon
    Tooltip_NameStellarMaterialSiphon("Tooltip_NameStellarMaterialSiphon"),

    // endregion

    // region MegaPrimitiveBlastFurnace
    // #tr NameMegaBrickedBlastFurnace Mega Bricked Blast Furnace
    NameMegaBrickedBlastFurnace("NameMegaBrickedBlastFurnace"),
    // #tr Tooltip_MegaBrickedBlastFurnace_MachineType Blast Furnace
    Tooltip_MegaBrickedBlastFurnace_MachineType("Tooltip_MegaBrickedBlastFurnace_MachineType"),
    // #tr Tooltip_MegaBrickedBlastFurnace_Controller Controller block for the Mega Bricked Blast Furnace
    Tooltip_MegaBrickedBlastFurnace_Controller("Tooltip_MegaBrickedBlastFurnace_Controller"),
    // #tr Tooltip_MegaBrickedBlastFurnace_00 {\WHITE}Who could ever imagine the power of the Steam Age?
    Tooltip_MegaBrickedBlastFurnace_00("Tooltip_MegaBrickedBlastFurnace_00"),
    // #tr Tooltip_MegaBrickedBlastFurnace_01 consume iron/wrought iron ingots and coke coals (blocks) to produce steel (and ash byproduct)
    Tooltip_MegaBrickedBlastFurnace_01("Tooltip_MegaBrickedBlastFurnace_01"),
    // #tr Tooltip_MegaBrickedBlastFurnace_02 Default recipe time is 240s. More wrought iron and coal input will reduce process time.
    Tooltip_MegaBrickedBlastFurnace_02("Tooltip_MegaBrickedBlastFurnace_02"),
    // #tr Tooltip_MegaBrickedBlastFurnace_03 actual progress time = default x parallels /((1 + 4 x Ratio of wrought iron input) x sqrt(Coke coal input))
    Tooltip_MegaBrickedBlastFurnace_03("Tooltip_MegaBrickedBlastFurnace_03"),
    // #tr Tooltip_MegaBrickedBlastFurnace_04 process 50% of (wrought) iron input and consume all coke coal input at once.
    Tooltip_MegaBrickedBlastFurnace_04("Tooltip_MegaBrickedBlastFurnace_04"),
    // #tr Tooltip_MegaBrickedBlastFurnace_05 minimum coke coal requirement:2 x (wrought) iron processed
    Tooltip_MegaBrickedBlastFurnace_05("Tooltip_MegaBrickedBlastFurnace_05"),
    // #tr Tooltip_MegaBrickedBlastFurnace_06 Takes {\RED}8" {\GRAY} hours of continuous run time to achieve maximum efficiency.
    Tooltip_MegaBrickedBlastFurnace_06("Tooltip_MegaBrickedBlastFurnace_06"),
    // #tr Tooltip_MegaBrickedBlastFurnace_07 This improve coal efficiency by up to {\RED}800%{\GRAY}. Reduce minimum coal requirement and calculate in actual progress time.
    Tooltip_MegaBrickedBlastFurnace_07("Tooltip_MegaBrickedBlastFurnace_07"),
    // #tr Tooltip_MegaBrickedBlastFurnace_08 {\YELLOW}It is recommended not to force yourself to build it until you have enough resources.
    Tooltip_MegaBrickedBlastFurnace_08("Tooltip_MegaBrickedBlastFurnace_08"),

    // #tr Tooltip_MegaBrickedBlastFurnace_09 {\AQUA}Use a screwdriver to switch to primitive mode so you can process all primitive recipes here, but you cannot use wrought iron anymore
    Tooltip_MegaBrickedBlastFurnace_09("Tooltip_MegaBrickedBlastFurnace_09"),
    // #tr textMegaBrickedBlastFurnaceTips {\YELLOW}Dirt must be Horizontal dirt in Chisel Mod!
    textMegaBrickedBlastFurnaceTips("textMegaBrickedBlastFurnaceTips"),
    // #tr textMegaBrickedBlastFurnaceLocation any Bronze Plated Bricks, 0-6x
    textMegaBrickedBlastFurnaceLocation("textMegaBrickedBlastFurnaceLocation"),

    // region BiosphereIII
    // #tr NameBiosphereIII Biosphere III
    NameBiosphereIII("NameBiosphereIII"),
    // #tr Tooltip_BiosphereIII_MachineType Bacterial Vat | Brewing Machine | Fermenter
    Tooltip_BiosphereIII_MachineType("Tooltip_BiosphereIII_MachineType"),
    // #tr Tooltip_BiosphereIII_Controller Controller block for Biosphere III
    Tooltip_BiosphereIII_Controller("Tooltip_BiosphereIII_Controller"),
    // #tr Tooltip_BiosphereIII_00 {\AQUA}{\BOLD}Control the thoughts of those microorganisms...
    Tooltip_BiosphereIII_00("Tooltip_BiosphereIII_00"),
    // #tr BiosphereIII_Mode_00 {\GOLD}----- Bacterial Vat Mode -----
    BiosphereIII_Mode_00("BiosphereIII_Mode_00"),
    // #tr Tooltip_BiosphereIII_Mode0_00 Need Petri Dish in controller slot
    Tooltip_BiosphereIII_Mode0_00("Tooltip_BiosphereIII_Mode0_00"),
    // #tr Tooltip_BiosphereIII_Mode0_01 Every Petri Dish provides 4 parallel
    Tooltip_BiosphereIII_Mode0_01("Tooltip_BiosphereIII_Mode0_01"),
    // #tr Tooltip_BiosphereIII_Mode0_02 Keep the Output Hatch always half filled for maximum efficiency
    Tooltip_BiosphereIII_Mode0_02("Tooltip_BiosphereIII_Mode0_02"),
    // #tr BiosphereIII_Mode_01 {\GOLD}----- Bacterial Vat Automation Mode -----
    BiosphereIII_Mode_01("BiosphereIII_Mode_01"),
    // #tr Tooltip_BiosphereIII_Mode1_00 Need Petri Dish in controller slot
    Tooltip_BiosphereIII_Mode1_00("Tooltip_BiosphereIII_Mode1_00"),
    // #tr Tooltip_BiosphereIII_Mode1_01 Every Petri Dish provides 1 parallel
    Tooltip_BiosphereIII_Mode1_01("Tooltip_BiosphereIII_Mode1_01"),
    // #tr Tooltip_BiosphereIII_Mode1_02 Advanced artificial intelligence controls the breeding of bacteria
    Tooltip_BiosphereIII_Mode1_02("Tooltip_BiosphereIII_Mode1_02"),
    // #tr Tooltip_BiosphereIII_Mode1_03 Original efficiency of control is 40% of the maximum. Each glass tier over recipe requirement improve the efficiency by 15%.
    Tooltip_BiosphereIII_Mode1_03("Tooltip_BiosphereIII_Mode1_03"),
    // #tr BiosphereIII_Mode_02 {\GOLD}----- Brewing Machine Mode -----
    BiosphereIII_Mode_02("BiosphereIII_Mode_02"),
    // #tr BiosphereIII_Mode_03 {\GOLD}----- Fermenter Mode -----
    BiosphereIII_Mode_03("BiosphereIII_Mode_03"),
    // #tr Tooltip_BiosphereIII_Mode2n3_00 Don't need Petri Dish
    Tooltip_BiosphereIII_Mode2n3_00("Tooltip_BiosphereIII_Mode2n3_00"),
    // #tr Tooltip_BiosphereIII_Mode2n3_01 Each glass tier over HV provides 4 times parallel
    Tooltip_BiosphereIII_Mode2n3_01("Tooltip_BiosphereIII_Mode2n3_01"),
    // #tr Tooltip_BiosphereIII_Mode2n3_02 EV glass provides 4 parallel, IV glass provides 16 parallel, etc.
    Tooltip_BiosphereIII_Mode2n3_02("Tooltip_BiosphereIII_Mode2n3_02"),
    // #tr textBiosphereIIIRadioHatch Radiation Hatch: 0-1x
    textBiosphereIIIRadioHatch("textBiosphereIIIRadioHatch"),
    // #tr textBiosphereIIIHatchLocation Any Bottom Clean Stainless Steel Machine Casing
    textBiosphereIIIHatchLocation("textBiosphereIIIHatchLocation"),
    // #tr BiosphereIIIEfficiency Efficiency:
    BiosphereIIIEfficiency("BiosphereIIIEfficiency"),
    // endregion

    // region Egg Generator
    // #tr NameMegaEggGenerator Tower of Abstraction
    NameMegaEggGenerator("NameMegaEggGenerator"),
    // #tr Tooltip_MegaEggGenerator_MachineType Magical Energy Absorber
    Tooltip_MegaEggGenerator_MachineType("Tooltip_MegaEggGenerator_MachineType"),
    // #tr Tooltip_MegaEggGenerator_Controller Controller block for the Tower of Abstraction
    Tooltip_MegaEggGenerator_Controller("Tooltip_MegaEggGenerator_Controller"),
    // #tr Tooltip_MegaEggGenerator_00 This is where the {\RED}ulti{\AQUA}mate"+ {\GOLD} des{\BLUE}tiny{\GRAY} of the Dragon's Children lies.
    Tooltip_MegaEggGenerator_00("Tooltip_MegaEggGenerator_00"),
    // #tr Tooltip_MegaEggGenerator_01 With the help of the Magic Egg, it draws in endless magical power as effortlessly as a soul-sucking sorcerer.
    Tooltip_MegaEggGenerator_01("Tooltip_MegaEggGenerator_01"),
    // #tr Tooltip_MegaEggGenerator_02 Every dragon egg generates 1A EV & every creeper's generates 1A HV.
    Tooltip_MegaEggGenerator_02("Tooltip_MegaEggGenerator_02"),
    // #tr Tooltip_MegaEggGenerator_03 Infinity egg generates 2A IV, but you can put only one for one each piece you add.
    Tooltip_MegaEggGenerator_03("Tooltip_MegaEggGenerator_03"),
    // #tr Tooltip_MegaEggGenerator_04 But quantitative change leads to qualitative change,
    Tooltip_MegaEggGenerator_04("Tooltip_MegaEggGenerator_04"),
    // #tr Tooltip_MegaEggGenerator_05 Every 2^n pieces give 2% max efficiency bonus, and every infinity egg gives 1%.
    Tooltip_MegaEggGenerator_05("Tooltip_MegaEggGenerator_05"),
    // #tr Tooltip_MegaEggGenerator_06 Note its warm-up process is quite slow, about 500 secs in need.
    Tooltip_MegaEggGenerator_06("Tooltip_MegaEggGenerator_06"),
    // #tr Tooltip_MegaEggGenerator_07 You can also put nothing on the egg pos, but every empty pos decreases 5% max
    // efficiency.
    Tooltip_MegaEggGenerator_07("Tooltip_MegaEggGenerator_07"),
    // #tr Tooltip_MegaEggGenerator_08 Whether it is the{\DARK_PURPLE} Dragon Egg,{\DARK_GREEN} Creeper Egg, or the {\GOLD}Egg of Infinity, {\GRAY}only their presence can drive the full circulation of power.
    Tooltip_MegaEggGenerator_08("Tooltip_MegaEggGenerator_08"),
    // #tr Tooltip_MegaEggGenerator_D Dynamo or TT Dynamo, one only
    Tooltip_MegaEggGenerator_D("Tooltip_MegaEggGenerator_D"),
    // #tr Tooltip_MegaEggGenerator_M No need for maintenance hatch.
    Tooltip_MegaEggGenerator_M("Tooltip_MegaEggGenerator_M"),
    // #tr Tooltip_MegaEggGenerator_L Lasers unlock at >=16 pieces.
    Tooltip_MegaEggGenerator_L("Tooltip_MegaEggGenerator_L"),
    // #tr Tooltip_MegaEggGenerator_C Any Magical Casing.
    Tooltip_MegaEggGenerator_C("Tooltip_MegaEggGenerator_C"),
    // endregion

    // region IndistinctTentacle
    // #tr NameIndistinctTentacle {\BOLD}{\BLACK}Indistinct Tentacle
    NameIndistinctTentacle("NameIndistinctTentacle"),
    // #tr Tooltip_IndistinctTentacle_MachineType Assembly Line | Component Assembly Line | Assembler | Precise Assembler
    Tooltip_IndistinctTentacle_MachineType("Tooltip_IndistinctTentacle_MachineType"),
    // #tr Tooltip_IndistinctTentacle_Controller Controller block for the Indistinct Tentacle
    Tooltip_IndistinctTentacle_Controller("Tooltip_IndistinctTentacle_Controller"),
    // #tr Tooltip_IndistinctTentacle_01 {\BOLD}{\ITALIC}In the midst of this sea and endless solitude there appears
    // a dim road, a road without human footprints.
    Tooltip_IndistinctTentacle_01("Tooltip_IndistinctTentacle_01"),
    // #tr Tooltip_IndistinctTentacle_02 {\BOLD}{\ITALIC}No man has ever passed this place, no ship has ever sailed
    // here.
    Tooltip_IndistinctTentacle_02("Tooltip_IndistinctTentacle_02"),
    // #tr Tooltip_IndistinctTentacle_03 Made everything in its where should be.
    Tooltip_IndistinctTentacle_03("Tooltip_IndistinctTentacle_03"),
    // #tr Tooltip_IndistinctTentacle_04 Glass tier limit energy hatch, laser hatch need UV glass.
    Tooltip_IndistinctTentacle_04("Tooltip_IndistinctTentacle_04"),
    // #tr Tooltip_IndistinctTentacle_05 Component Casing tier limit recipe can process. Casing tier require at least the recipe voltage level -1 .
    Tooltip_IndistinctTentacle_05("Tooltip_IndistinctTentacle_05"),
    // #tr Tooltip_IndistinctTentacle_06 If Component Casing tier is higher than recipe voltage, enable §cPerfect Overclock§7.
    Tooltip_IndistinctTentacle_06("Tooltip_IndistinctTentacle_06"),
    // #tr Tooltip_IndistinctTentacle_07 UMV+ glass and Component Casing allow Wireless mode by placing no energy hatch.
    Tooltip_IndistinctTentacle_07("Tooltip_IndistinctTentacle_07"),
    // #tr Tooltip_IndistinctTentacle_08 Progressing time is fixed in Wireless mode.
    Tooltip_IndistinctTentacle_08("Tooltip_IndistinctTentacle_08"),
    // #tr Tooltip_IndistinctTentacle_09 Watch out your Global energy storage if use wireless mode, you should not want to see the power drain's landscape.
    Tooltip_IndistinctTentacle_09("Tooltip_IndistinctTentacle_09"),
    // #tr Tooltip_IndistinctTentacle_2_01 Speed (default) of mode:
    Tooltip_IndistinctTentacle_2_01("Tooltip_IndistinctTentacle_2_01"),
    // #tr Tooltip_IndistinctTentacle_2_02 Assembly Line = 100%%
    Tooltip_IndistinctTentacle_2_02("Tooltip_IndistinctTentacle_2_02"),
    // #tr Tooltip_IndistinctTentacle_2_03 Component Assembly Line = 200%%,
    Tooltip_IndistinctTentacle_2_03("Tooltip_IndistinctTentacle_2_03"),
    // #tr Tooltip_IndistinctTentacle_2_04 Assembler = 400%%
    Tooltip_IndistinctTentacle_2_04("Tooltip_IndistinctTentacle_2_04"),
    // #tr Tooltip_IndistinctTentacle_2_05 Precise Assembler = 400%%
    Tooltip_IndistinctTentacle_2_05("Tooltip_IndistinctTentacle_2_05"),
    // #tr Tooltip_IndistinctTentacle_2_06 Default power mode parallel 256.
    Tooltip_IndistinctTentacle_2_06("Tooltip_IndistinctTentacle_2_06"),
    // #tr Tooltip_IndistinctTentacle_2_07 Progressing time is fixed at 25.6s in Wireless mode.
    Tooltip_IndistinctTentacle_2_07("Tooltip_IndistinctTentacle_2_07"),
    // #tr Tooltip_IndistinctTentacle_2_08 Put an Astral Array Fabricator into controller slot,
    Tooltip_IndistinctTentacle_2_08("Tooltip_IndistinctTentacle_2_08"),
    // #tr Tooltip_IndistinctTentacle_2_09 the Progressing time will be fixed at 1.0s, and EU cost increase to 64 times.
    Tooltip_IndistinctTentacle_2_09("Tooltip_IndistinctTentacle_2_09"),

    // endregion

    // region ThermalEnergyDevourer
    // #tr NameThermalEnergyDevourer Thermal Energy Devourer
    NameThermalEnergyDevourer("NameThermalEnergyDevourer"),
    // #tr Tooltip_ThermalEnergyDevourer_MachineType Vacuum Freezer
    Tooltip_ThermalEnergyDevourer_MachineType("Tooltip_ThermalEnergyDevourer_MachineType"),
    // #tr Tooltip_ThermalEnergyDevourer_Controller Controller block for the Thermal Energy Devourer
    Tooltip_ThermalEnergyDevourer_Controller("Tooltip_ThermalEnergyDevourer_Controller"),
    // #tr Tooltip_ThermalEnergyDevourer_01 {\WHITE}{\BOLD}{\ITALIC} It's White Album season again.
    Tooltip_ThermalEnergyDevourer_01("Tooltip_ThermalEnergyDevourer_01"),
    // #tr Tooltip_ThermalEnergyDevourer_02 The thermal energy it greedily devours.
    Tooltip_ThermalEnergyDevourer_02("Tooltip_ThermalEnergyDevourer_02"),
    // #tr Tooltip_ThermalEnergyDevourer_03 But overall it's still a Freezer, and works well.
    Tooltip_ThermalEnergyDevourer_03("Tooltip_ThermalEnergyDevourer_03"),
    // #tr Tooltip_ThermalEnergyDevourer_04 Increasing the input power will also increase the operating efficiency.
    Tooltip_ThermalEnergyDevourer_04("Tooltip_ThermalEnergyDevourer_04"),
    // #tr Tooltip_ThermalEnergyDevourer_05 {\GOLD} ----- High Speed Mode -----
    Tooltip_ThermalEnergyDevourer_05("Tooltip_ThermalEnergyDevourer_05"),
    // #tr Tooltip_ThermalEnergyDevourer_06 Operating efficiency decrease the progress time directly.
    Tooltip_ThermalEnergyDevourer_06("Tooltip_ThermalEnergyDevourer_06"),
    // #tr Tooltip_ThermalEnergyDevourer_07 1024x parallel.
    Tooltip_ThermalEnergyDevourer_07("Tooltip_ThermalEnergyDevourer_07"),
    // #tr Tooltip_ThermalEnergyDevourer_08 {\GOLD} ----- High Parallel Mode -----
    Tooltip_ThermalEnergyDevourer_08("Tooltip_ThermalEnergyDevourer_08"),
    // #tr Tooltip_ThermalEnergyDevourer_09 Operating efficiency decrease the EU cost.
    Tooltip_ThermalEnergyDevourer_09("Tooltip_ThermalEnergyDevourer_09"),
    // #tr Tooltip_ThermalEnergyDevourer_10 Almost infinite parallel.
    Tooltip_ThermalEnergyDevourer_10("Tooltip_ThermalEnergyDevourer_10"),
    // #tr Tooltip_ThermalEnergyDevourer_11 {\GOLD} ----- Wireless Mode -----
    Tooltip_ThermalEnergyDevourer_11("Tooltip_ThermalEnergyDevourer_11"),
    // #tr Tooltip_ThermalEnergyDevourer_12 Put {\AQUA}Energised Tesseract{\GRAY} into controller slot to turn into
    // Wireless mode.
    Tooltip_ThermalEnergyDevourer_12("Tooltip_ThermalEnergyDevourer_12"),
    // #tr Tooltip_ThermalEnergyDevourer_13 Directly consume required EU from wireless EU network.
    Tooltip_ThermalEnergyDevourer_13("Tooltip_ThermalEnergyDevourer_13"),
    // #tr Tooltip_ThermalEnergyDevourer_14 Progress time is fixed at 6.4s .
    Tooltip_ThermalEnergyDevourer_14("Tooltip_ThermalEnergyDevourer_14"),
    // #tr Tooltip_ThermalEnergyDevourer_2_01 Check whether turn into Wireless mode when checking structure.
    Tooltip_ThermalEnergyDevourer_2_01("Tooltip_ThermalEnergyDevourer_2_01"),
    // endregion

    // region Debug Uncertainty Hatch
    // #tr NameDebugUncertaintyHatch Debug Uncertainty Hatch
    NameDebugUncertaintyHatch("NameDebugUncertaintyHatch"),
    // endregion

    // #tr NameLaserSmartPipe Laser Smart Node
    NameLaserSmartNode("NameLaserSmartNode"),

    // region Vacuum Filter Extractor
    // #tr NameVacuumFilterExtractor Vacuum Filter Extractor
    NameVacuumFilterExtractor("NameVacuumFilterExtractor"),
    // #tr Tooltip_VacuumFilterExtractor_MachineType Distillation Tower | Distillery
    Tooltip_VacuumFilterExtractor_MachineType("Tooltip_VacuumFilterExtractor_MachineType"),
    // #tr Tooltip_VacuumFilterExtractor_Controller Controller block for the Vacuum Filter Extractor
    Tooltip_VacuumFilterExtractor_Controller("Tooltip_VacuumFilterExtractor_Controller"),
    // #tr Tooltip_VacuumFilterExtractor_01 {\ITALIC}Engineers think something isn't broken because it has too few
    // features.
    Tooltip_VacuumFilterExtractor_01("Tooltip_VacuumFilterExtractor_01"),
    // #tr Tooltip_VacuumFilterExtractor_02 By manipulating space in order to achieve separation of matter
    Tooltip_VacuumFilterExtractor_02("Tooltip_VacuumFilterExtractor_02"),
    // #tr Tooltip_VacuumFilterExtractor_03 rather than direct manipulation of matter.
    Tooltip_VacuumFilterExtractor_03("Tooltip_VacuumFilterExtractor_03"),
    // #tr Tooltip_VacuumFilterExtractor_04 Recipe voltage is only 50%% of normal.
    Tooltip_VacuumFilterExtractor_04("Tooltip_VacuumFilterExtractor_04"),
    // #tr Tooltip_VacuumFilterExtractor_05 Increasing the energy input will result in more speed boosts.
    Tooltip_VacuumFilterExtractor_05("Tooltip_VacuumFilterExtractor_05"),
    // #tr Tooltip_VacuumFilterExtractor_06 In distillery mode, machine will enable {\AQUA}Perfect Overclock{\GRAY}.
    Tooltip_VacuumFilterExtractor_06("Tooltip_VacuumFilterExtractor_06"),
    // endregion

    // region Large Steam Forge Hammer
    // #tr NameLargeSteamForgeHammer Large Steam Forge Hammer
    NameLargeSteamForgeHammer("NameLargeSteamForgeHammer"),
    // #tr Tooltip_LargeSteamForgeHammer_MachineType Forge Hammer
    Tooltip_LargeSteamForgeHammer_MachineType("Tooltip_LargeSteamForgeHammer_MachineType"),
    // #tr Tooltip_LargeSteamForgeHammer_Controller Controller block for the Large Steam Forge Hammer
    Tooltip_LargeSteamForgeHammer_Controller("Tooltip_LargeSteamForgeHammer_Controller"),
    // #tr Tooltip_LargeSteamForgeHammer_01 He has a hammer. Who has the Sickle?
    Tooltip_LargeSteamForgeHammer_01("Tooltip_LargeSteamForgeHammer_01"),
    // endregion

    // region Large Steam Alloy Smelter
    // #tr NameLargeSteamAlloySmelter Large Steam Alloy Smelter
    NameLargeSteamAlloySmelter("NameLargeSteamAlloySmelter"),
    // #tr Tooltip_LargeSteamAlloySmelter_MachineType Alloy Smelter
    Tooltip_LargeSteamAlloySmelter_MachineType("Tooltip_LargeSteamAlloySmelter_MachineType"),
    // #tr Tooltip_LargeSteamAlloySmelter_Controller Controller block for the Large Steam Alloy Smelter
    Tooltip_LargeSteamAlloySmelter_Controller("Tooltip_LargeSteamAlloySmelter_Controller"),
    // #tr Tooltip_LargeSteamAlloySmelter_01 Steam Tech Operational
    Tooltip_LargeSteamAlloySmelter_01("Tooltip_LargeSteamAlloySmelter_01"),
    // endregion

    // region Eye Of Wood
    // #tr NameEyeOfWood Eye of Wood
    NameEyeOfWood("NameEyeOfWood"),
    // #tr Tooltip_EyeOfWood_MachineType Happiness Master
    Tooltip_EyeOfWood_MachineType("Tooltip_EyeOfWood_MachineType"),
    // #tr Tooltip_EyeOfWood_Controller Controller block for the Eye of Wood
    Tooltip_EyeOfWood_Controller("Tooltip_EyeOfWood_Controller"),
    // #tr Tooltip_EyeOfWood_01 You'd better to do a sanity check, if you are looking at this.
    Tooltip_EyeOfWood_01("Tooltip_EyeOfWood_01"),
    // endregion

    // region Bee Engineer
    // #tr NameBeeEngineer Bee Engineer (Prototype)
    NameBeeEngineer("NameBeeEngineer"),
    // #tr Tooltip_BeeEngineer_Type Bee Engineer
    Tooltip_BeeEngineer_Type("Tooltip_BeeEngineer_Type"),
    // #tr Tooltip_BeeEngineer_Controller Controller of the Bee Engineer
    Tooltip_BeeEngineer_Controller("Tooltip_BeeEngineer_Controller"),
    // #tr Tooltip_BeeEngineer_01 Still in test.
    Tooltip_BeeEngineer_01("Tooltip_BeeEngineer_01"),
    // #tr Tooltip_BeeEngineer_02 Transforming drones into princesses.
    Tooltip_BeeEngineer_02("Tooltip_BeeEngineer_02"),
    // #tr Tooltip_BeeEngineer_03 Who knows how many drones became stepping stones for the Last Queen?
    Tooltip_BeeEngineer_03("Tooltip_BeeEngineer_03"),
    // #tr Tooltip_BeeEngineer_04 Cost 128kL Honey to transform a drone into princess, but with 40% failing chance.
    Tooltip_BeeEngineer_04("Tooltip_BeeEngineer_04"),
    // #tr Tooltip_BeeEngineer_05 Will try to consume 32kL UUM (if exists) to increase success rate to 80%.
    Tooltip_BeeEngineer_05("Tooltip_BeeEngineer_05"),
    // #tr Tooltip_BeeEngineer_06 In case of failure, all consumed ingredients will not be returned.
    Tooltip_BeeEngineer_06("Tooltip_BeeEngineer_06"),
    // #tr Tooltip_BeeEngineer_07 Don't put too many drones in at once, that will result in a long run time!
    Tooltip_BeeEngineer_07("Tooltip_BeeEngineer_07"),

    // region Mega Macerator
    // #tr NameMegaMacerator "Mini" Household Cell Fragmentizer
    NameMegaMacerator("NameMegaMacerator"),
    // #tr Tooltip_MegaMacerator_Type Macerator
    Tooltip_MegaMacerator_MachineType("Tooltip_MegaMacerator_MachineType"),
    // #tr Tooltip_MegaMacerator_Controller Controller block for the "Mini" Household Cell Fragmentizer
    Tooltip_MegaMacerator_Controller("Tooltip_MegaMacerator_Controller"),
    // #tr Tooltip_MegaMacerator_01 Squeezed Collision of Material.
    Tooltip_MegaMacerator_01("Tooltip_MegaMacerator_01"),
    // #tr Tooltip_MegaMacerator_02 This is way better than a forge hammer.
    Tooltip_MegaMacerator_02("Tooltip_MegaMacerator_02"),
    // #tr Tooltip_MegaMacerator_03 Can parallel up to 2 ^ (2 ^ (Tier + 2) - 1).
    Tooltip_MegaMacerator_03("Tooltip_MegaMacerator_03"),
    // #tr Tooltip_MegaMacerator_04 Tier is determined by cotainment block: Damascus Steel, Neutronium, Universium.
    Tooltip_MegaMacerator_04("Tooltip_MegaMacerator_04"),
    // #tr Tooltip_MegaMacerator_05 The max voltage tier is limited by the glass tier.
    Tooltip_MegaMacerator_05("Tooltip_MegaMacerator_05"),
    // #tr Tooltip_MegaMacerator_06 Enable 8x speed multiplier when glass tier > recipe tier.
    Tooltip_MegaMacerator_06("Tooltip_MegaMacerator_06"),

    // endregion

    // region HephaestusAtelier
    // #tr NameHephaestusAtelier Hephaestus' Atelier
    NameHephaestusAtelier("NameHephaestusAtelier"),
    // #tr Tooltip_HephaestusAtelier_MachineType Furnace
    Tooltip_HephaestusAtelier_MachineType("Tooltip_HephaestusAtelier_MachineType"),
    // #tr Tooltip_HephaestusAtelier_Controller Controller block for the Hephaestus' Atelier
    Tooltip_HephaestusAtelier_Controller("Tooltip_HephaestusAtelier_Controller"),
    // #tr Tooltip_HephaestusAtelier_01 {\DARK_RED}{\ITALIC}And first Hephaestus makes a great and massive shield
    // ...
    Tooltip_HephaestusAtelier_01("Tooltip_HephaestusAtelier_01"),
    // #tr Tooltip_HephaestusAtelier_02 {\DARK_RED}{\ITALIC} ... And he forged on the shield two noble cities.
    Tooltip_HephaestusAtelier_02("Tooltip_HephaestusAtelier_02"),
    // #tr Tooltip_HephaestusAtelier_03 Even in the future, the most primitive means of smelting will be needed.
    Tooltip_HephaestusAtelier_03("Tooltip_HephaestusAtelier_03"),
    // #tr Tooltip_HephaestusAtelier_04 Parallelism across recipes is possible, even using Crafting Input hatches.
    Tooltip_HephaestusAtelier_04("Tooltip_HephaestusAtelier_04"),
    // #tr Tooltip_HephaestusAtelier_05 The machine will adjust its operation according to the installed coil level.
    Tooltip_HephaestusAtelier_05("Tooltip_HephaestusAtelier_05"),
    // #tr Tooltip_HephaestusAtelier_06 {\GOLD} ----- T1 Coil : Molecular Coil -----
    Tooltip_HephaestusAtelier_06("Tooltip_HephaestusAtelier_06"),
    // #tr Tooltip_HephaestusAtelier_07 Like other normal machine, use energy from energy hatches and do overclock.
    Tooltip_HephaestusAtelier_07("Tooltip_HephaestusAtelier_07"),
    // #tr Tooltip_HephaestusAtelier_08 2.1G parallel. Every item smelting consume 7 EU/t and 25.6s.
    Tooltip_HephaestusAtelier_08("Tooltip_HephaestusAtelier_08"),
    // #tr Tooltip_HephaestusAtelier_09 {\GOLD} ----- T2 Coil : Ultimate Containment Field Generator -----
    Tooltip_HephaestusAtelier_09("Tooltip_HephaestusAtelier_09"),
    // #tr Tooltip_HephaestusAtelier_10 Directly consume energy from wireless EU net.
    Tooltip_HephaestusAtelier_10("Tooltip_HephaestusAtelier_10"),
    // #tr Tooltip_HephaestusAtelier_11 Infinite parallel. Every item smelting consume 2048 EU.
    Tooltip_HephaestusAtelier_11("Tooltip_HephaestusAtelier_11"),
    // #tr Tooltip_HephaestusAtelier_12 Processing time is fixed at 12.8s.
    Tooltip_HephaestusAtelier_12("Tooltip_HephaestusAtelier_12"),
    // #tr Tooltip_HephaestusAtelier_13 {\GOLD} ----- T3 Coil : Teleportation Casing -----
    Tooltip_HephaestusAtelier_13("Tooltip_HephaestusAtelier_13"),
    // #tr Tooltip_HephaestusAtelier_14 Processing time 1s.
    Tooltip_HephaestusAtelier_14("Tooltip_HephaestusAtelier_14"),
    // #tr Tooltip_HephaestusAtelier_15 Otherwise same as T2.
    Tooltip_HephaestusAtelier_15("Tooltip_HephaestusAtelier_15"),
    // #tr Tooltip_HephaestusAtelier_2_01 Must install energy hatch when in T1.
    Tooltip_HephaestusAtelier_2_01("Tooltip_HephaestusAtelier_2_01"),

    // endregion

    // region Deployed Nano Core
    // #tr NameDeployedNanoCore Deployed Nano Core
    NameDeployedNanoCore("NameDeployedNanoCore"),
    // #tr Tooltip_DeployedNanoCore_MachineType Nano Forge
    Tooltip_DeployedNanoCore_MachineType("Tooltip_DeployedNanoCore_MachineType"),
    // #tr Tooltip_DeployedNanoCore_Controller Controller block for the Deployed Nano Core
    Tooltip_DeployedNanoCore_Controller("Tooltip_DeployedNanoCore_Controller"),
    // #tr Tooltip_DeployedNanoCore_01 {\WHITE}{\ITALIC}If you shed tears when you miss the sun, you also miss the stars.
    Tooltip_DeployedNanoCore_01("Tooltip_DeployedNanoCore_01"),
    // #tr Tooltip_DeployedNanoCore_02 It'll take care of itself.
    Tooltip_DeployedNanoCore_02("Tooltip_DeployedNanoCore_02"),
    // #tr Tooltip_DeployedNanoCore_03 With perfect overclock and infinite parallel.
    Tooltip_DeployedNanoCore_03("Tooltip_DeployedNanoCore_03"),
    // #tr Tooltip_DeployedNanoCore_04 What are you worried about?
    Tooltip_DeployedNanoCore_04("Tooltip_DeployedNanoCore_04"),
    // endregion

    ;
    // spotless:on

    public static final String ModName = Tags.MODNAME;
    public static final String Text_SeparatingLine = EnumChatFormatting.GOLD
        + "-----------------------------------------";

    // region Names
    public static final String name_Nxer = String.valueOf(EnumChatFormatting.RED) + EnumChatFormatting.BOLD
        + EnumChatFormatting.ITALIC
        + EnumChatFormatting.UNDERLINE
        + "N"
        + EnumChatFormatting.GREEN
        + EnumChatFormatting.BOLD
        + EnumChatFormatting.ITALIC
        + EnumChatFormatting.UNDERLINE
        + "x"
        + EnumChatFormatting.AQUA
        + EnumChatFormatting.BOLD
        + EnumChatFormatting.ITALIC
        + EnumChatFormatting.UNDERLINE
        + "e"
        + EnumChatFormatting.BLUE
        + EnumChatFormatting.BOLD
        + EnumChatFormatting.ITALIC
        + EnumChatFormatting.UNDERLINE
        + "r";

    public static final String authorName_Nxer = "Author: " + name_Nxer;
    // endregion

    public static final String[] Tooltips_Upgrades_LV = new String[] {
        // #tr PhotonControllerUpgradeLV.tooltips.01 Extra 1%% Speed Up !
        tr("PhotonControllerUpgradeLV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_MV = new String[] {
        // #tr PhotonControllerUpgradeMV.tooltips.01 Extra 2%% Speed Up!
        tr("PhotonControllerUpgradeMV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_HV = new String[] {
        // #tr PhotonControllerUpgradeHV.tooltips.01 Extra 3%% Speed Up!
        tr("PhotonControllerUpgradeHV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_EV = new String[] {
        // #tr PhotonControllerUpgradeEV.tooltips.01 Extra 4%% Speed Up!
        tr("PhotonControllerUpgradeEV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_IV = new String[] {
        // #tr PhotonControllerUpgradeIV.tooltips.01 Extra 5%% Speed Up!
        tr("PhotonControllerUpgradeIV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_LuV = new String[] {
        // #tr PhotonControllerUpgradeLuV.tooltips.01 Extra 10%% Speed Up!
        tr("PhotonControllerUpgradeLuV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_ZPM = new String[] {
        // #tr PhotonControllerUpgradeZPM.tooltips.01 Extra 20%% Speed Up!
        tr("PhotonControllerUpgradeZPM.tooltips.01") };
    public static final String[] Tooltips_Upgrades_UV = new String[] {
        // #tr PhotonControllerUpgradeUV.tooltips.01 Extra 40%% Speed Up!
        tr("PhotonControllerUpgradeUV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_UHV = new String[] {
        // #tr PhotonControllerUpgradeUHV.tooltips.01 Extra 70%% Speed Up!
        tr("PhotonControllerUpgradeUHV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_UEV = new String[] {
        // #tr PhotonControllerUpgradeUEV.tooltips.01 Extra 100%% Speed Up!
        tr("PhotonControllerUpgradeUEV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_UIV = new String[] {
        // #tr PhotonControllerUpgradeUiV.tooltips.01 Extra 140%% Speed Up!
        tr("PhotonControllerUpgradeUiV.tooltips.01") };
    public static final String[] Tooltips_Upgrades_UMV = new String[] {
        // #tr PhotonControllerUpgradeUMV.tooltips.01 Extra 190%% Speed Up!
        tr("PhotonControllerUpgradeUMV.tooltips.01"),
        // #tr PhotonControllerUpgradeUMV.tooltips.02 Enable Perfect Overclock !
        tr("PhotonControllerUpgradeUMV.tooltips.02") };
    public static final String[] Tooltips_Upgrades_UXV = new String[] {
        // #tr PhotonControllerUpgradeUXV.tooltips.01 Extra 250%% Speed Up!
        tr("PhotonControllerUpgradeUXV.tooltips.01"),
        // #tr PhotonControllerUpgradeUXV.tooltips.02 Enable Perfect Overclock !
        tr("PhotonControllerUpgradeUXV.tooltips.02") };
    public static final String[] Tooltips_Upgrades_MAX = new String[] {
        // #tr PhotonControllerUpgradeMAX.tooltips.01 Extra 320%% Speed Up!
        tr("PhotonControllerUpgradeMAX.tooltips.01"),
        // #tr PhotonControllerUpgradeMAX.tooltips.02 Enable Perfect Overclock !
        tr("PhotonControllerUpgradeMAX.tooltips.02") };

    public static final String[][] TooltipsUpgrades = new String[][] { Tooltips_Upgrades_LV, Tooltips_Upgrades_MV,
        Tooltips_Upgrades_HV, Tooltips_Upgrades_EV, Tooltips_Upgrades_IV, Tooltips_Upgrades_LuV, Tooltips_Upgrades_ZPM,
        Tooltips_Upgrades_UV, Tooltips_Upgrades_UHV, Tooltips_Upgrades_UEV, Tooltips_Upgrades_UIV,
        Tooltips_Upgrades_UMV, Tooltips_Upgrades_UXV, Tooltips_Upgrades_MAX };

    public static String tr(String key) {
        return StatCollector.translateToLocal(key);
    }

    TextLocalization(String key) {
        this.key = key;
        this.text = tr(key);
    }

    @Override
    public String toString() {
        return text;
    }

    private final String key;
    private final String text;

}
// spotless:on
