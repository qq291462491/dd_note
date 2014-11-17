package org.dd.note.common.entity.search.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * or 条件
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:21:37
 * <p> @version 0.0.1
 */
public class OrCondition implements SearchFilter {

    private List<SearchFilter> orFilters = Lists.newArrayList();

    OrCondition() {
    }

    public OrCondition add(SearchFilter filter) {
        this.orFilters.add(filter);
        return this;
    }

    public List<SearchFilter> getOrFilters() {
        return orFilters;
    }

    @Override
    public String toString() {
        return "OrCondition{" + orFilters + '}';
    }
}
