package modell;

public abstract class Jarmu {
    private int üzemanyag;
    private boolean beinditva;
    private boolean megérkezett;
    private boolean defekt;

    public Jarmu() {
        this.üzemanyag = 100;
        this.beinditva = false;
        this.megérkezett = false;
        this.defekt = false;
    }

    public boolean beindit() {
        this.beinditva = true;
        return beinditva;
    }
    
    public void leallit() {
        this.beinditva = false;
    }

    public void halad() {
        if (this.beinditva && !this.megérkezett && !this.defekt) {
            if (this.üzemanyag > 0) {
                this.üzemanyag -= 25;
                if (Math.random() < 0.25) {
                    this.defekt = true;
                }
            } else {
                this.megérkezett = true;
                this.beinditva = false;
                System.out.println("Megérkezett a céljához.");
            }
        } else if (this.defekt) {
            System.out.println("Nem lehet haladni, mert defektes a kereke.");
        } else if (this.megérkezett) {
            System.out.println("Nem lehet haladni, mert elérte a célját és elfogyott az üzemanyag.");
        } else {
            System.out.println("Nem lehet haladni, mert még nem indult el.");
        }
    }

    public void tankol() {
        if (!this.beinditva) {
            this.üzemanyag = 100;
            System.out.println("Az autó tankolva.");
        } else {
            System.out.println("Nem lehet tankolni, mert már beindult.");
        }
    }

    public void kerékcsere() {
        if (this.defekt) {
            this.defekt = false;
            System.out.println("A kerek cserélve.");
        } else {
            System.out.println("Nem szükséges cserélni a kereket, mert nem defektes.");
        }
    }

    public int getFuel() {
        return üzemanyag;
    }

    public boolean isStarted() {
        return beinditva;
    }

    public boolean isArrived() {
        return megérkezett;
    }

    public boolean vanDefekt() {
        return defekt;
    }
}
