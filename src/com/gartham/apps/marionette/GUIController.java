package com.gartham.apps.marionette;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class GUIController {
	private @FXML TableView<Account> accountList;
	private @FXML TableColumn<Account, Account> profileIconColumn, usernameColumn, emailColumn, passwordColumn;

	private @FXML BorderPane root;

	private @FXML void rootKeyPressed(KeyEvent event) {
		if (event.getCode() == KeyCode.SPACE) {
			// IMPLEMENT Open create-new GUI.
		}
	}

	private @FXML void initialize() {
		accountList.getItems().add(new Account("Chcuk", "chuck@dusttoash.org", null));
		accountList.setRowFactory(param -> new TableRow<>());

		profileIconColumn.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue()));
		usernameColumn.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue()));
		emailColumn.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue()));
		passwordColumn.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue()));

		profileIconColumn.setCellFactory(param -> new TableCell<>() {
			protected void updateItem(Account item, boolean empty) {
				if (empty || item == null) {
					setText(null);
					setGraphic(null);
				} else if (item.getProfileIcon() != null)
					setGraphic(new ImageView(item.getProfileIcon()));
			}
		});

		usernameColumn.setCellFactory(param -> new TableCell<>() {
			protected void updateItem(Account item, boolean empty) {
				if (empty || item == null) {
					setText(null);
					setGraphic(null);
				} else if (item.getUsername() != null) {
					setText(item.getUsername());
					setTextFill(Color.GOLD);
				} else {
					setText("None");
					setTextFill(Color.FIREBRICK);
				}
			}
		});

		emailColumn.setCellFactory(param -> new TableCell<>() {
			protected void updateItem(Account item, boolean empty) {
				if (empty || item == null) {
					setText(null);
					setGraphic(null);
				} else if (item.getEmail() != null) {
					setText(item.getEmail());
					setTextFill(Color.GOLD);
				} else {
					setText("None");
					setTextFill(Color.FIREBRICK);
				}
			}
		});
		passwordColumn.setCellFactory(param -> new TableCell<>() {
			protected void updateItem(Account item, boolean empty) {
				if (empty || item == null) {
					setText(null);
					setGraphic(null);
				} else if (item.getPassword() != null) {
					setText(item.getPassword());
					setTextFill(Color.GOLD);
				} else {
					setText("None");
					setTextFill(Color.FIREBRICK);
				}
			}
		});
	}

}
