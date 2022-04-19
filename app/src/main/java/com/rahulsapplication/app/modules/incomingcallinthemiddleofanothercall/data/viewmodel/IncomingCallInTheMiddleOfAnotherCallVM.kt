package com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.incomingcallinthemiddleofanothercall.`data`.model.IncomingCallInTheMiddleOfAnotherCallModel
import org.koin.core.KoinComponent

public class IncomingCallInTheMiddleOfAnotherCallVM : ViewModel(), KoinComponent {
  public val incomingCallInTheMiddleOfAnotherCallModel:
      MutableLiveData<IncomingCallInTheMiddleOfAnotherCallModel> =
      MutableLiveData(IncomingCallInTheMiddleOfAnotherCallModel())

  public var navArguments: Bundle? = null
}
