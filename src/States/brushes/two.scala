package States.brushes
import States.{Brush, State}

class two(brush: Brush) extends State(brush) {

  override def brushSize1(): Unit = {
    brush.brushSize = 1
    brush.state = new one(brush)
  }

  override def brushSize2(): Unit = {}

  override def brushSize3(): Unit = {
    brush.brushSize = 3
    brush.state = new three(brush)
  }

  override def brushSize4(): Unit = {
    brush.brushSize = 4
    brush.state = new four(brush)
  }

  override def brushSize5(): Unit = {
    brush.brushSize = 5
    brush.state = new five(brush)
  }

}
