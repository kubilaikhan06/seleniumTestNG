package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElement(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).click();

	}

	public void setDepartureCity(String departurecitycode) {
		// MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_AREA_ID)).click();
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_AREA_ID)));
		s.selectByValue("GB_CM");
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue("GLA");
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.CHOOSE_LANGAGE_BUTTON_CLASS)).get(2).click();
	}

	/*
	 * CHECKS
	 */
}
