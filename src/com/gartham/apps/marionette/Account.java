package com.gartham.apps.marionette;

import org.alixia.javalibrary.json.JSONObject;

import javafx.scene.image.Image;

public class Account {
	private String username, email, password;
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

	public Account(String username, String email, String password, JSONObject additionalProperties) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.additionalProperties = additionalProperties;
	}

	public Account(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Account(String username, String email, String password, Image profileIcon, JSONObject additionalProperties) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.profileIcon = profileIcon;
		this.additionalProperties = additionalProperties;
	}

	public Account() {
	}

}
