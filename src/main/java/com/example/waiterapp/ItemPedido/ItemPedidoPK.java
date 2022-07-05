package com.example.waiterapp.ItemPedido;

import com.example.waiterapp.Item.Item;
import com.example.waiterapp.Pedido.Pedido;

import java.util.Objects;

public class ItemPedidoPK {
    private Item item;
    private Pedido pedido;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoPK that = (ItemPedidoPK) o;
        return Objects.equals(item, that.item) && Objects.equals(pedido, that.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, pedido);
    }
}