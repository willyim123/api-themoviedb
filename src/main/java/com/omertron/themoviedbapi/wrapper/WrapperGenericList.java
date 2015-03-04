/*
 *      Copyright (c) 2004-2015 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.themoviedbapi.wrapper;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.omertron.themoviedbapi.results.TmdbResultsList;
import java.io.Serializable;
import java.util.List;

/**
 * Generic wrapper for result lists
 *
 * @author Stuart
 * @param <T>
 */
public class WrapperGenericList<T> extends AbstractWrapperAll implements Serializable {

    @JsonProperty("results")
    private List<T> results;

    public List<T> getResults() {
        return results;
    }

    @JsonCreator
    public void setResults(List<T> results) {
        this.results = results;
    }

    public TmdbResultsList<T> getTmdbResultsList() {
        TmdbResultsList<T> resultsList = new TmdbResultsList<T>(results);
        resultsList.copyWrapper(this);
        return resultsList;
    }
}
