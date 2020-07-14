package com.prestacop.projet

import com.google.gson._

object Record{

  case class Coordinate(var latitude : Double, var longitude : Double)
  case class Alert(var code: Int, var label: String, var imgByteString: String)
  case class Record(var id: Int, var date: Long,var  coordinate: Coordinate,var battery: Int,var alert: Alert)

  def parseFromJson(lines:Iterator[String]): Iterator[Record] ={
    val gson = new GsonBuilder().create()
    lines.map(line => gson.fromJson(line, classOf[Record]))
  }

  def objToString(record: Record): String ={
    String.format("{"id": %s, "date": %s," +
      " "coordinate": {"latitude": %s, "longitude": %s}," +
      " "battery": %s," +
      " "alert": {"code": %s, "label": "%s", "imgByteString": "%s"}}",
      record.id.toString,
      record.date.toString,
      record.coordinate.latitude.toString,
      record.coordinate.longitude.toString,
      record.battery.toString,
      record.alert.code.toString,
      record.alert.label,
      record.alert.imgByteString)
  }

  def objToHBString(record: Record): String ={
    String.format("{"id": %s, "date": %s," +
      " "coordinate": {"latitude": %s, "longitude": %s}," +
      " "battery": %s}",
      record.id.toString,
      record.date.toString,
      record.coordinate.latitude.toString,
      record.coordinate.longitude.toString,
      record.battery.toString)
  }

}