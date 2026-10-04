package com.replyrebind;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("replyrebind")
public interface ReplyrebindConfig extends Config
{
	@ConfigItem(
		keyName = "replyKey",
		name = "Reply key",
		description = "Key which will replace TAB"
	)
	default Keybind replyKey()
	{
		return Keybind.NOT_SET;
	}
}