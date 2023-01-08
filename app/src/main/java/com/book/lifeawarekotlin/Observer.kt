package com.book.lifeawarekotlin
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun On_Create() {
        Log.d("Mainobserver", "observer.create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun On_Pause() {
        Log.d("Mainobserver", "observer.pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun On_Resume() {
        Log.d("Mainobserver", "observer.resume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun On_Stop() {
        Log.d("Mainobserver", "observer.stop")
    }
}