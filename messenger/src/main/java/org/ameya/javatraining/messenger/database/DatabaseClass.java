package org.ameya.javatraining.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.ameya.javatraining.messenger.model.Message;
import org.ameya.javatraining.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();
	
	public DatabaseClass(){
		Message m1 = new Message(1L, "Hello World!", "Ameya");
		Message m2 = new Message(2L, "Hello Jersey!", "Ameya");
		messages.put(m1.getId(), m1);
		messages.put(m2.getId(), m2);
	}
	
	public Map<Long, Message> getMessages(){
		return messages;
	}
	
	public Map<Long, Profile> getProfiles(){
		return profiles;
	}
	

}
