package example.item;

import arc.struct.Seq;

public class BaseItem {
    String name;
    String description;
    int rarity;
    int cost;
    int minLvlRequested;
    Seq<Object> effects;
}
