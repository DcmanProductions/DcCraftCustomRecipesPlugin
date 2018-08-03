package tk.dccraft.CustomRecipes;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		//HorseEgg();
		Saddle();
		DiamondHorseArmor();
		GoldHorseArmor();
		IronHorseArmor();
		

	}

	private void IronHorseArmor() {
		ItemStack item = new ItemStack(Material.IRON_BARDING);
		ShapedRecipe msRecipe = new ShapedRecipe(item);
		msRecipe.shape("  D","DDD","DD ");
		msRecipe.setIngredient('D', Material.IRON_INGOT);
		Bukkit.addRecipe(msRecipe);
	}

	private void GoldHorseArmor() {
		ItemStack item = new ItemStack(Material.GOLD_BARDING);
		ShapedRecipe msRecipe = new ShapedRecipe(item);
		msRecipe.shape("  D","DDD","DD ");
		msRecipe.setIngredient('D', Material.GOLD_INGOT);
		Bukkit.addRecipe(msRecipe);
	}

	private void DiamondHorseArmor() {
		ItemStack item = new ItemStack(Material.DIAMOND_BARDING);
		ShapedRecipe msRecipe = new ShapedRecipe(item);
		msRecipe.shape("  D","DDD","DD ");
		msRecipe.setIngredient('D', Material.DIAMOND);
		Bukkit.addRecipe(msRecipe);
	}

	@Override
	public void onDisable() {
	}

	public void HorseEgg() {
		ItemStack item = new ItemStack(Material.MONSTER_EGGS, 5);
		ShapedRecipe msRecipe = new ShapedRecipe(item);
		msRecipe.shape("LLL","LEL","LLL");
		msRecipe.setIngredient('L', Material.LEATHER);
		msRecipe.setIngredient('E', Material.EGG);
		Bukkit.getServer().addRecipe(msRecipe);
	}

	public void Saddle() {
		ItemStack item = new ItemStack(Material.SADDLE, 1);
//		ItemMeta meta = item.getItemMeta();

//		 meta.setDisplayName("Name");
//		 meta.setLore(Arrays.asList());
//		item.setItemMeta(meta);
		ShapedRecipe msRecipe = new ShapedRecipe(item);
		msRecipe.shape("LLL", "LSL", "TTT");
		msRecipe.setIngredient('S', Material.SLIME_BALL);
		msRecipe.setIngredient('L', Material.LEATHER);
		msRecipe.setIngredient('T', Material.STRING);
		Bukkit.getServer().addRecipe(msRecipe);

	}

}
