package org.datavec.dataframe.filtering.longs;

import org.datavec.dataframe.api.LongColumn;
import org.datavec.dataframe.api.Table;
import org.datavec.dataframe.columns.ColumnReference;
import org.datavec.dataframe.filtering.ColumnFilter;
import org.datavec.dataframe.util.Selection;

/**
 */
public class LongLessThan extends ColumnFilter {

  private long value;

  public LongLessThan(ColumnReference reference, long value) {
    super(reference);
    this.value = value;
  }

  public Selection apply(Table relation) {
    LongColumn longColumn = (LongColumn) relation.column(getColumnReference().getColumnName());
    return longColumn.isLessThan(value);
  }
}
