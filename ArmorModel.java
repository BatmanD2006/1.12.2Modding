package com.batzgamer.heroesmod.items;



import com.batzgamer.heroesmod.Main;
import com.batzgamer.heroesmod.Helper.Helper;
import com.batzgamer.heroesmod.init.ModItems;
import com.batzgamer.heroesmod.util.IHasModel;
import com.batzgamer.heroesmod.util.Reference;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorModel extends ItemArmor implements IHasModel{
	

private static ThorMCU model;

    public ArmorModel(String name, CreativeTabs COMBAT, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, 1, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxStackSize(1);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)

    {

        return Reference.MOD_ID + ":textures/models/armor/thormcu.png";

    }

    @SideOnly(Side.CLIENT)

    public ModelBiped getModelThorMCU(ItemStack stack, Entity entity, EntityEquipmentSlot slot)

    {
        if (model == null) {
            model = new ThorMCU(Helper.getArmorModelScale(slot));
        }
        return model;

    }

    
    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack, EntityEquipmentSlot slot, ModelBiped _default) {
        ModelBiped armorModel = null;
        if (stack != null) {
            armorModel = getModelThorMCU(stack, entityLiving, slot);
            if (armorModel != null) {
                armorModel.setModelAttributes(_default);
                return armorModel;
            }
        }
        return getArmorModel(entityLiving, stack, slot, _default);
    }
    
}