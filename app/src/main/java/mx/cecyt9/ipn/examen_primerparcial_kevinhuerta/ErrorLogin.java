package mx.cecyt9.ipn.examen_primerparcial_kevinhuerta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ErrorLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.error_activity);
    }

    public void volver(View v){
        Intent intento = new Intent(this,MainActivity.class);
        startActivity(intento);
    }
}
