package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@Getter @Setter
public class Member {

    @Id @GeneratedValue // sequence
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //내장
    private Address address;

    @OneToMany(mappedBy = "member") //order table에 있는 member field에 mapping 되었다.
    private List<Order> orders = new ArrayList<>();

}
