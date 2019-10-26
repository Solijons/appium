    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {
        IOSDriver<IOSElement> driver;
        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        d.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        d.setCapability(MobileCapabilityType.APP, "UIKitCatalog.app");
        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), d);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
