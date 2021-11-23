package pl.Adam.Pizza.data.entity.pizza;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import pl.Adam.Pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //1 pizza może mieć wiele sizów
    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
