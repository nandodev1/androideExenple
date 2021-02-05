package com.example.helloword;

public class Operacoes {
    private float a;
    private float b;

    public Operacoes(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float somar(){
        return this.a + this.b;
    }

    public float subtrair(){
        return this.a - this.b;
    }

    public float multiplicar(){
        return this.a * this.b;
    }

    public float dividir(){
        return this.a / this.b;
    }
}
