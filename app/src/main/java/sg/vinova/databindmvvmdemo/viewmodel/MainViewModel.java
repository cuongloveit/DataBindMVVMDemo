package sg.vinova.databindmvvmdemo.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import sg.vinova.databindmvvmdemo.model.User;

/**
 * Created by cuong on 6/7/17.
 */

public class MainViewModel {

    private User user;

    private Context activity;
    public final ObservableField<String> newFirstName = new ObservableField<>();
    public final ObservableField<String> newLastName = new ObservableField<>();

    public MainViewModel(Context context) {

        this.activity = context;
    }

    public User createDefaultUser() {
        user = new User("Ben", "Truong");
        return user;
    }

    public void onClickButton(View view) {
        Toast.makeText(view.getContext(), "Click Button", Toast.LENGTH_SHORT).show();
    }

    public void onClickButton(String message) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }

    public void updateUser() {
        user.setFirstName(newFirstName.get());
        user.setLastName(newLastName.get());
    }

    public TextWatcher getFirstNameWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                newFirstName.set(s.toString());
            }
        };
    }

    public TextWatcher getLastNameWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                newLastName.set(s.toString());
            }
        };
    }


}
