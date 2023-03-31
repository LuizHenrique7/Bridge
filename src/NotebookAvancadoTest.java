import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookAvancadoTest {


    @Test
    public void deveRetornarNotebookAvancadoSemSSD() {
        Notebook notebook = new NotebookIntermediario(4000f);
        float precoEsperado = 4000f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }


    @Test
    public void deveRetornarNotebookAvancadoComSSDAvancado() {
        SSD ssd = new SSDAvancado();
        Notebook notebook = new NotebookAvancado(4000f);
        notebook.setSSD(ssd);
        float precoEsperado = 4300f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookAvancadoComSSDIntermediario() {
        Notebook notebook = new NotebookAvancado(4000f);
        SSD ssd = new SSDIntermediario();
        notebook.setSSD(ssd);
        float precoEsperado = 4200f;
        float precoCalculado = notebook.calcularPrecoTotal();// preço base (4000) + preço adicional do SSD intermediário (400)
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookAvancadoComSSDBasico() {
        Notebook notebook = new NotebookAvancado(4000f);
        SSD ssd = new SSDBasico();
        notebook.setSSD(ssd);
        float precoEsperado = 4100f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

}