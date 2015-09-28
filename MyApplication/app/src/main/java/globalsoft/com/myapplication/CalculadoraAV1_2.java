package globalsoft.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class CalculadoraAV1_2  {


    //   Calcularexp("(10 + 32) * 3");



    public void Calcularexp(String exp) {



        /*try {
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName("JavaScript");
            Double d = Double.valueOf(engine.eval(exp).toString());
            String result = String.valueOf(d);

            //System.out.println(d);
            Log.d("oi", result);
        } catch (NumberFormatException | ScriptException e) {
            e.printStackTrace();
        }*/

    }
/*
    public static void main(String[] args){
        CalculadoraAV1_2 z = new CalculadoraAV1_2();
        z.Calcularexp("(10 + 32) * 3");



    }*/

}
