package gay.nyako.nyakomod;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NyakoSoundEvents {
    public static final SoundEvent SUPER_LUIGI          = register("super_luigi");
    public static final SoundEvent DISCORD              = register("discord");
    public static final SoundEvent WOLVES               = register("wolves");
    public static final SoundEvent COIN_COLLECT         = register("coin_collect");
    public static final SoundEvent SPUNCH_BLOCK         = register("vine_boom");
    public static final SoundEvent TRUE_BLOCK           = register("true");

    public static final SoundEvent MUSIC_DISC_WOLVES    = NyakoDiscs.WOLVES.soundEvent();
    public static final SoundEvent MUSIC_DISC_MASK      = NyakoDiscs.MASK.soundEvent();
    public static final SoundEvent MUSIC_DISC_CLUNK     = NyakoDiscs.CLUNK.soundEvent();
    public static final SoundEvent MUSIC_DISC_MERRY     = NyakoDiscs.MERRY.soundEvent();
    public static final SoundEvent MUSIC_DISC_WEEZED    = NyakoDiscs.WEEZED.soundEvent();
    public static final SoundEvent MUSIC_DISC_MOONLIGHT = NyakoDiscs.MOONLIGHT.soundEvent();
    public static final SoundEvent MUSIC_DISC_WELCOME   = NyakoDiscs.WELCOME.soundEvent();


    public static final BlockSoundGroup SPUNCH_BLOCK_SOUND_GROUP = new BlockSoundGroup(1.0f, 1.2f, SPUNCH_BLOCK, SoundEvents.BLOCK_STONE_STEP, SPUNCH_BLOCK, SoundEvents.BLOCK_STONE_HIT, SoundEvents.BLOCK_STONE_FALL);

    public static SoundEvent register(String name) {
        Identifier identifier = new Identifier("nyakomod", name);
        return Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier));
    }

    public static void register() {
        // include the class
    }
}
