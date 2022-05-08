package net.master.mythrilnmore.sound;

import net.master.mythrilnmore.Mythril_n_More;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static SoundEvent PROPELL_ENERGY = registerSoundEvent("propell_energy");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Mythril_n_More.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }


}
