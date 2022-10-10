package com.ramirez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private  Button botoncero, botonuno, botondos, botontres, botoncuatro, botoncinco, botonseis, botonsiete,
            botonocho,botonnueve, Btn_punto, Btn_igual, Btn_mas, Btn_menos, Btn_multi,
            Btn_DIVI, Btn_borrar;

    private String operaion, input;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        botoncero = findViewById(R.id.botoncero);
        botonuno = findViewById(R.id.botonuno);
        botondos = findViewById(R.id.botondos);
        botontres = findViewById(R.id.botontres);
        botoncuatro = findViewById(R.id.botoncuatro);
        botoncinco = findViewById(R.id.botoncinco);
        botonseis = findViewById(R.id.botonseis);
        botonsiete = findViewById(R.id.botonsiete);
        botonocho = findViewById(R.id.botonocho);
        botonnueve = findViewById(R.id.botonnueve);
        Btn_punto = findViewById(R.id.Btn_punto);
        Btn_igual = findViewById(R.id.Btn_igual);
        Btn_mas = findViewById(R.id.Btn_mas);
        Btn_menos = findViewById(R.id.Btn_menos);
        Btn_multi = findViewById(R.id.Btn_multi);
        Btn_DIVI = findViewById(R.id.Btn_DIVI);
        Btn_borrar = findViewById(R.id.Btn_borrar);


    }

    public void escribircero(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("0");
        }
        else {
            resultado.setText(resultado.getText() + "0");
        }
    }


    public void escribiruno(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("1");
        }
        else {
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void escribirdos(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("2");
        }
        else {
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void escribirtres(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("3");
        }
        else {
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void escribircuatro(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("4");
        }
        else {
            resultado.setText(resultado.getText() + "4");
        }
    }

    public void escribircinco(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("5");
        }
        else {
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void escribirseis(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("6");
        }
        else {
            resultado.setText(resultado.getText() + "6");
        }
    }

    public void escribirsiete(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("7");
        }
        else {
            resultado.setText(resultado.getText() + "7");
        }
    }

    public void escribirocho(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("8");
        }
        else {
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void escribirnueve(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        if (numero1 == 0.0f){
            resultado.setText("9");
        }
        else {
            resultado.setText(resultado.getText() + "9");
        }
    }

    public void limpiarresultado(View view) {
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operaion = "";
    }

    public void operaciondividir(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operaion = "/";
        resultado.setText("0");
    }

    public void operacionmultiplicar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operaion = "*";
        resultado.setText("0");
    }


    public void operacionrestar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operaion = "-";
        resultado.setText("0");
    }

    public void operacionsumar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operaion = "+";
        resultado.setText("0");
    }

    public void mostrarresultado(View view) {
        numero2 = Float.parseFloat(resultado.getText().toString());
        if (operaion.equals("/")){
            if (numero2 == 0.0f){
                resultado.setText("0");
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
            else {
                float result = numero1 / numero2;
                resultado.setText(result + "");
            }
        }

        else if (operaion.equals("*")){
            float result = numero1 * numero2;
            resultado.setText(result + "");
        }

        else if (operaion.equals("-")){
            float result = numero1 - numero2;
            resultado.setText(result + "");
        }

        else if (operaion.equals("+")){
            float result = numero1 + numero2;
            resultado.setText(result + "");
        }

        numero1 = 0.0f;
        numero2 = 0.0f;
        operaion = "";
    }

}