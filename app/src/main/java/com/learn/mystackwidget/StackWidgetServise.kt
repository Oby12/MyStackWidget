package com.learn.mystackwidget

import android.content.Intent
import android.widget.RemoteViewsService

class StackWidgetServise : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent): RemoteViewsFactory =
        StackRemoteViewsFactory(this.applicationContext)

}