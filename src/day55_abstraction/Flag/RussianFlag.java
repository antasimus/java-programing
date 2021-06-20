package day55_abstraction.Flag;

import java.awt.*;

public class RussianFlag extends Flag{

    @Override
    public void draw() {
        Grid grid = new Grid();

        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.WHITE);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.BLUE);
                }else{
                    grid.setColor(row, col, Color.RED);
                }
            }
        }
    }
}
