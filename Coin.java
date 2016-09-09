
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Image;
import java.awt.Graphics;
public class Coin
{
    //fields
    private Image heads;// 0
    private Image tails;// 1
    private int currentFace = 0;
    //constructor(s)
    public Coin(Image headsImg, Image tailsImg)
    {
        heads = headsImg;
        tails = tailsImg;
    }
    //method(s)
    public void flip()
    {
        if (currentFace == 0) {
            currentFace = 1;
        } else {
            currentFace = 0;
        }
    }
    
    public void draw(Graphics g, int x, int y)
    {
        if (currentFace == 0)
        {
            //draw heads
            g.drawImage(heads, x, y, null);
        }
        else 
        {
            //draw tails
            g.drawImage(tails, x, y, null);
        }
       
    }
}
