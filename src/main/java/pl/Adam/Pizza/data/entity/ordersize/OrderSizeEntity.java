package pl.Adam.Pizza.data.entity.ordersize;

import pl.Adam.Pizza.data.entity.order.OrderEntity;
import pl.Adam.Pizza.data.entity.pizza.PizzaEntity;
import pl.Adam.Pizza.data.entity.size.SizeEntity;

import javax.persistence.*;

@Entity
@Table(name = "orders_sizes")

public class OrderSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "orders_id")
    private Integer ordersId;

    @Column(name = "sizes_id")
    private Integer sizesId;

    @Column(name = "size_count")
    private Integer sizeCount;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private SizeEntity size;
}
