package com.example.weekend1hw;

import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class CameraMain extends AppCompatActivity implements View.OnClickListener {


    Button btnCameraBack;
   Button btnCapture;
    ImageView ivPicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_main);

        btnCameraBack = findViewById(R.id.btnCameraBack);// links UI button
        ivPicture = findViewById(R.id.ivPicture); // links imageview
        btnCapture = findViewById(R.id.btnCapture);


        btnCameraBack.setOnClickListener(this); // listens for Camera back click
        btnCapture.setOnClickListener(this);


    }

    public void goBackHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        ivPicture.setImageBitmap(bitmap);
    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnCameraBack:  // if camera back is clicked do this
                goBackHome();
                break;

            case R.id.btnCapture:
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent , 0);
                break;



        }
    }


}
