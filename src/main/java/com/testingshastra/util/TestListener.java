package com.testingshastra.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testingshastra.keywords.UIkeyword1;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListener implements ITestListener {
	private static final Logger LOG=Logger.getLogger(TestListener.class);
	@Override
	public void onTestFailure(ITestResult result) {
		AShot ashot=new AShot();
		LOG.info("Test is failed.Taking screenshot");
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(200));
		Screenshot sc=ashot.takeScreenshot(UIkeyword1.getInstance1().driver);
		BufferedImage img=sc.getImage();
		String dir=System.getProperty("user.dir");
		try {
			ImageIO.write(img,"png",new File(dir+"/Screenshots/"+result.getName()+".png"));
			LOG.info("Screenshot issaved succesfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	}