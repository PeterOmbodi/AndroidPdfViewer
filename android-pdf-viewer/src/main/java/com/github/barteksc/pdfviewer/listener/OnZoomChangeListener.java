package com.github.barteksc.pdfviewer.listener;

/**
 * Created by Peter on 25.08.2017.
 */

/**
 * Implements this interface to receive events from PDFView
 * when a zoom has been changed
 */
public interface OnZoomChangeListener {
    /**
     * Called on every zoom changing
     *
     * @param zoom current zoom level
     */
    void onZoomChanged(float zoom);
}
