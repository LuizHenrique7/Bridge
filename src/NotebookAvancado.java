public class NotebookAvancado extends Notebook {

    public NotebookAvancado (float precoBase) {
        super(precoBase);
    }


    protected float calcularPrecoTotal() {
        float precoFinal = this.precoBase;
        if (this.ssd != null) {
            precoFinal += this.ssd.getPrecoAdicional();
        }
        return precoFinal;
    }
}