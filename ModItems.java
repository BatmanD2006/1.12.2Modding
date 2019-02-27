package com.batzgamer.heroesmod.init;

import java.util.ArrayList;
import java.util.List;

import com.batzgamer.heroesmod.items.ArmorModel;
import com.batzgamer.heroesmod.items.ItemBase;
import com.batzgamer.heroesmod.items.armor.ArmorBase;
import com.batzgamer.heroesmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Items
	public static final Item BAT = new ItemBase("bat");
	
	//Material
	public static final ArmorMaterial ARMOR_MATERIAL_THOR = EnumHelper.addArmorMaterial("armor_,material_thor", Reference.MOD_ID + ":thor", 20, 
			new int[] {5, 10, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial THORMCU_MODEL_MATERIAL = EnumHelper.addArmorMaterial("thormcu_model", Reference.MOD_ID + ":thormcu_model", 20, new int[] {7, 10, 10, 7}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC , 0.0F);
	
	
	
	//Tools

	
	//Armor
	public static final Item THOR_HELMET = new ArmorBase("thor_helmet", ARMOR_MATERIAL_THOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item THOR_CHESTPLATE = new ArmorBase("thor_chestplate", ARMOR_MATERIAL_THOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item THOR_LEGGINGS = new ArmorBase("thor_leggings", ARMOR_MATERIAL_THOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item THOR_BOOTS = new ArmorBase("thor_boots", ARMOR_MATERIAL_THOR, 1, EntityEquipmentSlot.FEET);
	
	
	
	
	public static final Item THORMCU_HELMET = new ArmorModel("thor_helmet", CreativeTabs.COMBAT, THORMCU_MODEL_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item THORMCU_CHESTPLATE = new ArmorModel("thor_chestplate", CreativeTabs.COMBAT, THORMCU_MODEL_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final Item THORMCU_LEGGINGS = new ArmorModel("thor_leggings", CreativeTabs.COMBAT, THORMCU_MODEL_MATERIAL, EntityEquipmentSlot.LEGS);
    public static final Item THORMCU_BOOTS = new ArmorModel("thor_boots", CreativeTabs.COMBAT, THORMCU_MODEL_MATERIAL, EntityEquipmentSlot.FEET);
	

}
