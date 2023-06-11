package ws.messenger.database;

import java.util.HashMap;
import java.util.Map;

import ws.messenger.model.Message;
import ws.messenger.model.Profile;

public class DatabaseSim {
	static Map<String, Profile> profiles = new HashMap<String, Profile>();
	static Map<Integer, Message> messages = new HashMap<Integer, Message>();

	public static Map<Integer, Message> getMessages() {
		return messages;
	}

	static public Map<String, Profile> getProfiles() {
		return profiles;
	}
}
