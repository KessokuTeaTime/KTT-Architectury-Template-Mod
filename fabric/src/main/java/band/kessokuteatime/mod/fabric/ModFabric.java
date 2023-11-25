package band.kessokuteatime.mod.fabric;

import band.kessokuteatime.mod.ModCommon;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ModCommon.init();
    }
}
