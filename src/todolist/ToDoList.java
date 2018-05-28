
package todolist;

/**
 * This is a simple To do list program. 
 * How to use it:
 * 1. Download Zip file from GitHub
 * 2. UnZip
 * 3. Start todolist/dist/ToDolist.exe (on Windows)/ in console got to cd of download zip and write in Terminal java -jar ToDoList.jar (on ubuntu)
 * @author ShadEr laptop
 */
public class ToDoList 
{
 
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Window().setVisible(true);
            }
        });
        
    }
    
}
