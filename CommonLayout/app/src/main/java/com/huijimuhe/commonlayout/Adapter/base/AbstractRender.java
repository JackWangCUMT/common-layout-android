package com.huijimuhe.commonlayout.adapter.base;

public abstract class AbstractRender{

    public  abstract<T extends AbstractViewHolder> T getReusableComponent();
    public  abstract void bindData(int position);

}

