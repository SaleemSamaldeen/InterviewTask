package Interfaces;

interface Animal {

    public static void dog() {

    }

    private void tiger() {

    }

    public abstract void fox();

    public void zebra();

    public void cat();

    void elephant();
}

interface Book extends Animal {

    public static void coverPage() {

    }

    public void content();

    public void titlePage();

    void conclusion();
}

class Wildlife implements Animal, Book {

    @Override
    public void fox() {

    }

    @Override
    public void zebra() {

    }

    @Override
    public void cat() {

    }

    @Override
    public void elephant() {

    }

    @Override
    public void content() {

    }

    @Override
    public void titlePage() {

    }

    @Override
    public void conclusion() {

    }
}
