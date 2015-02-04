/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.catalog;

import java.util.HashSet;
import java.util.Set;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class TableMeta {

  @PrimaryKey
  private String name;

  private Set<ColumnMeta> cols = new HashSet<ColumnMeta>();

  public TableMeta(String name) {
    // table name should be case insensitive
    this.setName(name);
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name.toLowerCase();
  }

  /**
   * @return the cols
   */
  public Set<ColumnMeta> getCols() {
    return cols;
  }

  /**
   * @param cols
   *          the cols to set
   */
  public void setCols(Set<ColumnMeta> cols) {
    this.cols = cols;
  }

}