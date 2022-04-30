/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DB4OUtils;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;


import java.nio.file.Paths;
import models.AppSystem;
import models.SystemConfig;

/**
 *
 * @author thomas
 */
public class DB4OUtils {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtils dB4OUtil;
    
    public synchronized static DB4OUtils getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtils();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);
            //Register your top most Class here
            config.common().objectClass(AppSystem.class).cascadeOnUpdate(true); // Change to the object you want to save
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(AppSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public AppSystem retrieveSystem(){
       ObjectContainer conn = createConnection();
        ObjectSet<AppSystem> systems = conn.query(AppSystem.class); // Change to the object you want to save
        AppSystem system;
        if (systems.isEmpty()) {
            system = SystemConfig.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
