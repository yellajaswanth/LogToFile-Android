//package com.yourapp.package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class LogToFile {
	
	private static final String FileName = "APPNAME_LOG.txt";	
	
	public void writeData (Context context, String data) {
		String externalFilesDir = context.getExternalFilesDir(null).getAbsolutePath();	
		
		File logFile = new File(externalFilesDir+ "/"+FileName);
		
        try {
        	FileWriter fw = new FileWriter(logFile.getAbsolutePath(),true);            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(context.getClass().getSimpleName() + ":\t " + data + "\n") ;
            bw.close();           
           
        } catch (Exception e) {
            e.printStackTrace () ;
        }
    }
	
}
