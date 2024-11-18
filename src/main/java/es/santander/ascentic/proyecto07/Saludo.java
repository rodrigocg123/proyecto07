package es.santander.ascentic.proyecto07;

@Restcontroler 

public class Saludo {
    @GetMapping("/bienvenida")
    public String get(@RequestParam("nombre")String nombre) {
        return "hola" + nombre;
    }   

    @GetMapping("/calculadora")
    public long sumar(@RequestParam("s1") long s1, RequestParam("s2") long s2){
        return s1 + s2;
    }
}
