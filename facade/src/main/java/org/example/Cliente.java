package org.example;

public class Cliente {
    private DrinkFacade drinkFacade;

    public Cliente() {
        this.drinkFacade = new DrinkFacade();
    }

    public Drink solicitarMargarita() {
        return drinkFacade.createMargarita();
    }

    public Drink solicitarMojito() {
        return drinkFacade.createMojito();
    }

    public Drink solicitarPinaColadaSemAlcool() {
        return drinkFacade.createPinaColada();
    }
}
