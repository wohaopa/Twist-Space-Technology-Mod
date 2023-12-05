package com.Nxer.TwistSpaceTechnology.util.rewrites;

import gregtech.api.util.GT_Utility;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class TST_ItemID extends GT_Utility.ItemId {
    // region Member Variables
    private Item item;
    private int metaData;
    private NBTTagCompound nbt;
    // endregion

    // region Class Constructors
    public TST_ItemID(Item item, int metaData, NBTTagCompound nbt) {
        this.item = item;
        this.metaData = metaData;
        this.nbt = nbt;
    }

    public TST_ItemID(Item item, int metaData) {
        this.item = item;
        this.metaData = metaData;
    }

    public TST_ItemID(Item item) {
        this.item = item;
        this.metaData = 0;
    }

    public TST_ItemID() {
    }
    // endregion

    // region Static Methods
    public static TST_ItemID create(ItemStack itemStack) {
        return new TST_ItemID(itemStack.getItem(), itemStack.getItemDamage(), itemStack.getTagCompound());
    }

    public static TST_ItemID createNoNBT(ItemStack itemStack) {
        return new TST_ItemID(itemStack.getItem(), itemStack.getItemDamage());
    }
    // endregion

    // region Special Methods
    public ItemStack getItemStack(int amount){
        return new ItemStack(item,amount,metaData);
    }

    // endregion

    // region General Methods
    public TST_ItemID setItem(Item item) {
        this.item = item;
        return this;
    }

    public TST_ItemID setMetaData(int metaData) {
        this.metaData = metaData;
        return this;
    }

    public TST_ItemID setNbt(NBTTagCompound nbt) {
        this.nbt = nbt;
        return this;
    }

    @Override
    protected Item item() {
        return item;
    }

    @Override
    protected int metaData() {
        return metaData;
    }

    @Nullable
    @Override
    protected NBTTagCompound nbt() {
        return nbt;
    }

    @Nullable
    protected NBTTagCompound getNBT() {
        return nbt;
    }

    protected Item getItem() {
        return item;
    }

    protected int getMetaData() {
        return metaData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TST_ItemID)) {
            return false;
        }
        TST_ItemID tstItemID = (TST_ItemID) o;
        return metaData == tstItemID.metaData && Objects.equals(item, tstItemID.item) && Objects.equals(nbt, tstItemID.nbt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, metaData, nbt);
    }
}