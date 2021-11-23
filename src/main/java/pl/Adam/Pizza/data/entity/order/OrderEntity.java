package pl.Adam.Pizza.data.entity.order;

import pl.Adam.Pizza.data.entity.ordersize.OrderSizeEntity;
import pl.Adam.Pizza.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at")
    private Date updateAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_at")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> orderSize;

}
