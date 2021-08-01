package com.webrtc;

import io.wazo.callkeep.RNCallKeepModule;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "webRTC";
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
      super.onRequestPermissionsResult(requestCode, permissions, grantResults);
      switch (requestCode) {
          case RNCallKeepModule.REQUEST_READ_PHONE_STATE:
              RNCallKeepModule.onRequestPermissionsResult(requestCode, permissions, grantResults);
              break;
      }
  }
}
