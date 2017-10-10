--------------------Find all the java files in a current directory/package -----------------------

package com.emc.gs.network.validation.tool.prepopulatedto;

import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception{
    	
    	
    	 File folder = new File("/C:/Code/Backend_Code/26_SEP_2017/vxrail-network-validation-tool/nvt-dtos/src/test/java/com/emc/gs/network/validation/tool/prepopulatedto");
    	    File[] listOfFiles = folder.listFiles();

    	    for (File file : listOfFiles) {
    	        if (file.isFile()) {
    	            System.out.println(file.getName());
    	        }
    	    }
    	    
    }

}


------------------------------------------------------------------------------------------------------------------------

