package com.prestacop.projet

import com.google.gson._

class Alert(message: Int, label: String, imageString: String){

  override def toString: String ={
    String.format("{"code": %s, "label": "%s", "imageString": "%s"}",
      message.toString, label, imageString)
  }

}