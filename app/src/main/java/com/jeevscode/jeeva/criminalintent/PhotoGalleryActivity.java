package com.jeevscode.jeeva.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jeeva on 22/09/17.
 */

public class PhotoGalleryActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {

        return new PhotoGalleryFragment();
    }

}
