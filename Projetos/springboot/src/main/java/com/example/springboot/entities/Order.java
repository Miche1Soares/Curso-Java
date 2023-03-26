package com.example.springboot.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.example.springboot.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity
// troca o nome da tabela
@Table(name="tb_order")
public class Order implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "yyyy-MM-dd'T'HH:mm'Z'", timezone = "GMT")
    // instant -= pegar a data atual (é melhor do q o Date)
    private Instant moment;


    private Integer orderStatus;


    // impede o loop das relaçoes das tabelas (pois uma chama a outra sem parar)
    //@JsonIgnore
    // muitos pedidos para 1 usuário
    @ManyToOne
    // nome da chave estrangeira no database
    @JoinColumn(name="client_id")
    private User client;



    //                    dentro do orderitem há o id e, a partir dele, o pedido
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    public Order(){}

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client)
    {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus != null)
        {
            this.orderStatus = orderStatus.getCode();
        }
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }


    public Set<OrderItem> getItems() {
        return items;
    }



    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
