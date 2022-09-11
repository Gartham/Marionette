package com.gartham.apps.marionette;

import org.alixia.javalibrary.json.JSONObject;

import javafx.scene.image.Image;

public class Account {
	private String email, password, username;
	private Image profileIcon;
	private JSONObject additionalProperties;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Image getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(Image profileIcon) {
		this.profileIcon = profileIcon;
	}

	public JSONObject getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(JSONObject additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
