package States
import States.brushes._

class Brush(){

  // Size of the brush, multiplied by a constant to cary sizes, default 3
  var brushSize: Int = 3

  // Color of the brush, default black
  var brushColor: String = "Black"

  // Shape of the brush, default is a circle
  var brushShape: String = "Circle"

  var state: State = new three(this)

  def brushSize1(): Unit = {
    this.state.brushSize1()
  }

  def brushSize2(): Unit = {
    this.state.brushSize2()
  }

  def brushSize3(): Unit = {
    this.state.brushSize3()
  }

  def brushSize4(): Unit = {
    this.state.brushSize4()
  }

  def brushSize5(): Unit = {
    this.state.brushSize5()
  }

  def black(): Unit = {
    this.brushColor = "Black"
  }

  def blue(): Unit = {
    this.brushColor = "Blue"
  }
  def green(): Unit = {
    this.brushColor = "Green"
  }

  def orange(): Unit = {
    this.brushColor = "Orange"
  }

  def red(): Unit = {
    this.brushColor = "Red"
  }

  def yellow(): Unit = {
    this.brushColor = "Yellow"
  }

  def circle(): Unit = {
    this.brushShape = "Circle"
  }

  def rectangle(): Unit = {
    this.brushShape = "Rectangle"
  }

}
