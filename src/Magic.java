class Magic extends Hero {
    public Magic() {
        super(100, 20, "удар мага");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + SuperAbility);
    }
}
