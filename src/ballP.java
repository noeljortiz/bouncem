import javax.swing.*;
import java.awt.*;
public class ballP extends JPanel{
    int x = (int)Math.random()*(1-500)+1;
    int xspeed = 3;
    int y = (int)Math.random()*(1-500)+1;
    int yspeed = 3;
    int nums[] = new int[20];

    public ballP(){
        setBackground(new Color(0,255,0));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < 20 ; i++){






            Ball silly = new Ball(70,90,30);

            g.fillOval(silly.getX(),silly.getY(),silly.getSize(),silly.getSize());
            g.fillOval(x,y,10,10);
            x+=xspeed;
            y+=yspeed;


            if (x >= getHeight()-10 || x <= 10){
                xspeed *=-1;
            }
            if(y >= getHeight()-10|| y <= 10){
                yspeed *=-1;
            }

            try{
                Thread.sleep(34);
            }
            catch(Exception e){
                System.out.println(e);
            }



            repaint();

        }

    }
}
