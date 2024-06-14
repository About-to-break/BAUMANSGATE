package world;
import java.util.Random;
public class WorldMap {
    private final int sizeX;
    private final int sizeY;
    private TerrainTypeGeneric [][] map;

    WorldMap(int sizeX, int sizeY, TerrainTypeGeneric[][] map) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.map = map;
    }

    public TerrainTypeGeneric getTile(int x,int y) {
        return map[x+1][y+1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                sb.append(map[i][j].getDesignation()).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

class WorldMapGenerator {
    private static final double CHANCE_PLAINS = 0.7;
    private static final double CHANCE_SWAMP = 0.15;
    private static final double CHANCE_HILLS = 0.1;

    public WorldMap generateRandomMap(int sizeX,int sizeY) {
        TerrainTypeGeneric[][] map = new TerrainTypeGeneric[sizeX][sizeY];
        Random random = new Random();

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                double randomValue = random.nextDouble();

                if (randomValue < CHANCE_PLAINS) {
                    map[i][j] = new Plains();
                } else if (randomValue < CHANCE_PLAINS + CHANCE_SWAMP) {
                    map[i][j] = new Swamp();
                } else if (randomValue < CHANCE_PLAINS + CHANCE_SWAMP + CHANCE_HILLS) {
                    map[i][j] = new Hills();
                } else {
                    map[i][j] = new Forest();
                }
            }
        }

        return new WorldMap(sizeX, sizeY, map);
    }
}
