import States.Brush
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.scene.input._


object tutorialApp extends JFXApp{

  val myBrush = new Brush
  var brushSize: Int = myBrush.brushSize
  var brushColor: String = myBrush.brushColor
  var brushShape: String = myBrush.brushShape

  def getBrushSize: Int = {
    myBrush.brushSize
  }

  def getBrushColor: String = {
    myBrush.brushColor
  }

  def getBrushShape: String = {
    myBrush.brushShape
  }

    stage = new JFXApp.PrimaryStage{
      title = "Paint"
      scene = new Scene(1200, 900){

        /**
         * Size Button
         * Change size of the brush
         */
        val labelOne = new Label("Brush size One")
        labelOne.layoutX = 20
        labelOne.layoutY = 20

        val buttonOne = new RadioButton("1")
        buttonOne.layoutX = 20
        buttonOne.layoutY = 50

        val labelTwo = new Label("Brush size Two")
        labelTwo.layoutX = 220
        labelTwo.layoutY = 20

        val buttonTwo = new RadioButton("2")
        buttonTwo.layoutX = 220
        buttonTwo.layoutY = 50

        val labelThree = new Label("Brush size Three")
        labelThree.layoutX = 420
        labelThree.layoutY = 20

        val buttonThree = new RadioButton("3")
        buttonThree.layoutX = 420
        buttonThree.layoutY = 50

        val labelFour = new Label("Brush size Four")
        labelFour.layoutX = 620
        labelFour.layoutY = 20

        val buttonFour = new RadioButton("4")
        buttonFour.layoutX = 620
        buttonFour.layoutY = 50

        val labelFive = new Label("Brush size Five")
        labelFive.layoutX = 820
        labelFive.layoutY = 20

        val buttonFive = new RadioButton("5")
        buttonFive.layoutX = 820
        buttonFive.layoutY = 50

        /**
         * Color Buttons
         * change color of the brush
         */
        val colorOne = new Label("Brush Color Black")
        colorOne.layoutX = 20
        colorOne.layoutY = 90

        val colorButtonOne = new RadioButton("Black")
        colorButtonOne.layoutX = 20
        colorButtonOne.layoutY = 120

        val colorTwo = new Label("Brush color Blue")
        colorTwo.layoutX = 220
        colorTwo.layoutY = 90

        val colorButtonTwo = new RadioButton("Blue")
        colorButtonTwo.layoutX = 220
        colorButtonTwo.layoutY = 120

        val colorThree = new Label("Brush color Green")
        colorThree.layoutX = 420
        colorThree.layoutY = 90

        val colorButtonThree = new RadioButton("Green")
        colorButtonThree.layoutX = 420
        colorButtonThree.layoutY = 120

        val colorFour = new Label("Brush color Orange")
        colorFour.layoutX = 620
        colorFour.layoutY = 90

        val colorButtonFour = new RadioButton("Orange")
        colorButtonFour.layoutX = 620
        colorButtonFour.layoutY = 120

        val colorFive = new Label("Brush color Red")
        colorFive.layoutX = 820
        colorFive.layoutY = 90

        val colorButtonFive = new RadioButton("Red")
        colorButtonFive.layoutX = 820
        colorButtonFive.layoutY = 120

        val colorSix = new Label("Brush color Yellow")
        colorSix.layoutX = 820
        colorSix.layoutY = 90

        val colorButtonSix = new RadioButton("Yellow")
        colorButtonSix.layoutX = 820
        colorButtonSix.layoutY = 120

        /**
         * Shape Buttons
         * controls shape of brush
         */
        val shapeOne = new Label("Brush shape Circle")
        shapeOne.layoutX = 1020
        shapeOne.layoutY = 20

        val shapeButtonOne = new RadioButton("Circle")
        shapeButtonOne.layoutX = 1020
        shapeButtonOne.layoutY = 50

        val shapeTwo = new Label("Brush shape Rectangle")
        shapeTwo.layoutX = 1020
        shapeTwo.layoutY = 90

        val shapeButtonTwo = new RadioButton("Rectangle")
        shapeButtonTwo.layoutX = 1020
        shapeButtonTwo.layoutY = 120


        val toggle = new ToggleGroup
        toggle.toggles = List(buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive)

        val toggleColor = new ToggleGroup
        toggleColor.toggles = List(colorButtonOne, colorButtonTwo, colorButtonThree, colorButtonFour, colorButtonFive)

        val toggleShape = new ToggleGroup
        toggleShape.toggles = List(shapeButtonOne, shapeButtonTwo)

        content = List(
          labelOne, labelTwo, labelThree, labelFour, labelFive,
          buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
          colorOne, colorTwo, colorThree, colorFour, colorFive,
          colorButtonOne, colorButtonTwo, colorButtonThree, colorButtonFour, colorButtonFive,
          shapeOne, shapeTwo,
          shapeButtonOne, shapeButtonTwo
        )

        /**
         * Size Button actions
         */
        buttonOne.onAction = (e: ActionEvent) => {
          myBrush.brushSize1()
        }

        buttonTwo.onAction = (e: ActionEvent) => {
          myBrush.brushSize2()
        }

        buttonThree.onAction = (e: ActionEvent) => {
          myBrush.brushSize3()
        }

        buttonFour.onAction = (e: ActionEvent) => {
          myBrush.brushSize4()
        }

        buttonFive.onAction = (e: ActionEvent) => {
          myBrush.brushSize5()
        }

        /**
         * Color button actions
         */
        colorButtonOne.onAction = (e: ActionEvent) => {
          myBrush.black()
        }

        colorButtonTwo.onAction = (e: ActionEvent) => {
          myBrush.blue()
        }

        colorButtonThree.onAction = (e: ActionEvent) => {
          myBrush.green()
        }

        colorButtonFour.onAction = (e: ActionEvent) => {
          myBrush.orange()
        }

        colorButtonFive.onAction = (e: ActionEvent) => {
          myBrush.red()
        }

        colorButtonSix.onAction = (e: ActionEvent) => {
          myBrush.yellow()
        }

        /**
         * Shape button controls
         */
        shapeButtonOne.onAction = (e: ActionEvent) => {
          myBrush.circle()
        }

        shapeButtonTwo.onAction = (e: ActionEvent) => {
          myBrush.rectangle()
        }

        onMouseClicked = (e: MouseEvent) => {
          if (getBrushShape == "Circle") {
            val c = Circle(e.x - 10, e.y - 10, 5 * getBrushSize, 5 * getBrushSize)
            c.fill = getBrushColor
            content += c
          } else {
            val r = Rectangle(e.x -10, e.y - 10, 5 * getBrushSize, 5 * getBrushSize)
            r.fill = getBrushColor
            content += r
          }
        }
        onMouseDragged = (e: MouseEvent) => {
          if (getBrushShape == "Circle") {
            val c = Circle(e.x - 10, e.y - 10, 5 * getBrushSize, 5 * getBrushSize)
            c.fill = getBrushColor
            content += c
          } else {
            val r = Rectangle(e.x -10, e.y - 10, 5 * getBrushSize, 5 * getBrushSize)
            r.fill = getBrushColor
            content += r
          }
        }
      }
    }
}

