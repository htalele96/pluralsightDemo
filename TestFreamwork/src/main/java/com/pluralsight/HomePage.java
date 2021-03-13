package com.pluralsight;

public class HomePage {
static String url="https://pluralsoght.com";
static String title="Pluralsight | The tech workforce development company";
	public void goTo() {
		// TODO Auto-generated method stub
		Browser.goTo(url);
	}
	public boolean isAt() {
		// TODO Auto-generated method stub
		return Browser.title().equals(title);
	}

}
