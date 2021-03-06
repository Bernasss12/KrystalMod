/* 
 * Author: KrystalGamer
 * Date: 24/12/2013
 * Description: Base file of the API
 * Changes: Setting Base File
 *
 */

package KrystalMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class KrystalAPI {
	
	public static int dur;
	
	/**
	 * 
	 *  Void used to register Blocks
	 * 
	 * @param block The Block
	 * @param unlocalized Unlocalized Name of the block
	 * @param name Name that will be shown up in-game
	 */
	public static void registerBlock(Block block, String unlocalized, String name){
		
		GameRegistry.registerBlock(block, unlocalized);
		LanguageRegistry.addName(block, name);
	}
	
	/**
	 * 
	 *  Void used to register Items
	 * 
	 * @param item The Item
	 * @param unlocalized The unlocalized name of the item
	 * @param name Name that will be shown up in-game
	 */
	public static void registerItem(Item item, String unlocalized, String name){
		
		GameRegistry.registerItem(item, unlocalized);
		LanguageRegistry.addName(item, name);
		
	}
	/**
	 * 
	 * @param item The Item
	 * @param stack The ItemStack :O
	 * @return The item durability
	 */
	public static int ItemDurability(Item item, ItemStack stack){
		
		dur = item.getMaxDamage() - item.getDisplayDamage(stack);
		
		return dur;
		
	}
	
	public static void RunItemDur(Item item, ItemStack stack)
	{
		
		
		
		
	}
	
	

}
