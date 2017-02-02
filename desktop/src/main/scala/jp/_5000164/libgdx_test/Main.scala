package jp._5000164.libgdx_test

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

object Main extends App {
  val cfg = new LwjglApplicationConfiguration
  cfg.title = "SampleGame"
  cfg.height = 480
  cfg.width = 800
  cfg.forceExit = false
  new LwjglApplication(new Samplegame, cfg)
}
