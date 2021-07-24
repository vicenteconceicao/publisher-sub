package com.pubsub.publisher.service.interfaces;

import com.pubsub.publisher.dto.MessageDto;

public interface PublisherServiceInterface {
    public void publishMessage(MessageDto message);
}
