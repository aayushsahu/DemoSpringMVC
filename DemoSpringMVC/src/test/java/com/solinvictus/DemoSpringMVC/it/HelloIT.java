package com.solinvictus.DemoSpringMVC.it;

import org.junit.*;
import java.io.*;
import java.net.*;
//import org.apache.commons.io.IOUtils;
public class HelloIT{
  
  private static String port, name;
  
  @Before
  public void setup() {
    port = System.getProperty("servlet.port", "8080");
    name = System.getProperty("artifactId", "DemoSpringMVC");
  }
  @Test
  public void hello() throws IOException {
    String testName = "testname";
    HttpURLConnection connection = 
        (HttpURLConnection)new URL("http://localhost:" + port  + '/' + 
            name +"/hello?name=" + testName).openConnection();
    connection.connect();
    Assert.assertEquals(200, connection.getResponseCode());
    
    try (InputStream in = connection.getInputStream()) {
      //String output = IOUtils.toString(in);
      //Assert.assertTrue("Name not found in page - source: \n" + output, 
          //output.contains(testName));
    }
  }
}