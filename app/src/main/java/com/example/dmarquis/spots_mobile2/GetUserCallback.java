package com.example.dmarquis.spots_mobile2;

/**
 * Created by D'Marquis on 5/8/2015.
 */
public interface GetUserCallback {
    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}
