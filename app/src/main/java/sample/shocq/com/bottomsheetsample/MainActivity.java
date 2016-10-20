package sample.shocq.com.bottomsheetsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sample1)
    public void scrollActivity() {
        startActivity(new Intent(this, ScrollingActivity.class));
    }

    @OnClick(R.id.sample2)
    public void tutsPlus() {
        startActivity(new Intent(this, TutsPlusBottomSheetSample.class));
    }
}
