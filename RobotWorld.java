import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Jose Luis Tovar 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
 
        prepareScenario();
       
    }
    public void prepareScenario()
    {
        addObject(new Robot(),48,50);
        int [][] paredes={{52,147},{159,147},{266,147},{587,147},{694,147},{801,147}};
        for (int i=0;i<=5;i++)
        {
        addObject(new Wall(),paredes[i][0],paredes[i][1]);
        }
        addObject(new Block(),427,147);
        addObject(new Home(),751,552);
        addObject(new Scorepanel(),71,554);
        int [][] array={{720,46},{433,38},{183,302},{682,321},{417,537}};
        for (int i=0;i<=4;i++){
            addObject(new Pizza(), array[i][0], array[i][1]);
        }
    }
}
