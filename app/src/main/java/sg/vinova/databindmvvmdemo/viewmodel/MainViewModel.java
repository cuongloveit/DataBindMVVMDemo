package sg.vinova.databindmvvmdemo.viewmodel;

import android.view.View;
import android.widget.Toast;

import sg.vinova.databindmvvmdemo.view.MainActivity;

/**
 * Created by cuong on 6/7/17.
 */

public class MainViewModel {

    private  MainActivity activity;

    public MainViewModel(MainActivity mainActivity) {

        this.activity = mainActivity;
    }

    public void onClickButton(View view){
        Toast.makeText(view.getContext(), "Click Button", Toast.LENGTH_SHORT).show();
    }

    public void onClickButton(String  message){
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }
}
