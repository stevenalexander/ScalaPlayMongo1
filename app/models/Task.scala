package models

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.global._

case class Task(label: String)

object Task {
  val tasks = MongoConnection()("sampleapp1")("tasks")

  def all = { tasks.map(grater[Task].asObject(_)).toList }

  def create(label: String) {
    tasks += grater[Task].asDBObject(new Task(label))
  }
  def delete(id: Long) {}
}
