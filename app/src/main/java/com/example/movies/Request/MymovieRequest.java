package com.example.movies.Request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MymovieRequest extends StringRequest {

    final  static private String URL="http://35.223.196.237/Mymovie.php";
    private Map<String,String> parameters;
    public MymovieRequest(String ID, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("ID",ID);
    }

    @Override
    public Map<String,String> getParams(){
        return parameters;
    }
}
