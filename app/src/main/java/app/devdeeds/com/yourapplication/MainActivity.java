package app.devdeeds.com.yourapplication;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import app.devdeeds.com.myapplication.R;

public class MainActivity extends ActionBarActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView versionTextView = (TextView) findViewById(R.id.versionTextView);
        versionTextView.setText(getApplicationVersionName());

    }


    //Programmatically get the current version Name
    private String getApplicationVersionName() {

        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            return packageInfo.versionName;
        } catch(Exception ignored){}
        return "";
    }


}
