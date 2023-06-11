package ws.messenger.services;

import java.util.ArrayList;
import java.util.Map;
import ws.messenger.database.DatabaseSim;
import ws.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> Profiles = DatabaseSim.getProfiles();
	public ProfileService() {
	Profiles.put("jan",new Profile(1, "jan"));
	Profiles.put("youssef",new Profile(2, "youssef"));
	}
	public ArrayList<Profile> getAllProfiles() {
		return new ArrayList<Profile>(Profiles.values());
	}

	public Profile getProfile(String profileName) {
		return Profiles.get(profileName);
	}

	public Profile addProfile(Profile p) {
		p.setId(Profiles.size() + 1);
		Profiles.put(p.getName(), p);
		return p;
	}

	public Profile updateProfile(Profile p) {
		Profiles.put(p.getName(), p);
		return p;
	}

	public Profile removeProfile(Profile p) {
		Profiles.remove(p.getName());
		return p;
	}
}
