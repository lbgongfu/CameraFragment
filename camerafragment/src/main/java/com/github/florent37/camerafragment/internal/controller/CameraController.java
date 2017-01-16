package com.github.florent37.camerafragment.internal.controller;

import android.os.Bundle;

import java.io.File;

import com.github.florent37.camerafragment.configuration.Configuration;
import com.github.florent37.camerafragment.internal.manager.CameraManager;

/**
 * Created by memfis on 7/6/16.
 */
public interface CameraController<CameraId> {

    void onCreate(Bundle savedInstanceState);

    void onResume();

    void onPause();

    void onDestroy();

    void takePhoto();

    void startVideoRecord();

    void stopVideoRecord();

    boolean isVideoRecording();

    void switchCamera(@Configuration.CameraFace int cameraFace);

    void switchQuality();

    void setFlashMode(@Configuration.FlashMode int flashMode);

    int getNumberOfCameras();

    @Configuration.MediaAction
    int getMediaAction();

    CameraId getCurrentCameraId();

    File getOutputFile();

    CameraManager getCameraManager();

    CharSequence[] getVideoQualityOptions();

    CharSequence[] getPhotoQualityOptions();
}
