/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.argument;

import net.sf.mmm.query.api.argument.StringArgument;
import net.sf.mmm.query.api.expression.Expression;
import net.sf.mmm.query.api.expression.SqlOperator;
import net.sf.mmm.query.api.expression.SqlOperator.SqlOperatorLike;

/**
 * The abstract base implementation of {@link StringArgument}.
 *
 * @author hohwille
 * @since 8.5.0
 */
public abstract interface AbstractStringArgument extends AbstractComparableArgument<String>, StringArgument {

  @Override
  default Expression like(String pattern) {

    return exp(SqlOperator.LIKE, pattern);
  }

  @Override
  default Expression like(String pattern, char escape) {

    return exp(new SqlOperatorLike(true, escape), pattern);
  }

}
