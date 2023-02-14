package com.example.pruebatcnicalogin.util;

public class Singleton {
    private static Singleton objLogger;

    public String usuario;
    public String password;


    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuarios){
        usuario = usuarios;
    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String passwords){
        password = passwords;
    }
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (objLogger == null){
            objLogger = new Singleton();
        }
        return objLogger;
    }
}
