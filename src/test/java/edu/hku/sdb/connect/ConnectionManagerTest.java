package edu.hku.sdb.connect;

import edu.hku.sdb.driver.SdbDriver;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static org.junit.Assert.assertNotNull;

public class ConnectionManagerTest {

  // @BeforeClass
  // public static void setUpBeforeClass() throws Exception {
  // String[] args = new String[1];
  // args[0] = "start";
  // SdbDriver.main(args);
  // }
  //
  // public void setUp() throws Exception {
  //
  // }
  //
  // public void tearDown() throws Exception {
  //
  // }

  // To do: Don't use concrete DBMS to test, use derby or a mock up server
  @Test
  public void testGetStatement() throws Exception {
    // ConnectionService connectionService = null;
    // try {
    // connectionService = (ConnectionService) Naming
    // .lookup("//localhost:2019/ConnectionService");
    // assertNotNull(connectionService);
    // } catch (NotBoundException e) {
    // e.printStackTrace();
    // } catch (MalformedURLException e) {
    // e.printStackTrace();
    // } catch (RemoteException e) {
    // e.printStackTrace();
    // }
    // Connection connection = connectionService.getConnection();
    // assertNotNull(connection);
    // Statement statement = connection.createStatement();
    // assertNotNull(statement);
  }

}