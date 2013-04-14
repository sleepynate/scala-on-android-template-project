package com.detroitlabs.thinks.you.are.cool

import android.app.Activity
import android.os.Bundle
import android.util.Log

import com.detroitlabs.thinks.you.are.cool.R
import android.widget.TextView

object HelloAndroidActivity extends Activity {
  val TAG = "scala-on-android-template"
}

class HelloAndroidActivity extends Activity {
  var helloTextView: Option[TextView] = None

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    
    Log.i(HelloAndroidActivity.TAG, "onCreate")
    setContentView(R.layout.main)

    helloTextView = Option(findViewById(R.id.helloTextView).asInstanceOf[TextView])
  }

  override def onResume(): Unit = {
    super.onResume()

    val items = Array(1, 2, 3, 4, 5)
    val output = items
      .map { i => i * i }
      .mkString(", ")

    helloTextView map { _.setText(output) }
  }
}
