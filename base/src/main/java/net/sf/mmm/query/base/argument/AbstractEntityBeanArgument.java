/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.argument;

import net.sf.mmm.bean.api.entity.EntityBean;
import net.sf.mmm.query.api.argument.EntityBeanArgument;
import net.sf.mmm.query.api.expression.Expression;

/**
 * The abstract base implementation of {@link EntityBeanArgument}.
 *
 * @param <V> the generic type of the value to check by the {@link Expression} to build.
 *
 * @author hohwille
 * @since 8.5.0
 */
public abstract interface AbstractEntityBeanArgument<V extends EntityBean> extends AbstractArgument<V>, EntityBeanArgument<V> {

}
