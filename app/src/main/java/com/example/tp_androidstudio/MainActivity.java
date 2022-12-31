package com.example.tp_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button google1,Creer_compte;
    TextView se_connecter;
    EditText pseudo1,Email,pass12,repass12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //affectation
        google1=findViewById(R.id.button_google1);
        Creer_compte=findViewById(R.id.button_connection1);
        se_connecter=findViewById(R.id.creation_compte1);
        pseudo1=findViewById(R.id.pseudo1);
        Email=findViewById(R.id.Email1);
        pass12=findViewById(R.id.password1);
        repass12=findViewById(R.id.conf_password);


        //creation de string
        String a1=pseudo1.getText().toString();
        String b1=Email.getText().toString();
        String c1=pass12.getText().toString();
        String d1=repass12.getText().toString();
/////////////creation compte
         boolean verifier= validationData(a1,b1,c1,d1);
         if (verifier =true){
             
         }
    }
/////////validation


    boolean validationData(String a1, String b1,String c1, String d1)
    {     //validation
        if(a1.length()==0 ){
            pseudo1.requestFocus();
            pseudo1.setError("le champ ne doit etre vide");
            return false ;
        }
        else if (a1.length()< 3)
        {
            pseudo1.requestFocus();
            pseudo1.setError("il faut au moins 3 caracteres");
        }
        else if (!a1.matches("[a-zA-Z]+"))
        {
            pseudo1.requestFocus();
            pseudo1.setError("entrer seulement les alphabets");
            return false;
        }
        //////////////////////
        else  if(b1.length()==0 ){
            Email.requestFocus();
            Email.setError("le champ ne doit etre vide");
            return false ;
        }
        else if(!b1.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
            Email.requestFocus();
            Email.setError("entrer un emil  valide");
            return false ;
        }

          else if(c1.length() <6){
            pass12.requestFocus();
            pass12.setError("la longueur du mot de passe  est invalidée ");
            return false;
        }///////////////////////
         else if (!c1.equals(d1)){
             repass12.requestFocus();
             repass12.setError("entrez le meme mot de pass");
        }
        return true ;

    }
}