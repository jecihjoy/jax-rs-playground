package com.github.jaxrsplayground.service;

import com.github.jaxrsplayground.dao.ApplicationDatabase;
import com.github.jaxrsplayground.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MessageService {

    private Map<Long, Message> messages = ApplicationDatabase.getMessages();

    public MessageService(){
        messages.put(1L, new Message(1L, "Work it!!", "JJ"));
        messages.put(2L, new Message(2L, "Work it!!", "JJ"));
    }

    public List<Message> getMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(Long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message m) {
        if (m.getId() <= 0) {
            return null;
        }
        messages.put(m.getId(), m);
        return m;
    }

    public Message removeMessage(Long id) {
        return messages.remove(id);
    }
}
