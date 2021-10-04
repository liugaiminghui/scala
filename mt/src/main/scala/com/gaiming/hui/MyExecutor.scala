package com.gaiming.hui

import scala.collection.mutable.ListBuffer

//Create a Executor-like type, which holds a thread pool and can run the function you passed.
class MyExecutor {
  private val PoolSize = 3
  private val pool: ListBuffer[Worker] = new ListBuffer[Worker]


  def exec(task: () => Unit) = {
    println("exec!!!")
    //try to find an idle worker
    val idle = pool.find(!_.onBusy)
    if (idle.isDefined) {
      println("Has idle worker" + idle.get)

      idle.get.toDo(task)


    }

    //if there isn't idle worker
    //if have space
    else if (pool.isEmpty || pool.size < PoolSize) {
      val w = new Worker
      pool.append(w)
      w.toDo(task)
    }
    //don't have any space, have to wait
    else {
      //block
      println("xxxx")
      while (!pool.exists(!_.onBusy)) {}
      pool.find(!_.onBusy).get.toDo(task)
    }
  }
}


class Worker {
  var onBusy = false
  @volatile var jobs = new ListBuffer[() => Unit]

  private val t = new Thread(new Runnable {
    override def run(): Unit = {
      while (true) {
        //println( this + "检查是否有工作")
        if (!jobs.isEmpty) {
          onBusy = true
          println("The worker start to work! The jobs has " + jobs.size)
          val job = jobs.head
          job()
          jobs = jobs.tail
          onBusy = false
        }
      }
    }
  })
  t.setPriority(Thread.MAX_PRIORITY)
  t.start
  println("Work was built！")

  def toDo(task: () => Unit) = {
    println("task was appended to " + this)
    jobs.append(task)
  }

  def close = t.interrupt
}


object UnitTest {
  def main(xxx: Array[String]) = {

    val e = new MyExecutor

    e.exec(() => {
      println("去你的去你的去你的1")
      Thread.sleep(5000)
    })
    e.exec(() => {
      println("去你的去你的去你的2")
      Thread.sleep(1000)
    })
    e.exec(() => {
      println("去你的去你的去你的3")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的4")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的5")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的6")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的7")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的8")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的9")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的10")
      Thread.sleep(1000)

    })
    e.exec(() => {
      println("去你的去你的去你的5")
      Thread.sleep(1000)

    })

    println("主线程去求了")
  }
}