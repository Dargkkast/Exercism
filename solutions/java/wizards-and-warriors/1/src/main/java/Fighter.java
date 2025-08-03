abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable()? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean vulnerable = true;
    
    @Override
    boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return vulnerable? 3 : 12;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        if (vulnerable) {
            vulnerable = !vulnerable;
        }
    }

}
