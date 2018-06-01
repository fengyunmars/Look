package com.fengyun.look.looklook.presenter.implPresenter;


import com.fengyun.look.looklook.presenter.BasePresenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by 蔡小木 on 2016/4/29 0029.
 */
public class BasePresenterImpl implements BasePresenter {

    //订阅
    private CompositeSubscription mCompositeSubscription; // 复合 订阅

    protected void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

    @Override
    public void unsubscrible() {

        // TODO: 16/8/17 find when unsubscrible
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
    }
}
