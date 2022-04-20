package Java_Utils;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
public class FileandEnv {
    // from this class we are getting data from property files under inputs folder
    //Hashmap
    public static HashMap fileandenv = new HashMap();
    // Properties is inbuilt package of java using which we can read data from property file
    public static Properties propMain = new Properties();
    public static Properties propPreSet = new Properties();
    //
    public static HashMap envandFile (){
        String environment = System.getProperty("env");
        try{
            if(environment.equalsIgnoreCase("Dev")){
                FileInputStream fishDev = new FileInputStream(System.getProperty("user.dir")+"/inputs/Dev.properties");
                propMain.load(fishDev);
                fileandenv.put("serverUrl",propMain.getProperty("serverUrl"));
                fileandenv.put("portNo",propMain.getProperty("portNo"));
                fileandenv.put("username",propMain.getProperty("username"));
                fileandenv.put("password",propMain.getProperty("password"));
            } else if(environment.equalsIgnoreCase("Qa")){
                FileInputStream fishQa = new FileInputStream(System.getProperty("user.dir")+"/inputs/QA.properties");
                propMain.load(fishQa);
                fileandenv.put("serverUrl",propMain.getProperty("serverUrl"));
                fileandenv.put("portNo",propMain.getProperty("portNo"));
                fileandenv.put("username",propMain.getProperty("username"));
                fileandenv.put("password",propMain.getProperty("password"));

            }

        } catch (Exception e){

        }
        return fileandenv;
    }
    public static HashMap getConfigReader (){
        if(fileandenv==null){
            fileandenv = envandFile();
        }
        return fileandenv;
    }
}

