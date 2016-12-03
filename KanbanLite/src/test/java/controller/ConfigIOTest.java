package controller;

import static org.junit.Assert.*;

import org.junit.Test;

import model.config.Configuration;

public class ConfigIOTest {

   @Test
   public void testGetConfiguration_001() {
      Configuration config = ConfigIO.getConfiguration("config001.xml");
      assertNotNull (config);
      assertNull (config.getDatabases());
   }
   
   @Test
   public void testGetConfiguration_002() {
      Configuration config = ConfigIO.getConfiguration("config002.xml");
      assertNotNull (config);
      assertNull (config.getDatabases());
   }

   @Test
   public void testSetConfiguration() {
      fail("Not yet implemented");
   }

}
