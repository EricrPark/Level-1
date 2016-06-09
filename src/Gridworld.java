import java.awt.Color;
import java.util.Random;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bigbug = new Bug(Color.BLUE);
		Location loc = new Location(new Random().nextInt(10),new Random().nextInt(10));
		Location loca = new Location(new Random().nextInt(10),new Random().nextInt(10));
		int row = loc.getRow();
		Location numCol = new Location(row, loc.getCol()+1);
		Location numColu = new Location(row, loc.getCol()-1);
		Location numColuu = new Location(loca.getRow(), loca.getCol()+1);
		Location numColuuu = new Location(loca.getRow(), loca.getCol()-1);
		world.add(loc, bug);
		world.add(loca, bigbug);
		bigbug.turn();
		bigbug.turn();
		Flower flower = new Flower();
		Flower flowerr = new Flower();
		Flower flowerrrr = new Flower();
		Flower flowerrr = new Flower();
		world.add(numCol, flower);
		world.add(numColu, flowerr);
		world.add(numColuu, flowerrr);
		world.add(numColuuu, flowerrrr);
		Location locA = new Location(1, 1);
		Location locB = new Location(2, 1);
		Location locC = new Location(3, 1);
		Location locD = new Location(4, 1);
		Location locE = new Location(5, 1);
		Location locF = new Location(6, 1);
		Location locG = new Location(7, 1);
		Location locH = new Location(8, 1);
		}

}
