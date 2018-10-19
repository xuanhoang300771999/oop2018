package week5_6;

import java.util.ArrayList;

public class Layer extends Diagram{
    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void deleteAllTriangle(){
        for (Shape type : shapeList) {
            if(type instanceof Triangle)
                shapeList.remove(type);
        }


        
    }

}
