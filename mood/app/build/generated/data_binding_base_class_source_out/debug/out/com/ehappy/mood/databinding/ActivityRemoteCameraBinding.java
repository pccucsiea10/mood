// Generated by view binder compiler. Do not edit!
package com.ehappy.mood.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ehappy.mood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRemoteCameraBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout flRemotecameraCamerapreview;

  @NonNull
  public final ImageView imgRemotecameraSwitchcamera;

  private ActivityRemoteCameraBinding(@NonNull FrameLayout rootView,
      @NonNull FrameLayout flRemotecameraCamerapreview,
      @NonNull ImageView imgRemotecameraSwitchcamera) {
    this.rootView = rootView;
    this.flRemotecameraCamerapreview = flRemotecameraCamerapreview;
    this.imgRemotecameraSwitchcamera = imgRemotecameraSwitchcamera;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRemoteCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRemoteCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_remote_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRemoteCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fl_remotecamera_camerapreview;
      FrameLayout flRemotecameraCamerapreview = ViewBindings.findChildViewById(rootView, id);
      if (flRemotecameraCamerapreview == null) {
        break missingId;
      }

      id = R.id.img_remotecamera_switchcamera;
      ImageView imgRemotecameraSwitchcamera = ViewBindings.findChildViewById(rootView, id);
      if (imgRemotecameraSwitchcamera == null) {
        break missingId;
      }

      return new ActivityRemoteCameraBinding((FrameLayout) rootView, flRemotecameraCamerapreview,
          imgRemotecameraSwitchcamera);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
