package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.messages.Message;

public class VKMessageEvent extends VKMessageUpdateEvent {
	

	public VKMessageEvent(Message message, Integer groupId) {
		super(message, groupId);
	}
}
