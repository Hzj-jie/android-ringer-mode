package org.gemini.ringer_mode;

import android.media.AudioManager;

public final class RingerNormalActivity extends RingerModeActivity
{
    @Override
    protected int ringerMode()
    {
        return AudioManager.RINGER_MODE_NORMAL;
    }
}
