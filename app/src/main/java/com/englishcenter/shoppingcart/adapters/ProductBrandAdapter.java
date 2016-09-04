package com.englishcenter.shoppingcart.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.englishcenter.shoppingcart.fragments.ProductListFragment;
import com.englishcenter.shoppingcart.models.products.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jb on 02/09/2016.
 */
public class ProductBrandAdapter extends FragmentPagerAdapter {

    private List<String> productsListTitle;
    private List<ArrayList<Products>> productsList;

    public ProductBrandAdapter(FragmentManager fm, List<String> productsListTitle, List<ArrayList<Products>> productsList) {
        super(fm);
        this.productsListTitle = productsListTitle;
        this.productsList = productsList;
    }

    @Override
    public Fragment getItem(int position) {
        return ProductListFragment.getFragmentInstance(productsList.get(position));
    }

    @Override
    public int getCount() {
        return productsListTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return productsListTitle.get(position).toUpperCase();
    }
}
