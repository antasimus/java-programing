package day55_abstraction.Flag;

import java.awt.*;

public class FrenchFlag extends Flag{
    @Override
    public void draw() {
        Grid grid = new Grid();
        for(int row=0;row<grid.getHt();row++){
            for(int col=0;col<grid.getWd();col++){
                if(col<grid.getWd()/3 ){
                    grid.setColor(row, col, Color.BLUE);
                }else if(col<grid.getWd()/3*2){
                    grid.setColor(row, col, Color.WHITE);
                }else{
                    grid.setColor(row, col, Color.RED);
                }

            }

        }
    }
}
