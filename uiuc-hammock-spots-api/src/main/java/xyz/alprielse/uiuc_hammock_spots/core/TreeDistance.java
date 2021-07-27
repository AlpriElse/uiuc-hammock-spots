package xyz.alprielse.uiuc_hammock_spots.core;

import javax.persistence.*;

@Entity(name = "tree_distances")
@IdClass(TreePair.class)
@NamedQueries(
        @NamedQuery(
                name = "xyz.alprielse.uiuc_hammock_spots.core.TreeDistance.find",
                query = "FROM tree_distances d WHERE d.distance >= :minimum_distance AND d.distance <= :maximum_distance"
        )
)
public class TreeDistance {
    @Id
    private Integer site1_id;

    @Id
    private Integer site2_id;

    private Double distance;

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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
