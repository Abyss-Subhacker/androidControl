package com.amitk.androidcontrol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamGobbler extends Thread
{
	private InputStream in;
	private OutputStream out;

	public StreamGobbler(InputStream in, OutputStream out)
	{
		this.in = in;
		this.out = out;
	}
	
	@Override
	public void run()
	{
		byte[] buffer = new byte[8192];

		try
		{
			for(;;)
			{
				if(Thread.interrupted())
				{
					break;
				}
				
				int count = in.read(buffer);
				
				if(count < 0)
				{
					break;
				}
				
				if(count > 0 && out != null)
				{
					out.write(buffer, 0, count);
				}
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
