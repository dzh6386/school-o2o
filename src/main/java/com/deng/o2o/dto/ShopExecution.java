package com.deng.o2o.dto;

import com.deng.o2o.entity.Shop;
import com.deng.o2o.enums.ShopStateEnum;

import java.util.List;

public class ShopExecution {

    //状态
    private int state;
    //状态描述
    private String stateInfo;
    //店铺数量
    private int count;
    //进行增删改店铺时候用到
    private Shop shop;
    //查询店铺的时候用到
    private List<Shop> shopList;

    public ShopExecution(){

    }

    public ShopExecution(ShopStateEnum stateEnum){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();

    }
    public ShopExecution(ShopStateEnum stateEnum , Shop shop){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }
    public ShopExecution(ShopStateEnum stateEnum , Shop shop, List<Shop> shopList){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
        this.shopList = shopList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }
}
