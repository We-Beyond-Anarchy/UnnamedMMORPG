package example;

import mindustry.game.Rules;

public class GameInit {
    public GameInit(){
        rules.blockDamageMultiplier=0f;
        rules.unitDamageMultiplier=0f;
    }

    public static Rules rules = new Rules();

}
