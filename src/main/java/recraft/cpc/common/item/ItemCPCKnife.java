package recraft.cpc.common.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import recraft.cpc.CPC;

public class ItemCPCKnife extends ItemSword {
	public int textureID;

	public ItemCPCKnife(ToolMaterial par1EnumToolMaterial, int par2Texture) {
		super(par1EnumToolMaterial);
		this.textureID = par2Texture;
		this.setCreativeTab(CPC.tabCPC);
	}

	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack itemToRepairWith) {
		return false;
	}

	public void registerIcons(IIconRegister iconRegister) {
		if      (textureID == 0) { itemIcon = iconRegister.registerIcon("cpc:jeffKnife"); }
		else if (textureID == 1) { itemIcon = iconRegister.registerIcon("cpc:hiltBlack"); }
		else if (textureID == 2) { itemIcon = iconRegister.registerIcon("cpc:killKnife"); }
		else { itemIcon = iconRegister.registerIcon("cpc:horror"); }
	}

	public boolean isFull3D() {
		return true;
	}

	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.epic;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		list.add(StatCollector.translateToLocal(super.getUnlocalizedName()+".desc"));
	}

}