package org.gemini.ringer_mode;

import android.media.AudioManager;

public final class RingerVibrateActivity extends RingerModeActivity
{
    @Override
    protected int ringerMode()
    {
        return AudioManager.RINGER_MODE_VIBRATE;
    }
}
