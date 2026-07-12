package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	
	public ConfigReader() {
	
     
try {
	FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	
	prop = new Properties();
	
	prop.load(fis);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

   
	
	}
	
	
	// this is use for the intilization to read the property 7
	
	
public String getBrowser() {
		
		return prop.getProperty("browser");
		
}
	
	public String getUrl() {
		
		return prop.getProperty("url");
		
	}
	
	public String getEmail() {
		
		return prop.getProperty("email");
		
	}
	
	public String getPassword() {
		
		return prop.getProperty("password");
		
	}
	
	public String getHighContrastSwitch() {
		
		return prop.getProperty("HighContrastSwitch");
	}
	
	
	public String getTimeZone() {
		return prop.getProperty("timeZone");
	}
	
	public String getOrganisation() {
		
		return prop.getProperty("organisation");
		
	}
	
	public String getUser() {
		return prop.getProperty("user");
	}
	
	public String inviteUser() {
		return prop.getProperty("inviteUser");
	}
	
 public String getFirstName() {
	 return prop.getProperty("firstName");
	  
 }
 
 public String getLastName() {
	 
	 return prop.getProperty("lastName");
 }
 
 public String getEmailID() {
	 
	 return prop.getProperty("emailID");
 }
 
 
 public String getLocation() {
	 
	 return prop.getProperty("location");
 }
 
 
 public String getTheme() {
	 
	 return prop.getProperty("theme");
 }

 
 public String getRoomName() {
	 
	 return prop.getProperty("roomName");
 }
 
 
 public String getLocation1() {
	 
	 return prop.getProperty("location");
 }
 
 
 public String getDuration() {
	 
	 return prop.getProperty("duration");
 }
 
 
 public String getAdvanceOption1() {
	 
	 return prop.getProperty("advanceoption");
 }
 
 
 public String getPrepration() {
	 
	 return prop.getProperty("prepration");
			 
 }
 
 
 public String getDeskName() {
	 
	 return prop.getProperty("deskname");
 }
 
 
 public String getAdvanceOption2() {
	 
	 return prop.getProperty("advanceoptions");
 }
 
 public String getPrepartion() {
	 
	 return prop.getProperty("prepartion");
 }
 
 // computers 
 
 public String getComputerName() {
	 
	 return prop.getProperty("addname");
	 
 }
 
 public String getComputerID() {
	 
	 return prop.getProperty("addID");
	
 }
 
 
 public String getnoshowwaitTime() {
	 
	 return prop.getProperty("noshowwaitTime");
	 
 }
 
 public String getLevelWarnining() {
	 
	 return prop.getProperty("level1Warning");
	 
 }
 
 
 public String getLevelWarning2() {
	 
	 return prop.getProperty("level2WarningMessage");
	 
 }
 
 
 public String getLevelLevelWarning3() {
	 
	 return prop.getProperty("level3Warning");
 }
 
 
 public String getInactivityTimeout() {
	 
	 return prop.getProperty("inactivityTimeout");
 }
 
 
 public String getLockTime() {
	 
	 return prop.getProperty("lockTimeout");
 }
 
 
 
public String getReserveLocation() {
	
	return prop.getProperty("location");
	
}


public String getstartTime() {
	
	return prop.getProperty("startTime");
}


public String getStartTime1() {
	
	return prop.getProperty("StartTime1");
}

public String getStartTime2() {
	
	return prop.getProperty("StartTime2");


}



public String getDirectory() {
	
	return prop.getProperty("Directory");
}




public String getPleasechoose() {
	
	return prop.getProperty("Pleasechoose");
}
}
 
 
 
 
	
	
	


