package com.replyrebind;

import com.replyrebind.ReplyrebindPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ReplyrebindPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ReplyrebindPlugin.class);
		RuneLite.main(args);
	}
}