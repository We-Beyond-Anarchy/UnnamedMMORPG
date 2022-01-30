package example.item;

import example.ProtectionClassification;

public class Armor extends BaseItem{
    int baseDefence;
    ProtectionClassification multiplier;
    SlotType slot;
}

enum SlotType{
    face, full, shield
}
