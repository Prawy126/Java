package Zadanie2;

import Zadanie1.ValueNegativeException;

public class Pirania extends Zwierze implements IPlywanie, IDrapieznictwo{
    private int predkosc, glebokosc;
    @Override
    public void Atakuj() {
        System.out.println("Pirania atakuje");
    }

    @Override
    public void Plywaj(int predkosc, int glebokosc)throws ValueNegativeException {
        if(glebokosc<0){
            throw new ValueNegativeException(glebokosc);
        }else if(predkosc<0){
            throw new ValueNegativeException(predkosc);
        }else{
            this.glebokosc = glebokosc;
            this.predkosc = predkosc;
        }

    }

    @Override
    public void WyadjGlos() {
        System.out.println("Pirania wydaje glos");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Informacje o Piranii:");
        System.out.println("Gatunek: " + super.getGatunek());
        System.out.println("Nazwa: " + super.getNazwa());
        System.out.println("Prędkość pływania: " + this.predkosc);
        System.out.println("Głębokość pływania: " + this.glebokosc);
    }

    public Pirania(String gatunek,String nazwa,int wiek, int predkosc, int glebokosc) throws ValueNegativeException{
        super(gatunek,nazwa,wiek);
        if(glebokosc<0){
            throw new ValueNegativeException(glebokosc);
        }else if(predkosc<0){
            throw new ValueNegativeException(predkosc);
        }else{
            this.predkosc = predkosc;
            this.glebokosc = glebokosc;
        }

    }
}
