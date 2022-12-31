package com.example.tp_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 EditText  name2,pass2;
 Button  connection2,google2;
 TextView Oubli_pass2, Creer_compte2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //affectation

        name2=findViewById(R.id.pseudo2);
        pass2=findViewById(R.id.password2);
        connection2=findViewById(R.id.button_connection2);
        google2=findViewById(R.id.button_google2);
        Oubli_pass2=findViewById(R.id.mot_de_pass_oublie2);
        Creer_compte2 =findViewById(R.id.creation_compte2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    // champs en string
    String name21=name2.getText().toString();
    String pass21=pass2.getText().toString();





    //validation des champs
    boolean validationData(String ename21,String pass21)
    {     //validation
        if(name21.length()==0 ){
            name2.requestFocus();
            name2.setError("le champ ne doit etre vide");
            return false ;
        }else if (!name21.matches("[a-zA-Z]+"))
        {
            name2.requestFocus();
            name2.setError("entrer seulement les alphabets");
            return false;
        }
        //////////////////////
        if(pass21.length() <6){
            pass2.setError("la longueur du mot de passe  est invalidée ");
            return false;
        }///////////////////////



        return true ;
    }
}