package com.Actions;

import com.PageObjects.LoginPageObjects;
import com.utilities.ReadExcel;
import com.utilities.WebDriverUtils;

public class LoginActions {

	public static void LoginAction() throws Exception {

		WebDriverUtils.goToURL(ReadExcel.ExcelDataReadMethod(0, 1, 0));
		WebDriverUtils.InputValues(LoginPageObjects.UsernameField(), ReadExcel.ExcelDataReadMethod(1, 1, 0));
		WebDriverUtils.ClickAction(LoginPageObjects.NextButtonEmail());
		WebDriverUtils.InputValues(LoginPageObjects.PasswordField(), ReadExcel.ExcelDataReadMethod(1, 1, 1));
		WebDriverUtils.ClickAction(LoginPageObjects.SignInButton());
		WebDriverUtils.ClickAction(LoginPageObjects.YesButton());
		WebDriverUtils.ClickAction(LoginPageObjects.DoneButton());
	}
}