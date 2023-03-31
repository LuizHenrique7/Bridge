import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookIntermediarioTest {



    @Test
    public void deveRetornarNotebookIntermediarioSemSSD() {
        Notebook notebook = new NotebookIntermediario(3000f);
        float precoEsperado = 3000f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }


    @Test
    public void deveRetornarNotebookIntermediarioComSSDAvancado() {
        SSD ssd = new SSDAvancado();
        Notebook notebook = new NotebookIntermediario(3000f);
        notebook.setSSD(ssd);
        float precoEsperado = 3300f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookIntermediarioComSSDBasico() {
        Notebook notebook = new NotebookIntermediario(3000f);
        SSD ssd = new SSDBasico();
        notebook.setSSD(ssd);
        float precoEsperado = 3100f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookIntermediarioComSSDIntermediario() {
        Notebook notebook = new NotebookIntermediario(3000f);
        SSD ssd = new SSDIntermediario();
        notebook.setSSD(ssd);
        float precoEsperado = 3200f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }


}