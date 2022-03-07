package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.model.Ocean1;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return  ocean.toString();
    }

    @Autowired
    public KoscheiTheDeathless(Ocean1 ocean){
        this.ocean = ocean;
    }
    public Ocean1 getOcean(){
        return this.ocean;
    }
    public void  setOcean(Ocean1 ocean){
        this.ocean = ocean;
    }
}
