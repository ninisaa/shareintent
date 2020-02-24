package com.example.user.pahlawanapps;

public class HeroesModel {
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(String heroDetail) {
        this.heroDetail = heroDetail;
    }

    public int getHeroPict() {
        return heroPict;
    }

    public void setHeroPict(int heroPict) {
        this.heroPict = heroPict;
    }

    String heroName, heroDetail;
    int heroPict;
}
