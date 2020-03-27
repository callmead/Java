/*
 * Copyright (c) 1999-2001 Christoph Mueller. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * THIS SOFTWARE IS PROVIDED BY CHRISTOPH MUELLER ``AS IS'' AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL CHRISTOPH MUELLER OR
 * HIS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

//package de.must.dataobj;
package pdnms;
import java.sql.*;

/**
 * The specification needed to create a database connection.
 * @see ConnectionHolder
 * @author Christoph Mueller
 */
public class ConnectionSpecification {

  public static final int CONNECT_JDBC_ODBC = 0;
  public static final int CONNECT_JDBC_DIRECT = 1;

  private int connectType = CONNECT_JDBC_ODBC;
  private String url;
  private String odbcName;
  private String driverName;
  private String userName;
  private String password;

  /**
   * Constructs a connection specification for a ODBC connection with blank user
   * and password.
   * @param odbcName the ODBC Datasource name
   */
  public ConnectionSpecification(String odbcName) {
    this(odbcName, "", "");
  }

  /**
   * Constructs a connection specification for a ODBC connection.
   * @param odbcName the ODBC Datasource name
   * @param userName the name of the database user
   * @param password the password of the database user
   */
  public ConnectionSpecification(String odbcName, String userName, String password) {
    connectType = CONNECT_JDBC_ODBC;
    this.odbcName = odbcName;
    this.url = "jdbc:odbc:" + odbcName;
    this.driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
    this.userName = userName;
    this.password = password;
  }

  /**
   * Constructs a connection specification for a direct JDBC connection.
   * @param url the URL of the database to connect to
   * @param driverName the name of the database drive to use
   * @param userName the name of the database user
   * @param password the password of the database user
   */
  public ConnectionSpecification(String url, String driverName, String userName, String password) {
    connectType = CONNECT_JDBC_DIRECT;
    this.url = url;
    this.driverName = driverName;
    this.userName = userName;
    this.password = password;
  }

  /**
   * Returns the connect type
   * @return the connect type
   */
  public int getConnectType() {
    return connectType;
  }

  /**
   * Returns the ODBC datasource name
   * @return the ODBC datasource name
   */
  public String getOdbcName() {
    return odbcName;
  }

  /**
   * Returns the URL
   * @return the URL
   */
  public String getUrl() {
    return url;
  }

  /**
   * Returns the driver's name
   * @return the driver's name
   */
  public String getDriverName() {
    return driverName;
  }

  /**
   * Returns the name of the database user
   * @return the name of the database user
   */
  public String getUserName() {
    return userName;
  }

  /**
   * Returns the password of the database user
   * @return the password of the database user
   */
  public String getPassword() {
    return password;
  }

  /**
   * Returns a connection as specified when constructed.
   * @return a connection as specified when constructed
   */
  public Connection getConnection() throws ClassNotFoundException, SQLException {
    Connection connection = null;
    if (connectType == CONNECT_JDBC_ODBC) {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      DriverManager.setLoginTimeout(30);
      connection = DriverManager.getConnection("jdbc:odbc:" + odbcName, userName, password);
    } else {
      Class.forName(driverName);
      DriverManager.setLoginTimeout(30);
      connection = DriverManager.getConnection(url, userName, password);
    }
    return connection;
  }

}
