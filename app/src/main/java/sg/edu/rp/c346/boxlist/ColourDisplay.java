package sg.edu.rp.c346.boxlist;

/**
 * Created by 17010318 on 24/7/2018.
 */

public class ColourDisplay {
    private String colour;

    public ColourDisplay(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "ColourDisplay{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
