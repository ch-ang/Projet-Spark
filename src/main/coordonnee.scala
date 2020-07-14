package com.prestacop.projet

import com.google.gson._


class Coordinate(latitude: Float, longitude: Float){

  override def toString: String ={
    String.format("{"latitude": "%s", "longitude": "%s"}",
      latitude.toString, longitude.toString )
  }

}