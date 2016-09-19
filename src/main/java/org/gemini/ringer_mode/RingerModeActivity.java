package org.gemini.ringer_mode;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Process;

public abstract class RingerModeActivity extends Activity
{
    @Override
    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AudioManager audioManager =
            (AudioManager) getSystemService(AUDIO_SERVICE);
        audioManager.setRingerMode(ringerMode());
        finish();
    }

    @Override
    protected final void onDestroy()
    {
        super.onDestroy();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    protected abstract int ringerMode();
}
