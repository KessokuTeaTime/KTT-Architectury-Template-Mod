package band.kessokuteatime.mod.fabric;

import band.kessokuteatime.mod.ModExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ModExpectPlatformImpl {
    /**
     * This is our actual method to {@link ModExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
