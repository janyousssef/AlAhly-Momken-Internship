package ws.messenger.services;

import java.util.ArrayList;
import java.util.Map;

import ws.messenger.database.DatabaseSim;
import ws.messenger.model.Message;

public class MessageService {
	private Map<Integer, Message> messages = DatabaseSim.getMessages();
	
	public MessageService() {
		messages.put(1, new Message(1, "message to jan from mina", "mina"));
		messages.put(2, new Message(2, "message to hany from jan", "jan"));
	}

	public ArrayList<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(Integer id) {
		return messages.get(id);
	}

	public Message addMessage(Message m) {
		m.setId(messages.size() + 1);
		messages.put(m.getId(), m);
		return m;
	}

	public Message updateMessage(Message m) {
		messages.put(m.getId(), m);
		return m;
	}

	public Message removeMessage(Message m) {
		messages.remove(m.getId());
		return m;
	}
}
