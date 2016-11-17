package org.gaochun.camera;

import android.content.Context;
import android.view.OrientationEventListener;

/**
 * Created by gaochun on 2016/11/14.
 */
public class MyOrientationDetector extends OrientationEventListener {
    int Orientation;

    public MyOrientationDetector(Context context) {
        super(context);
    }

    @Override
    public void onOrientationChanged(int orientation) {
        this.Orientation = orientation;
    }

    public int getOrientation() {
        return Orientation;
    }
}