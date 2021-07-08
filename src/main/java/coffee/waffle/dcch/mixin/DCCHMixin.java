package coffee.waffle.dcch.mixin;

import java.util.List;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author anar4732
 */
@Mixin(ChatHud.class)
public class DCCHMixin {
  @Shadow @Final private List<ChatHudLine> messages;
  @Shadow @Final private List<ChatHudLine> visibleMessages;

  /**
   * @author anar4732
   */
  @Overwrite
  public void clear() {
    this.visibleMessages.clear();
    this.messages.clear();
  }
}
