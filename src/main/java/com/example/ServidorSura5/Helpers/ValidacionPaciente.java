package com.example.ServidorSura5.Helpers;

import com.example.ServidorSura5.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

//1.inyectar un objeto de la clase Modelo, es traer un clase y usarla dentro de otra

    private Paciente paciente = new Paciente();

//2. Creamos un metodo para cada campo que quiera validar

    public boolean validarNombres(String nombres){

        //1. se consulta una expresion regular almacenandola en una variable tipo String

        String expresionRegular="^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$ ";

        //2. activar el patron
        Pattern patron=Pattern.compile(expresionRegular);

        //3. se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(nombres);

        //4. inica si hubo o no coincidencia

        if (coincidencia.find()){
           return true;
        }else{
            return false;
        }
    }
    public boolean validarFechaNacimiento(LocalDate fecha){}

    public boolean validarCiudad(String ciudad){

        //1. se consulta una expresion regular almacenandola en una variable tipo String

        String expresionRegular="^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$ ";

        //2. activar el patron
        Pattern patron=Pattern.compile(expresionRegular);

        //3. se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(ciudad);

        //4. inica si hubo o no coincidencia

        if (coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public  boolean validarCorreo(String correo){

        //1. se consulta una expresion regular almacenandola en una variable tipo String

        String expresionRegular="^[a-zA-Z0-9._%+-]+@sura\\.com$";

        //2. activar el patron
        Pattern patron=Pattern.compile(expresionRegular);

        //3. se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(correo);

        //4. inica si hubo o no coincidencia

        if (coincidencia.find()){
            System.out.println("Nombre exitoso, cumple el patrón");
        }else{
            System.out.println("falla");
        }
    }

    public boolean validarTelefono(String telefono){

        //1. se consulta una expresion regular almacenandola en una variable tipo String

        String expresionRegular="^[0-9]+$";

        //2. activar el patron
        Pattern patron=Pattern.compile(expresionRegular);

        //3. se busca coincidencia entre la cadena y el patron

        Matcher coincidencia= patron.matcher(telefono);

        //4. inica si hubo o no coincidencia

        if (coincidencia.find()){
            System.out.println("Nombre exitoso, cumple el patrón");
        }else{
            System.out.println("falla");
        }
    }

    public boolean validarIps(String ips){}

    public boolean validarGrupoIngreso(String grupoIngreso){}

    public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){}

}
