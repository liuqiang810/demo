package com.rxdemo.liuqiang.rxjavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.rxdemo.liuqiang.rxjavademo.utils.LogUtil;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "rxDemo";
    private Button btn_send;
    private TextView tv_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_send = (Button) findViewById(R.id.btn_send);
        tv_log = (TextView) findViewById(R.id.tv_log);

        btn_send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send:
                print("Hello rxJava!");
                break;
        }
    }

    private void print(String content){
        Observable<String> observable = Observable.just(content);
        Observable<String> observable1 = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello rxJava!");
                subscriber.onCompleted();
            }
        });
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                LogUtil.v("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.v("onError" + e.getMessage());
            }

            @Override
            public void onNext(String s) {
                LogUtil.v("onNext");
                tv_log.setText(s);
            }
        };
        observable.subscribe(subscriber);
    }
}
