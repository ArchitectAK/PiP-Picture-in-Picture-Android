package com.cogitator.pipsample

import android.os.Handler
import android.os.Message
import java.lang.ref.WeakReference

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 25/04/2018 (MM/DD/YYYY)
 */
class TimeoutHandler(view: VideoView) : Handler() {
    private val mMovieViewRef: WeakReference<VideoView> = WeakReference(view)

    override fun handleMessage(msg: Message) {
        when (msg.what) {
            MESSAGE_HIDE_CONTROLS -> {
                mMovieViewRef.get()?.hideControls()
            }
            else -> super.handleMessage(msg)
        }
    }

    companion object {
        internal val MESSAGE_HIDE_CONTROLS = 1
    }
}