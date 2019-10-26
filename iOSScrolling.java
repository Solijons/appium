public void ScrollView () {
    new TouchAction(driver).press(PointOption.point(500, 596)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
            moveTo(PointOption.point(518, 478)).release().perform();
    driver.findElementByAccessibilityId("Steppers").click();
}
