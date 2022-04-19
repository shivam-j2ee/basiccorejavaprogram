package in.co.rays.jdbc;

import java.util.HashMap;
import java.util.ResourceBundle;

public class ModelFactoryExm {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("com.rays.proj3.bundle.system");
	private static final String DATABASE = bundle.getString("DATABASE");
	private static ModelFactoryExm mFactory = null;
	
	/**
	 * Cache of Model classes
	 */
	private static HashMap modelCache = new HashMap();
	
	private ModelFactoryExm() {
		System.out.println(" Constructor is private so no other class can create instance of Model Locator");
	}
	
	public static ModelFactoryExm getInstance() {
		if(mFactory == null) {
			mFactory = new ModelFactoryExm();
		}
		return mFactory;	
	}
	
	public UserModelInt getUserModel() {
		
		UserModelInt userModel = (UserModelInt) modelCache.get("userModel");
		if(userModel == null) {
			
			if("Hibernate".equals(DATABASE)) {
				userModel = new UserModelHibImpl();
			}
			if("JDBC".equals(DATABASE)) {
				userModel = new UserModelJDBCImpl();
			}
			
		modelCache.put("useModel", userModel);
		}
		
		return userModel;
		
	}
	
}
