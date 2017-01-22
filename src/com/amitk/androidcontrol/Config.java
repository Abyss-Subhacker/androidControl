
package com.amitk.androidcontrol;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
	private String adbCommand;
	private long screenshotDelay;
	private String localImageFilePath;
	private String phoneImageFilePath;
	
	public void load(InputStream in) throws IOException
	{
		Properties properties = new Properties();
		properties.load(in);
		
		adbCommand = properties.getProperty("adbCommand");
		screenshotDelay = Long.parseLong(properties.getProperty("screenshotDelay"));
		localImageFilePath = properties.getProperty("localImageFilePath");
		phoneImageFilePath = properties.getProperty("phoneImageFilePath");
	}
	
	public String getAdbCommand()
	{
		return adbCommand;
	}
	
	public void setAdbCommand(String adbCommand)
	{
		this.adbCommand = adbCommand;
	}
	
	public long getScreenshotDelay()
	{
		return screenshotDelay;
	}
	
	public void setScreenshotDelay(long screenshotDelay)
	{
		this.screenshotDelay = screenshotDelay;
	}

	public String getLocalImageFilePath()
	{
		return localImageFilePath;
	}

	public void setLocalImageFilePath(String localImageFilePath)
	{
		this.localImageFilePath = localImageFilePath;
	}

	public String getPhoneImageFilePath()
	{
		return phoneImageFilePath;
	}

	public void setPhoneImageFilePath(String phoneImageFilePath)
	{
		this.phoneImageFilePath = phoneImageFilePath;
	}
}
