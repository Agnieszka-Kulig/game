package resources;

import java.awt.Toolkit;

public class ResourcesLoader {
	
	static ResourcesLoader rl = new ResourcesLoader();
	
	public static Image getImage(String filename){
		return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("images/"+filename));
	}

}
