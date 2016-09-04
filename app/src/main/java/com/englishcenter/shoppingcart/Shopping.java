package com.englishcenter.shoppingcart;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by jb on 03/09/2016.
 */
public class Shopping extends Application {

    private  ShoppingComponent shoppingComponent;

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        shoppingComponent = DaggerShoppingComponent.builder()
                .shoppingModule(new ShoppingModule(this))
                .build();

    }

    public ShoppingComponent getApplicationComponent() {
        return shoppingComponent;
    }

}
