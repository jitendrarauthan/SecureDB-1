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

package edu.hku.sdb.parse;

import java.util.ArrayList;
import java.util.List;

import edu.hku.sdb.catalog.DBMeta;

public class SelectionList implements ParseNode {

  protected List<SelectionItem> itemList;

  public SelectionList() {
    itemList = new ArrayList<SelectionItem>();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectionList))
      return false;

    SelectionList listObj = (SelectionList) obj;
    return itemList.equals(listObj.itemList);
  }

  /**
   * @return the itemList
   */
  public List<SelectionItem> getItemList() {
    return itemList;
  }

  /**
   * @param itemList
   *          the itemList to set
   */
  public void setItemList(List<SelectionItem> itemList) {
    this.itemList = itemList;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.catalog.DBMeta)
   */
  @Override
  public void analyze(DBMeta dbMeta) throws SemanticException {
    for(SelectionItem item : itemList)
      item.analyze(dbMeta);
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }
}