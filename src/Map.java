import java.awt.Point;

public class Map {
	private Object [][] map;
	private int map_size;
	
	public Map(int map_size) {
		this.map_size = map_size;
		map = createNewMap();
		}
	
	private Object[][] createNewMap() {
		map = new Object[map_size][map_size];
		for(int a = 0, a<map_size; a++) {
			for(int b = 0; b<map_size; b++) {
				map[b][a] = Object.random();
			}
		}
		map[getRandomNumber(0,this.map_size 1)][getRandomNumber(0,this.map_size 1)] = Objet.Objectif;
	}
}
