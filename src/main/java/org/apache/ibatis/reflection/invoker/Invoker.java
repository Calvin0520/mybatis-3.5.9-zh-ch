/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.reflection.invoker;

import java.lang.reflect.InvocationTargetException;

/**
 * 代理抽象类
 *
 * @see GetFieldInvoker 负责对象属性的读操作
 * @see SetFieldInvoker 负责对象属性的写操作
 * @see MethodInvoker 负责对象其他方法操作
 * @see AmbiguousMethodInvoker 模棱两可的方法操作
 * @author Clinton Begin
 */
public interface Invoker {

  /**
   * 即执行方法。该方法负责完成对象方法的调用和对象属性的读写。在三个实现类中，分别是属性读取操作、属性赋值操作、方法触发操作。
   * @param target 代理目标
   * @param args 参数
   * @return 返回值
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   */
  Object invoke(Object target, Object[] args) throws IllegalAccessException, InvocationTargetException;

  /**
   * 用来获取类型。
   * @return
   */
  Class<?> getType();
}
