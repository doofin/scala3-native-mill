import mill._, scalalib._, scalanativelib._, scalanativelib.api._

object core extends ScalaNativeModule{
  override def scalaNativeVersion = "0.4.9"
  override def scalaVersion = "3.2.1"
  def releaseMode = ReleaseMode.ReleaseFast
  def nativeLTO = LTO.Thin
}
