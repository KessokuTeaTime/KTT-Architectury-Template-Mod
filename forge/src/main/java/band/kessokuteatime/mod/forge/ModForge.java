package band.kessokuteatime.mod.forge;

import band.kessokuteatime.mod.ModCommon;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModCommon.ID)
public class ModForge {
    public ModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ModCommon.ID, FMLJavaModLoadingContext.get().getModEventBus());
        ModCommon.init();
    }
}
