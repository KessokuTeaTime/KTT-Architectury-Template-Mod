package band.kessokuteatime.mod.fabric;

import band.kessokuteatime.mod.Mod;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mod.init();
    }
}
