/*
 * Copyright 2011 Global Biodiversity Information Facility (GBIF)
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
package org.gbif.dwca.tools;

import org.gbif.dwca.tools.IdGenerator;
import org.gbif.dwca.tools.IntSequenceGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntSequenceGeneratorTest {

  @Test
  public void testNextId() throws Exception {
    IdGenerator gen = new IntSequenceGenerator(100);
    assertEquals("100", gen.nextId());
    assertEquals("101", gen.nextId());
    assertEquals("102", gen.nextId());
    assertEquals("103", gen.nextId());
  }
}
