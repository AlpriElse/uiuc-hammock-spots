package xyz.alprielse.uiuc_hammock_spots.core;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TreePair implements Serializable {
    private Integer site1_id;

    private Integer site2_id;

    public Integer getSite1_id() {
        return site1_id;
    }

    public void setSite1_id(Integer site1_id) {
        this.site1_id = site1_id;
    }

    public Integer getSite2_id() {
        return site2_id;
    }

    public void setSite2_id(Integer site2_id) {
        this.site2_id = site2_id;
    }
}
