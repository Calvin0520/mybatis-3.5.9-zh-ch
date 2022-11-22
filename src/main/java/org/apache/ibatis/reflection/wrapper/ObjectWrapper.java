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
package org.apache.ibatis.reflection.wrapper;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;

/**
 * 对象包装器 所有包装器的基类接口
 * @author Clinton Begin
 */
public interface ObjectWrapper {

  /**
   * 获取被包装属性的值
   * @param prop 属性分词器
   * @return
   */
  Object get(PropertyTokenizer prop);

  /**
   * 设置被包装属性的值
   * @param prop 属性分词器
   * @param value 要设置的值
   */
  void set(PropertyTokenizer prop, Object value);

  /**
   * 找到对应的属性名称
   * @param name 属性名称
   * @param useCamelCaseMapping 是否启用下划线命名转换为驼峰命名
   * @return
   */
  String findProperty(String name, boolean useCamelCaseMapping);

  /**
   * 获取所有get方法名称
   * @return
   */
  String[] getGetterNames();

  /**
   * 获取所有set方法名称
   * @return
   */
  String[] getSetterNames();

  /**
   * 获取属性的get方法类型
   * @param name 属性名称
   * @return
   */
  Class<?> getSetterType(String name);

  /**
   * 获取属性的set方法类型
   * @param name 属性名称
   * @return
   */
  Class<?> getGetterType(String name);

  /**
   * 判断属性是否有对应set方法
   * @param name 属性名称
   * @return
   */
  boolean hasSetter(String name);

  /**
   * 判断属性是否有对应get方法
   * @param name 属性名称
   * @return
   */
  boolean hasGetter(String name);

  /**
   * 实例化属性的值
   * @param name 属性名称
   * @param prop 属性分词器
   * @param objectFactory 对象操作工厂
   * @return
   */
  MetaObject instantiatePropertyValue(String name, PropertyTokenizer prop, ObjectFactory objectFactory);

  /**
   * 返回被包装的对象是不是集合
   * @return
   */
  boolean isCollection();

  /**
   * 向集合中添加一个元素
   * @param element
   * @see Collection#add(Object)
   */
  void add(Object element);

  /**
   * 向集合中批量元素
   * @param element
   * @param <E>
   * @see Collection#addAll(Collection)
   */
  <E> void addAll(List<E> element);

}
