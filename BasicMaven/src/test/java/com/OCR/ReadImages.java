package com.OCR;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {
	
	@Test
	public void ReadingImages() throws TesseractException{
		ITesseract image = new Tesseract();
		String str = image.doOCR(new File("C:\\Automation\\workspace\\BasicMaven\\OCRImages\\DemoImage.png"));
		Reporter.log(str,true);
	}
}
