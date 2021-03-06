/*
 * Copyright 2015 The Board of Trustees of The Leland Stanford Junior University.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.susom.database;

/**
 * Simple bean representing how the database transaction should behave
 * in terms of commit/rollback.
 *
 * @author garricko
 */
public class TransactionImpl implements Transaction {
  private boolean rollbackOnError;
  private boolean rollbackOnly;

  @Override
  public boolean isRollbackOnError() {
    return rollbackOnError;
  }

  @Override
  public void setRollbackOnError(boolean rollbackOnError) {
    this.rollbackOnError = rollbackOnError;
  }

  @Override
  public boolean isRollbackOnly() {
    return rollbackOnly;
  }

  @Override
  public void setRollbackOnly(boolean rollbackOnly) {
    this.rollbackOnly = rollbackOnly;
  }
}
