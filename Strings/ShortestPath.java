// Give a route contaning 4 directions (E, W, N, S)
// find the shortest distance{displacement} to reach the destination
// given string = {"WNEENESENNN"}
public class ShortestPath {
    
    
    public static float getShortestPath(String path) {
        int x = 0; int y = 0;
        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //East
            if (dir == 'E') {
                x++;
            }
            //West
            else if (dir == 'W') {
                x--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //South
            else {
                y--;
            }
        }
        //Distance formulae.
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}