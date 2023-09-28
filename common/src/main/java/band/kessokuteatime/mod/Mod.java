package band.kessokuteatime.mod;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class Mod {
    public static final String ID = "examplemod", NAME = "Example Mod";

    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(ID));

    public static final ItemGroup EXAMPLE_TAB = CreativeTabRegistry.create(
            Text.translatable(new Identifier(ID, "example_tab").toTranslationKey()),
            () -> Mod.EXAMPLE_ITEM.get().getDefaultStack()
    );
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ID, RegistryKeys.ITEM);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register(
            "example_item",
            () -> new Item(new Item.Settings().arch$tab(Mod.EXAMPLE_TAB))
    );
    
    public static void init() {
        ITEMS.register();
        
        System.out.println(ModExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
