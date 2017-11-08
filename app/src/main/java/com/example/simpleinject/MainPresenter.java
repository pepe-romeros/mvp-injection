package com.example.simpleinject;

/**
 * Created by admin on 11/8/17.
 */

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mainView;
    MainModel mainModel;

    public MainPresenter(MainContract.View mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    @Override
    public void generateResult() {
        mainView.showResult(mainModel.generateResult());
    }

}
