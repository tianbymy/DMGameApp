package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.entity.NewsListBean;

/**
 * Author：xiaohaibin
 * Time：2017/9/18
 * Emil：xhb_199409@163.com
 * Github：https://github.com/xiaohaibin/
 * Describe：
 */
public interface GetNewsListContract {

    interface getNewsListModel extends IModel {
        void getNewsList(String appId, int page);
    }

    interface getNewListView extends IView {

        void getNewListSuccess(NewsListBean listEntity);

        void getNewListFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
