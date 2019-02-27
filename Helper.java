package com.batzgamer.heroesmod.Helper;

import net.minecraft.inventory.EntityEquipmentSlot;

public class Helper 
{
	public static float getArmorModelScale(EntityEquipmentSlot slot)

    {
        if (slot == EntityEquipmentSlot.HEAD)
            
        {

            return -0.6F;
            
        }

        return -1.5F;

    }
}
