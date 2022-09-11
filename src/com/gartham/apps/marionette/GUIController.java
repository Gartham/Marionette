package com.gartham.apps.marionette;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GUIController {
	private @FXML TableView<Account> accountList;
	private @FXML TableColumn<Account, Account> profileIconColumn, usernameColumn, emailColumn, passwordColumn;
}
