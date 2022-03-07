package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    private Island2 island;

    @Autowired
    public Ocean1(Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "«На море на океане есть остров " + island.toString();
    }

    public Island2 getIsland() {
        return island;
    }

    public void setIsland(Island2 island) {
        this.island = island;
    }
}
