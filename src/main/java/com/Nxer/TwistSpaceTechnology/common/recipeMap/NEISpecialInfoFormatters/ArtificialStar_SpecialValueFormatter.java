package com.Nxer.TwistSpaceTechnology.common.recipeMap.NEISpecialInfoFormatters;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.StatCollector;

import gregtech.nei.RecipeDisplayInfo;
import gregtech.nei.formatter.INEISpecialInfoFormatter;

public class ArtificialStar_SpecialValueFormatter implements INEISpecialInfoFormatter {

    public static final ArtificialStar_SpecialValueFormatter INSTANCE = new ArtificialStar_SpecialValueFormatter();

    @Override
    public List<String> format(RecipeDisplayInfo recipeInfo) {
        List<String> msgs = new ArrayList<>();
        // #tr NEI.ArtificialStarGeneratingRecipes.specialValue.pre Generate :
        msgs.add(
            StatCollector.translateToLocal("NEI.ArtificialStarGeneratingRecipes.specialValue.pre")
                + recipeInfo.recipe.mSpecialValue
                + " × 2,147,483,647 EU");
        return msgs;
    }
}
