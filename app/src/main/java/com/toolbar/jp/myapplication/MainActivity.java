package com.toolbar.jp.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ActionMode;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener,ActionMode.Callback {

    TextView mTextView;
    ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        mTextView = (TextView) findViewById(R.id.hogehoge);
        mTextView.setOnLongClickListener(this);
//        mTextView.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
//
//            @Override
//            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//                // TODO Auto-generated method stub
//                return false;
//            }
//
//            @Override
//            public void onDestroyActionMode(ActionMode mode) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//                // TODO Auto-generated method stub
//                return true;
//            }
//
//            @Override
//            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//                Log.d("javalog","guuuu"+item.getItemId());
//                // TODO Auto-generated method stub
//                return false;
//            }
//        });
    }

        @Override
    public boolean onLongClick(View view) {

        // if actionmode is null "not started"
        if (mActionMode != null) {
            return false;
        }

        // Start the CAB
        mActionMode = this.startActionMode(this);
        view.setSelected(true);
        return true;
    }

//    // 4. Called when the action mode is created; startActionMode() was called
//    @Override
//    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//        Log.d("javalog", "acti2on1");
////        MenuInflater inflater = mode.getMenuInflater();
////        inflater.inflate(R.menu.webview_copy, menu);
//        return true;
//    }
//
//    // 5. Called when the user click share item
//    @Override
//    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//        Log.d("javalog","action2 "+item.getItemId());
//        int id = item.getItemId();
//        switch (id) {
//            case 2131493105:
//                Log.d("javalog","allselect");
//                return true;
//        }
//        return false;
//    }
//
//    // 6. Called each time the action mode is shown. Always called after onCreateActionMode, but
//    // may be called multiple times if the mode is invalidated.
//    @Override
//    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//        Log.d("javalog", "action3");
//        return false; // Return false if nothing is done
//    }
//
//    // 7. Called when the user exits the action mode
//    @Override
//    public void onDestroyActionMode(ActionMode mode) {
//        Log.d("javalog", "action4");
//        mActionMode = null;
//    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        // TODO Auto-generated method stub
        Log.d("javalog","guuuu4");
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {
        // TODO Auto-generated method stub
        Log.d("javalog","guuuu3");
    }

    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        // TODO Auto-generated method stub
        Log.d("javalog","guuuu2");
        return true;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        Log.d("javalog","guuuu"+item.getItemId());
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
