package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 needle7;


    @Autowired
    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }
    public Needle7 getNeedle7() {
        return needle7;
    }

    public void setNeedle7(Needle7 needle7) {
        this.needle7 = needle7;
    }


    @Override
    public String toString() {
        return ",в утке — яйцо, " + needle7.toString();
    }
}
