package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Island2 {

    private Wood3 wood;

    @Autowired
    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на том острове дуб стоит " + wood.toString();
    }

    public Wood3 getWood() {
        return wood;
    }

    public void setWood(Wood3 wood) {
        this.wood = wood;
    }
}
