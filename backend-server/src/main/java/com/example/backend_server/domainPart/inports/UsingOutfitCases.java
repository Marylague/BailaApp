package com.example.backend_server.domainPart.inports;


import com.example.backend_server.domainPart.models.Outfit;

public interface UsingOutfitCases {
    boolean deleteOutfit(Outfit outfit);
    Outfit getOutfit(Outfit outfit);
    Outfit createOutfit(Outfit outfit);
    Outfit updateOutfit(Outfit outfit);
}
