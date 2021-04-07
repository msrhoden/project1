package com.simplelear.assessment;
import java.io.File;
import java.io.IOException;

public class FileOptionMenu {
	
	public String fileName;
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDefaultPath() {
		return defaultPath;
	}

	public void setDefaultPath(String defaultPath) {
		this.defaultPath = defaultPath;
	}

	public String defaultPath;
	
	
	
	
	public void createFile() {		
		File file =new File("C:\\LockedMe_Docs"+"\\"+ fileName);
    	try{
    		file.createNewFile();
    		System.out.println("file " + fileName + " created");
    	}
    	catch(IOException EX){	                    		
    	}
	}
    	
    public void deleteFile() {   
    	
    	System.out.println(fileName + " deleted");
    	File file = new File ("C:\\LockedMe_Docs"+"\\"+ fileName);    
    	file.delete();
    	
    }
    	
    
		
	
	
	

}
        
