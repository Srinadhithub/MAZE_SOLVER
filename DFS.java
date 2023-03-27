package maze_solver;
 import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
/**
 *
 * @author SRINADH
 */
public class DFS {
 
	public static boolean searchPath(int [][] maze,int x,int y,List<Integer> path) {
		// TODO Auto-generated method stub
		if(x<0 || y<0 || x>=maze.length || y>=maze.length) return false;
		if(maze[x][y]==9) {
			path.add(x);
			path.add(y);		
			return true;
		}
		else if(maze[x][y]==0) {
			maze[x][y]=2;
			if(searchPath(maze,x-1,y+0,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			else if(searchPath(maze,x,y-1,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			else if(searchPath(maze,x,y+1,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			else if(searchPath(maze,x+1,y+0,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
		}
return false;
	}
}
