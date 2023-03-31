public abstract class Notebook {

    protected float precoBase;
    protected SSD ssd;

    public Notebook(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setSSD(SSD ssd) {
        this.ssd = ssd;
    }

    public SSD getSSD() {
        return ssd;
    }

    public final float calcularPrecoFinal() {
        return this.precoBase + this.ssd.getPrecoAdicional();
    }

    protected abstract float calcularPrecoTotal();
}