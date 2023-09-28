package band.kessokuteatime.mod.forge;

import band.kessokuteatime.mod.Mod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@net.minecraftforge.fml.common.Mod(Mod.ID)
public class ModForge {
    public ModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Mod.ID, FMLJavaModLoadingContext.get().getModEventBus());
        Mod.init();
    }
}
