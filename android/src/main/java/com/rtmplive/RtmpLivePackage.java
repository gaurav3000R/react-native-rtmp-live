package com.rtmplive;

import android.view.ViewManager;

import androidx.annotation.NonNull;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RtmpLivePackage implements ReactPackage {
  @NonNull
  @Override
  public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new RtmpLiveModule(reactContext));
    return modules;
  }

  @NonNull
  @Override
  public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
