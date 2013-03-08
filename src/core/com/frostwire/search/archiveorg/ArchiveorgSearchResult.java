/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011, 2012, FrostWire(TM). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.frostwire.search.archiveorg;

import com.frostwire.search.AbstractWebSearchResult;
import com.frostwire.search.CrawlableSearchResult;
import com.frostwire.search.SearchResultCodec;

/**
 * @author gubatron
 * @author aldenml
 *
 */
public class ArchiveorgSearchResult extends AbstractWebSearchResult implements CrawlableSearchResult {

    private final ArchiveorgItem item;

    public ArchiveorgSearchResult(ArchiveorgItem item) {
        this.item = item;
    }

    public ArchiveorgItem getItem() {
        return item;
    }

    public long getCreationTime() {
        return -1;
    }

    @Override
    public String getFilename() {
        return null;
    }

    @Override
    public String getCacheKey() {
        return "";
    }

    @Override
    public long getSize() {
        return -1;
    }

    @Override
    public String getDisplayName() {
        return item.title;
    }

    @Override
    public String getSource() {
        return "Archive.org";
    }

    @Override
    public String getDetailsUrl() {
        return item.identifier;
    }

    @Override
    public SearchResultCodec getCodec() {
        return new ArchiveorgSearchResultCodec();
    }
}
