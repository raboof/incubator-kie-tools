/*
 * Copyright 2010 JBoss, a divison Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.bus.client.tests.support;

import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;

/**
 * @author Mike Brock <cbrock@redhat.com>
 * @author Christian Sadilek <csadilek@redhat.com>
 */
@Remote
public interface TestRPCServiceRemote {
  public boolean isGreaterThan(int a, int b);
  public void exception() throws TestException;
  
  public List<Long> listOfLong(List<Long> list);
  public List<Integer> listOfInteger(List<Integer> list);
  public List<Float> listOfFloat(List<Float> list);

  public ClassWithNestedClass nestedClass(ClassWithNestedClass clazz);

  public EntityWithGenericCollections genericCollections(EntityWithGenericCollections ent);

  public EntityWithStringBufferAndStringBuilder testStringBufferAndStringBuilder(EntityWithStringBufferAndStringBuilder entity);

  public Throwable testSerializeThrowable(Throwable t);

  public AssertionError testSerializeAssertionError(AssertionError t);

}


