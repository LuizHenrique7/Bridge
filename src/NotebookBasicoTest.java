import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotebookBasicoTest {

    @Test
    public void deveRetornarNotebookBasicoSemSSD() {
        Notebook notebook = new NotebookBasico(2000f);
        float precoEsperado = 2000f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookBasicoComSSDIntermediario() {
        SSD ssd = new SSDIntermediario();
        Notebook notebook = new NotebookBasico(2000f);
        notebook.setSSD(ssd);
        float precoEsperado = 2200f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookBasicoComSSDAvancado() {
        SSD ssd = new SSDAvancado();
        Notebook notebook = new NotebookBasico(2000f);
        notebook.setSSD(ssd);
        float precoEsperado = 2300f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

    @Test
    public void deveRetornarNotebookBasicoComSSDBasico() {
        SSD ssd = new SSDBasico();
        Notebook notebook = new NotebookBasico(2000f);
        notebook.setSSD(ssd);
        float precoEsperado = 2100f;
        float precoCalculado = notebook.calcularPrecoTotal();
        assertEquals(precoEsperado, precoCalculado, 0.01f);
    }

}