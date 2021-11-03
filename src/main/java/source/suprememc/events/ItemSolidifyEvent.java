package source.suprememc.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;

public class ItemSolidifyEvent extends Event
{
    private PlayerEntity player;
    private ItemStack stack;

    public ItemSolidifyEvent(PlayerEntity player, ItemStack stack)
    {
        this.player = player;
        this.stack = stack;
    }

    public PlayerEntity getPlayer()
    {
        return player;
    }

    public ItemStack getStack()
    {
        return this.stack;
    }
}