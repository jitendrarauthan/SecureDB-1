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

import java.util.List;

public class StarLiteral extends LiteralExpr {

  private final String name = "*";
  private List<TableRef> tblRefs;

  public StarLiteral(){}

  public StarLiteral(List<TableRef> tblRefs) {
    this.setTblRefs(tblRefs);
  }

  /**
   * @return the tblRefs
   */
  public List<TableRef> getTblRefs() {
    return tblRefs;
  }

  /**
   * @param tblRefs the tblRefs to set
   */
  public void setTblRefs(List<TableRef> tblRefs) {
    this.tblRefs = tblRefs;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#involveEncrytedCol()
   */
  @Override
  public boolean involveEncrytedCol() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

}
