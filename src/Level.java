import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zander on 5/14/2015.
 */
public class Level {

    private ArrayList<Platform> platforms;
    public Level(){
        platforms = new ArrayList<Platform>();
        platforms.add(new Platform(200,700, 500, 60));
    }

    public boolean touches(Sprite s){
        for (Platform platform : platforms) {
            if(platform.touches(s)){
                return true;
            }
        }
        return false;
    }

    public void draw(Graphics2D g2){
        for (Platform platform : platforms) {
            platform.draw(g2);
        }
    }

}
