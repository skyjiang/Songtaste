package com.carlisle.songtaste.cmpts.events;

/**
 * Created by carlisle on 4/5/15.
 */
public class RefreshDataEvent {
    public int position = -1;

    public RefreshDataEvent(int position) {
        this.position = position;
    }
}