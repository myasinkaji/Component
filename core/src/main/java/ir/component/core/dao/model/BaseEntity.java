package ir.component.core.dao.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Mohammad Yasin Kaji
 */
@MappedSuperclass
public abstract class BaseEntity<ID> implements Identifiable<ID>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    public BaseEntity() {
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String entityLog() {
        return toString();
    }
}
