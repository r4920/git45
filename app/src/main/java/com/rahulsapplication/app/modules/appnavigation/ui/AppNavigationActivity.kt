package com.rahulsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityAppNavigationBinding
import com.rahulsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.ui.IncomingCallInTheMiddleOfAnotherCallActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linear06IncomingCallInTheMiddleOfAnotherCall.setOnClickListener {
      val destIntent = IncomingCallInTheMiddleOfAnotherCallActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
