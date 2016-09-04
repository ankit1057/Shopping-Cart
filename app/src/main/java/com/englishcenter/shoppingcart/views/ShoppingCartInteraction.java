package com.englishcenter.shoppingcart.views;

import com.englishcenter.shoppingcart.models.cart.Cart;

import java.util.List;

/**
 * Created by jb on 03/09/2016.
 */
public interface ShoppingCartInteraction {

    interface AddProduct {

        void showOptionDialog(Cart item);

        void showAddCartSucess();
    }

    interface ShoppingCart {

        void showCartList(List<Cart> cartList);

        void showNoCartItem();

        void showCartSummary(float totalAmount, int totalItems);
    }

    interface RemoveItemCart {

        void removeItem(int cartId);

    }
}
