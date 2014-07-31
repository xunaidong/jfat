/*
 * Copyright (C) 2014 The Jfat Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.jfat.commons.date;

import junit.framework.Test;
import junit.framework.TestSuite;

/** Run all JUnit tests. */
public final class TESTAll {

  public static void main(String args[]) {
    String[] testCaseName = { TESTAll.class.getName()};
    junit.textui.TestRunner.main(testCaseName);
 }
  
  public static Test suite ( ) {
    TestSuite suite= new TestSuite("All JUnit Tests");

    suite.addTest(new TestSuite(TESTDateTime.class));
    suite.addTest(new TestSuite(TESTDateTimeFormatter.class));
    suite.addTest(new TestSuite(TESTDateTimeInterval.class));
    
    return suite;
  }
}
