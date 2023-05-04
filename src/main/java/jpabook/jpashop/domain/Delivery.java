package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

public class Delivery extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;



    @Enumerated(EnumType.STRING)   // ORDINAL 기본 값 0, 1 숫자로 값이 들어감
    private DeliveryStatus status;  // READY, COMP
}
