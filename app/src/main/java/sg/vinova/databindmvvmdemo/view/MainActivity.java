package sg.vinova.databindmvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sg.vinova.databindmvvmdemo.R;
import sg.vinova.databindmvvmdemo.databinding.MainActivityBinding;
import sg.vinova.databindmvvmdemo.model.User;
import sg.vinova.databindmvvmdemo.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {



    /**
     * In onCreate of the Activity we lookup & retain references to view components
     * and instantiate the model.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Ben","Truong");
        MainViewModel viewModel = new MainViewModel(this);
        binding.setViewModel(viewModel);
        binding.setUser(user);
    }


}
