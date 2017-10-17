/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.api.path;

import net.sf.mmm.bean.api.BeanFactory;

/**
 * This is the interface for an {@link EntityAlias} used in an
 * {@link net.sf.mmm.query.api.statement.Statement statement} e.g. inside a a
 * {@link net.sf.mmm.query.api.statement.SqlDialect#from() FROM} block.
 *
 * @param <E> the generic type of the {@link #getEntityType() type} of this {@link EntityAlias}.
 *
 * @see net.sf.mmm.util.query.base.path.Alias
 *
 * @author hohwille
 * @since 8.5.0
 */
public interface EntityAlias<E> extends PathRoot<E> {

  /**
   * @return the actual source of this {@link EntityAlias}. Typically the name of a table, entity, class, etc.
   *         Shall NOT be {@code null}.
   */
  String getSource();

  /**
   * @return the alias name of this {@link EntityAlias} (what is "alias" in "SELECT FROM Foo AS alias").
   */
  @Override
  String getName();

  /**
   * @return the optional {@link Class} reflecting the internal entity of the {@link #getSource() source}. It
   *         is not bound to {@literal <E>} as the internal entity does not necessarily have to be the queried
   *         {@link #getResultType() result type}. May be {@code null}.
   */
  Class<?> getEntityType();

  /**
   * @return the optional {@link Class} reflecting the external result when this {@link EntityAlias} gets
   *         queried.
   */
  Class<E> getResultType();

  /**
   * @return optional the {@link BeanFactory#createPrototype(Class) prototype} of this source. May be
   *         {@code null}.
   */
  @Override
  E getPrototype();

  /**
   * @param aliasName the new {@link #getName() alias name}.
   * @return a copy of this {@link EntityAlias} with the given {@link #getName() alias name}.
   */
  EntityAlias<E> as(String aliasName);

}
