package mx.cecyt9.ipn.examen_primerparcial_kevinhuerta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Usuario = "Kevin";
    String Password = "pass123";
    String UsuarioObtenido = "";
    String PasswordObtenida = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validar(View v){
        EditText tv2 = findViewById(R.id.password);
        EditText tv = findViewById(R.id.usuario);
        UsuarioObtenido = tv.getText().toString();
        PasswordObtenida = tv2.getText().toString();

        if(Usuario.equals(UsuarioObtenido)&&Password.equals(PasswordObtenida)){
            //Mandar llamar actividad correcta
            Toast toast1 = Toast.makeText(getApplicationContext(),"Usuario Correcto", Toast.LENGTH_LONG);
            toast1.show();
            Intent intent = new Intent(this,Reserva.class);
            startActivity(intent);
        }
        else{
            //Mandar llamar actividad error
            Toast toast2 = Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_LONG);
            toast2.show();
            Intent intent = new Intent(this,ErrorLogin.class);
            startActivity(intent);
        }
    }
}
