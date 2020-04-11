package org.bubenheimer.dbinspectorbugs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout);
    }

    public void startFGSvc(View button) {
        startForegroundService(new Intent(this, FGSvc.class));
    }
}
