/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.DBMeta;

public class DescribeStmt extends StatementBase {

  private String tblName;

  public DescribeStmt() {}

  public DescribeStmt(String tblName) {
    this.tblName = tblName;
  }


  @Override
  public void analyze(DBMeta dbMeta, ParseNode... fieldSources) throws SemanticException {
  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder();
    sb.append("DESCRIBE ");
    sb.append(tblName);
    return sb.toString();
  }

  @Override
  public boolean involveEncrytedCol() {
    return false;
  }

  public String getTblName() {
    return tblName;
  }

  public void setTblName(String tblName) {
    this.tblName = tblName;
  }
}