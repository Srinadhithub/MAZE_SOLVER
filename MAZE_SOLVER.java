package maze_solver;
/**
 *
 * @author SRINADH
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JFrame;
import java.util.ArrayList;

import java.awt.Graphics;
import java.util.ArrayList;


public class MAZE_SOLVER   extends JFrame{

    /**
     * @param args the command line arguments*/
	private int pathindex;
	private int Maze[][]=
		    {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
            {1, 0, 1, 0, 1, 1, 0, 1, 0, 1 },
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
            {1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            {1, 0, 1, 1, 1, 1, 0, 1, 9, 1 },
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
        
	public List<Integer> path= new ArrayList<>();
	MAZE_SOLVER(){
		setSize(1200,1200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("MAZE SOLVER");
		DFS.searchPath(Maze,1,1,path);
	}
	@Override
	public void paint(Graphics g) {
		g.translate(300,100); // translate image to the required point
		for(int i=0;i<Maze.length;i++) {
			for(int j=0;j<Maze[i].length;j++) {
				Color color;
				if(Maze[i][j]==1) color=Color.black;
				else if(Maze[i][j]==9) color=Color.RED;
				else color=Color.yellow;
				g.setColor(color);
				g.fillRect(50*i,50*j, 50, 50);
				g.setColor(Color.blue);
				g.drawRect(50*i, 50*j, 50, 50);
			}
		}
		for(int i=2;i<path.size();i+=2) {
			g.setColor(Color.GREEN);
			int x=path.get(i);
			int y=path.get(i+1);
			g.fillRect(x*50, 50*y, 45, 45);
		}
		
	}
		
public static void main(String[] args) {
	MAZE_SOLVER view= new MAZE_SOLVER();
	view.setVisible(true);
	
}
}
