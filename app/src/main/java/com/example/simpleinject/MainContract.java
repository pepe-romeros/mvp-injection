package com.example.simpleinject;

/**
 * Created by admin on 11/8/17.
 */

public interface MainContract {

    interface View {
        void showResult(String result);
    }

    interface Presenter {
        void generateResult();
    }

}
