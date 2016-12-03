package config;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigurationTest  {

   @Test
   public void testGetConfiguration_001() {
      Configuration config = Configuration.getConfiguration("config001.xml");
      assertNotNull (config);
      assertNull (config.getDatabases());
   }
   
   @Test
   public void testGetConfiguration_002() {
      Configuration config = Configuration.getConfiguration("config002.xml");
      assertNotNull (config);
      assertNull (config.getDatabases());
   }

   @Test
   public void testSetConfiguration() {
      fail("Not yet implemented");
   }

   @Test
   public void testGetDatabases() {
      fail("Not yet implemented");
   }

   @Test
   public void testSetDatabases() {
      fail("Not yet implemented");
   }

}
