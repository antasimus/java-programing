package day55_abstraction.Flag;

import java.awt.*;

public class UkrainianFlag extends Flag{
    @Override
    public void draw() {
        Grid grid = new Grid();
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/2 ){
                    grid.setColor(row, col, Color.BLUE);

                }else{
                    grid.setColor(row, col, Color.YELLOW);
                }
            }
        }
    }
}
