package xyz.gonzapico.kc_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import xyz.gonzapico.kc_dagger.getData.DataPresenter;
import xyz.gonzapico.kc_dagger.getData.DataView;

public class HomeActivity extends AppCompatActivity implements DataView {

  private DataPresenter mDataPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }
}
