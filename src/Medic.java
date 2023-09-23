class Medic extends Hero {

    public Medic() {
        super(50, 6, "лечение");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил способность" + SuperAbility );
    }

}
