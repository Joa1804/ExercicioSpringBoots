package com.example.Exercicio.exeController;

@RestController
@RequestMapping("helloword")

public class ExemController {
       
    private ExemploService vamosservice;

   /* public ExemController(ExemploService vamosservice){
        this.vamosservice = vamosservice;
    }*/

    @PostMapping("")
    public String olaPost(@RequestBody User Body) {
        return "Hello World " +Body.getNome();
    }

    @GetMapping
    public String sonoconreoller(){
        return vamosservice.sonoconreoller("João");
    }
}
