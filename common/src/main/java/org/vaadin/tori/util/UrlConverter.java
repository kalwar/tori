package org.vaadin.tori.util;

import org.vaadin.tori.data.DataSource.UrlInfo;

public interface UrlConverter {
    /**
     * @param queryUrl
     *            The part of the URL that comes after the context path
     *            (excludes fragment)
     * @param string
     * @param queryPart
     * @return The fragment that corresponds to the queried URL.
     *         <code>null</code> if no changes are to be made. Empty string to
     *         clear the fragment.
     * @throws Exception
     *             if the translation to a Tori fragment was unsuccessful.
     */
    UrlInfo getToriFragment(String queryUrl, String queryPart) throws Exception;
}
