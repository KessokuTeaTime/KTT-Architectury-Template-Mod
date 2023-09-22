package band.kessokuteatime.examplemod.forge;

import band.kessokuteatime.examplemod.ExampleMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleMod.ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleMod.init();
    }
}
