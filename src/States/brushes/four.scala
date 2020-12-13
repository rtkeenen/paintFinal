package States.brushes
import States.{Brush, State}

class four(brush: Brush) extends State(brush) {

  override def brushSize1(): Unit = {
    brush.brushSize = 1
    brush.state = new one(brush)
  }

  override def brushSize2(): Unit = {
    brush.brushSize = 2
    brush.state = new two(brush)
  }

  override def brushSize3(): Unit = {
    brush.brushSize = 3
    brush.state = new three(brush)
  }

  override def brushSize4(): Unit = {}

  override def brushSize5(): Unit = {
    brush.brushSize = 5
    brush.state = new five(brush)
  }

}
