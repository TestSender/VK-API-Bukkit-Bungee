package com.ubivashka.vk.velocity.events;

import com.vk.api.sdk.objects.wall.WallComment;

public class VKPostReplyRestoreEvent extends VKPostReplyActionEvent {

	public VKPostReplyRestoreEvent(WallComment postComment, Integer groupId) {
		super(postComment, groupId);
	}

}
