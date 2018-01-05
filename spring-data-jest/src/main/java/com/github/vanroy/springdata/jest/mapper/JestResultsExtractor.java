package com.github.vanroy.springdata.jest.mapper;

import io.searchbox.core.SearchResult;

/**
 * Interface results extractor.
 *
 * @param <T> Type of extract result.
 * @author Julien Roy
 */
public interface JestResultsExtractor<T> {

	T extract(SearchResult response);
}
