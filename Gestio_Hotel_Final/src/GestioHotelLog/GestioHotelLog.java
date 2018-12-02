/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioHotelLog;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class GestioHotelLog {
    public static final LogManager logManager = LogManager.getLogManager();
    public static final Logger LOGGER = Logger.getLogger("confLogger");
    
    static {
        try {
            logManager.readConfiguration(new FileInputStream("./conf/logger.properties"));
        } catch (IOException exception) {
            LOGGER.log(Level.INFO, "Error in loading configuration",exception);
        }
    }
    
}
