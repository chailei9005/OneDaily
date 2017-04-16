package tmnt.example.onedaily.ui.gank.presenter;


import tmnt.example.onedaily.ui.gank.model.Model;
import tmnt.example.onedaily.ui.gank.view.View;

/**
 * Created by tmnt on 2017/4/12.
 */

public abstract class BasePresenter<T> implements Presenter {

    protected Model<T> mModel;
    protected View mView;

    public BasePresenter(Model<T> model, View view) {
        mModel = model;
        mView = view;
    }


}