package za.ac.cput;

/**
*
 * @author Caleb Ruiters - 215169751
 *
 * This
* */

public class MatchMaking {
    private String id, desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "MatchMaking{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
