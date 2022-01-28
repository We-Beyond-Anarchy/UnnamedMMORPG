package example;

import mindustry.gen.Player;

public class MPlayer {
    String playerName;
    String password;
    long experience;
    int xp;

    //TODO пересоздать на нормальный инвентарь со слотами
    Object inventory;
    Object armor; //сюда еще и слоты под тип экипировки
    //TODO пересоздать на нормальное оружие
    Object weapon;

    Player activeModel;


}
