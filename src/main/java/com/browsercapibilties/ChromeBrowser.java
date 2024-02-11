package com.browsercapibilties;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser extends BrowserCapbilities {
	
	public static ChromeOptions option=new ChromeOptions();

	@Override
	void setDownloadPath() {
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("download.default_directory", System.getProperty("user.dir"+"\\downloadfile"));
		option.setExperimentalOption("perfs", prefs);
		
		
	}

}
