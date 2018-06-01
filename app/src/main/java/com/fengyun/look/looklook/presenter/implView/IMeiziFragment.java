package com.fengyun.look.looklook.presenter.implView;

import com.fengyun.look.looklook.bean.meizi.Gank;
import com.fengyun.look.looklook.bean.meizi.Meizi;

import java.util.ArrayList;

/**
 * Created by xinghongfei on 16/8/20.
 */
public interface IMeiziFragment extends IBaseFragment {
     void updateMeiziData(ArrayList<Meizi> list);
     void updateVedioData(ArrayList<Gank> list);
}
